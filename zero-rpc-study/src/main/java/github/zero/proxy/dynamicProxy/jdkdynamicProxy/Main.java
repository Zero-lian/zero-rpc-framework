package github.zero.proxy.dynamicProxy.jdkdynamicProxy;

/**
 * @Desciption
 * @Author yucanlian
 * @Date 2020-11-06-8:13
 */
public class Main {
    public static void main(String[] args) {
         SmsService smsService=(SmsService)  JdkProxyFactory.getProxy(new SmsServiceImpl());
         smsService.send("zero");
    }
}
