package github.zero.proxy.staticProxy;

/**
 * @Desciption 短信接口实现类
 * @Author yucanlian
 * @Date 2020-11-05-22:27
 */
public class SmsServiceImpl implements SmsService {
    public String send(String msg) {
        System.out.println("send :"+msg);
        return msg;
    }
}
