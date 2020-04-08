package Proxy.ngief;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyHandler implements InvocationHandler{
    public <T> T bind(Class<T> target){
        return (T) Proxy.newProxyInstance(target.getClassLoader(),new Class[]{target}, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method toGenericString:"+method.toGenericString());
        System.out.println("method name:"+method.getName());
        System.out.println("method args:"+(String)args[0]);
        return null;
    }
}
