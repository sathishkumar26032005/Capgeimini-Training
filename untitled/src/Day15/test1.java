package Day15;

class count{
    int co=0;
    synchronized void inc(){
        co++;
    }
    int getCo(){
        return co;
    }
}
public class test1 {
    public static void main(String[] args) {
        count c=new count();
        Thread t=new Thread(()->{
            for (int i=0;i<1000;i++){
                c.inc();
            }
            System.out.println(Thread.currentThread().getName()+" "+c.getCo());
        },"Thread-1");
        Thread t1=new Thread(()->{
            for (int i=0;i<1000;i++){
                c.inc();
            }
            System.out.println(Thread.currentThread().getName()+" "+c.getCo());
        },"Thread-2");
        t.start();
        t1.start();
        try {
            t.join();
            t1.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
