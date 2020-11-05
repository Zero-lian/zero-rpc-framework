package github.zero.proxy.staticProxy;

/**
 * @Desciption
 * @Author yucanlian
 * @Date 2020-11-05-22:29
 */
public class SmsProxy implements SmsService {

    private SmsServiceImpl smsService;

    public SmsProxy(SmsServiceImpl smsService) {
        this.smsService = smsService;
    }

    public String send(String msg) {
        //调用方法前，添加业务逻辑
        System.out.println("before send ...");
        smsService.send(msg);
        //调用方法后，添加业务逻辑
        System.out.println("before send ...");
        return null;
    }
}
