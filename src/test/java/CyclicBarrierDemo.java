import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by jdd on 2018/1/19.
 CountDownLatch和CyclicBarrier的主要联系和区别如下：
 1.闭锁CountDownLatch做减计数，而栅栏CyclicBarrier则是加计数。
 2.CountDownLatch是一次性的，CyclicBarrier可以重用。
 3.CountDownLatch强调一个线程等多个线程完成某件事情。CyclicBarrier是多个线程互等，等大家都完成。
 4.鉴于上面的描述，CyclicBarrier在一些场景中可以替代CountDownLatch实现类似的功能。
 */
public class CyclicBarrierDemo {

    private CyclicBarrier cb = new CyclicBarrier(4, new Runnable() {
        public void run() {
            System.out.println("当前线程"+Thread.currentThread().getName());
        }
    });
    private Random rnd = new Random();

    class TaskDemo implements Runnable{
        private String id;
        TaskDemo(String id){
            this.id = id;
        }

        public void run(){
            try {
                Thread.sleep(rnd.nextInt(1000));
                System.out.println("Thread " + id + " will wait");
                //System.out.println(cb.getNumberWaiting());
                cb.await();
                System.out.println("-------Thread " + id + " is over");
            } catch (InterruptedException e) {
            } catch (BrokenBarrierException e) {
            }
        }
    }

    public static void main(String[] args){
        CyclicBarrierDemo cbd = new CyclicBarrierDemo();
        ExecutorService es = Executors.newCachedThreadPool();
        es.submit(cbd.new TaskDemo("a"));
        es.submit(cbd.new TaskDemo("b"));
        es.submit(cbd.new TaskDemo("c"));
        es.submit(cbd.new TaskDemo("d"));
        es.shutdown();
    }
}
