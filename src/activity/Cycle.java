package activity;

public class Cycle extends Thread{
    Activity a;
    int n;
    public Cycle(Activity a, int n){
        this.a = a;
        this.n = n;
    }
    @Override
    public void run(){
        try{
            Thread ta;
            for(int i=0; i<this.n; i++) {
                System.out.println("-----");
                ta = new Thread(this.a);
                ta.start();
                sleep(3000);
                if(ta.isAlive()) {
                    ta.interrupt();
                    ta.join();
                }
                System.out.println("-----\n");
            }
        } catch (InterruptedException e){
            System.out.println("\u001B[31m" + "Cycle blocked" + "\u001B[0m");
        }
    }
}
