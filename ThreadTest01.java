public class maipiao {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        Thread t1 = new Thread(m,"A");
        Thread t2 = new Thread(m,"B");
        Thread t3 = new Thread(m,"C");
        t1.start();
        t2.start();
        t3.start();
    }
}
class MyThread implements Runnable{
    private int ti = 200;
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            if(ti>0){
                System.out.println(Thread.currentThread().getName()+"卖了第"+ti--+"张票");
            }
        }

    }
}
