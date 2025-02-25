import java.util.*;

public class GameCenter {
    
    // Method to get the neighbors of a cell
    public static List<int[]> getNeighbors(int x, int y, int N) {
        List<int[]> neighbors = new ArrayList<>();
        
        // Loop to find 8 possible neighbors
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                // Exclude the cell itself and ensure within bounds
                if (i != 0 || j != 0) {
                    int nx = x + i;
                    int ny = y + j;
                    if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                        neighbors.add(new int[]{nx, ny});
                    }
                }
            }
        }
        return neighbors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();  // Consume newline after the integer input
        
        int[][] grid = new int[N][N];
        
        // Reading the grid
        for (int i = 0; i < N; i++) {
            String[] line = sc.nextLine().split("#");
            for (int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(line[j]);
            }
        }
        
        int maxMinValue = Integer.MIN_VALUE;
        List<String> result = new ArrayList<>();

        // Check each cell in the grid
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                List<int[]> neighbors = getNeighbors(i, j, N);
                
                // Find the minimum value in the neighbors
                int minValue = grid[i][j]; // Start with the cell's own value
                for (int[] neighbor : neighbors) {
                    int nx = neighbor[0];
                    int ny = neighbor[1];
                    minValue = Math.min(minValue, grid[nx][ny]);
                }

                // Check if this is the best minimum value
                if (minValue > maxMinValue) {
                    maxMinValue = minValue;
                    result.clear();
                    result.add((i + 1) + "#" + (j + 1));
                }
                // If the minimum value matches the best one, store this position
                else if (minValue == maxMinValue) {
                    result.add((i + 1) + "#" + (j + 1));
                }
            }
        }

        // Join the result list manually and print it
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i));
            if (i < result.size() - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
