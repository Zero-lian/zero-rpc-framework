package github.zero.proxy.staticProxy;

/**
 * @Desciption
 * @Author yucanlian
 * @Date 2020-11-05-22:32
 */
public class Main {
    public static void main(String[] args) {
        SmsServiceImpl smsService = new SmsServiceImpl();
        SmsProxy smsProxy = new SmsProxy(smsService);
        smsProxy.send("hello world!");
    }
}
