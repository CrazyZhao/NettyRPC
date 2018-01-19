import java.util.Collection;

/**
 * Created by jdd on 2017/10/10.
 */
public class CollectionGenTest<T extends Collection> {

    private T x;

    public CollectionGenTest(T x) {
        this.x = x;
    }


    public T getX() {
        return x;
    }


    public void setX(T x) {
        this.x = x;
    }
}
