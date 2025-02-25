class HydraHead implements Runnable {
    private String headName;

   
    public HydraHead(String headName) {
        this.headName = headName;
    }

    
    @Override
    public void run() {
        System.out.println(headName + " is attacking!");
        try {
            
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(headName + " was interrupted.");
        }
        System.out.println(headName + " finished attacking.");
    }
}

public class BattleofThreads {
    public static void main(String[] args) {
       
        Thread head1 = new Thread(new HydraHead("Hydra Head 1"));
        Thread head2 = new Thread(new HydraHead("Hydra Head 2"));
        Thread head3 = new Thread(new HydraHead("Hydra Head 3"));

        
        head1.start();
        head2.start();
        head3.start();

       
        try {
            head1.join();
            head2.join();
            head3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("The hydra has finished its simultaneous attacks!");
    }
}
