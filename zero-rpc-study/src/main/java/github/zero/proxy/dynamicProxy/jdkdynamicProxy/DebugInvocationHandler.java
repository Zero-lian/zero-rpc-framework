package github.zero.proxy.dynamicProxy.jdkdynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Desciption
 * @Author yucanlian
 * @Date 2020-11-06-8:05
 */
public class DebugInvocationHandler implements InvocationHandler {

    //代理类中的真实对象
    private  Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用方法前，添加业务逻辑
        System.out.println("before send:"+method.getName());
        Object result = method.invoke(target, args);
        //调用方法后，添加业务逻辑
        System.out.println("before send:"+method.getName());
        return null;
    }
}
