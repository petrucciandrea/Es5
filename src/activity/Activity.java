package activity;

public class Activity implements Runnable{
    protected int n=0;
    protected int time;

    public Activity (){
        this.n = 0;
    }

    @Override
    public void run(){
        try{
            System.out.println("Activity " + n + " start");
            this.time = (Math.random() < 0.5) ? 2000 : (int)(Math.random()*20)*100+2000;
            n++;
            Thread.sleep(time);
            System.out.println("\u001B[32m" + "Activity " + (n-1) + " end in " + time + "\u001B[0m");
        }catch(InterruptedException e){
            System.out.println("\u001B[31m" + "Activity " + (n-1) + " blocked for " + time + "\u001B[0m");
        }
    }
}
