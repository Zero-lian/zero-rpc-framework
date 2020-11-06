package github.zero.proxy.dynamicProxy.jdkdynamicProxy;

/**
 * @Desciption
 * @Author yucanlian
 * @Date 2020-11-06-8:04
 */
public class SmsServiceImpl implements SmsService {
    public String send(String msg) {
        System.out.println("send :" + msg);
        return msg;
    }
}
