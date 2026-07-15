package Day14;

class mythread extends Thread{
    public void run(){
        /// code
        for (int i=1;i<=5;i++){
            System.out.println(i+" ");
            try{
                sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("  sasdssss  ");
                e.printStackTrace();
            }
        }

    }
}
class myrunable implements Runnable{
    public void run(){
        for (int i=10;i>5;i--){
            System.out.println(i+" ");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("catch black");

            }
        }
    }
}

public class MultiThread {

    public static void main(String[] args) {
        System.out.println("Before");
        mythread t1=new mythread();
        System.out.println("after");
        t1.start();
        System.out.println("Before");
        System.out.println("Main method end");

        Thread t=new Thread(new myrunable());
        t.start();

        Thread t3=new Thread(
                ()-> System.out.println("Lambada Thread")
        );
        t3.start();
    }
}
