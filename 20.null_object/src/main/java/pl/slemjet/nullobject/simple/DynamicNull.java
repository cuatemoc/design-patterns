package pl.slemjet.nullobject.simple;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicNull {

    private static Object getReturn(Object proxy, Method method, Object[] args) throws IllegalAccessException, InstantiationException {
        if (method.getReturnType().equals(Void.TYPE)) {
            return null;
        } else {
            return method.getReturnType().newInstance();
        }
    }

    public static  <T> T getNoOp(Class<T> requiredType) {
        return (T) Proxy.newProxyInstance(
                requiredType.getClassLoader(),
                new Class[]{requiredType},
                DynamicNull::getReturn);
    }
}
