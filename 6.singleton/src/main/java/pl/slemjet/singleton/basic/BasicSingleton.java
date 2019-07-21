package pl.slemjet.singleton.basic;

import java.io.Serializable;
import java.util.Objects;

public class BasicSingleton implements Serializable {

    // cannot new this class, however
    // * instance can be created deliberately (reflection)
    // * instance can be created accidentally (serialization)
    private BasicSingleton() {
        System.out.println("Singleton is initializing");
    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    private int value = 0;

    public int getValue()
    {
        return value;
    }
    public void setValue(int value)
    {
        this.value = value;
    }

    // required for correct serialization
    // readResolve is used for _replacing_ the object read from the stream
//  protected Object readResolve()
//  {
//    return INSTANCE;
//  }

    // generated getter
    public static BasicSingleton getInstance()
    {
        return INSTANCE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicSingleton that = (BasicSingleton) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
