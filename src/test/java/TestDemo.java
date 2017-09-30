/**
 * Created by jdd on 2017/9/30.
 */
public class TestDemo {

    static class Test<T> {
        private T ob;

        public Test(T ob) {
            this.ob = ob;
        }

        public T getOb() {
            return ob;
        }

        public void setOb(T ob) {
            this.ob = ob;
        }

        public void showType(){
            System.out.println("T的实际类型是：" + ob.getClass().getName());
        }
    }

    public static void main(String[] args) {
        Test<Integer> intOb = new Test<Integer>(88);
        intOb.showType();
    }
}
