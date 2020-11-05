package github.zero.proxy;

/**
 * @Desciption
 * @Author yucanlian
 * @Date 2020-11-05-21:59
 */
public class Test4_25 {
    public static void main(String[] args) {
        jianshiqi jianshiqi_1 = new jianshiqi(true,false);
        jianshiqi_1.needfix();
        jianshiqi jianshiqi_2 = new jianshiqi(false,true);
        jianshiqi_2.needfix();
        jianshiqi jianshiqi_3 = new jianshiqi(false,false);
        jianshiqi_3.needfix();
    }
}

class jianshiqi{
    private boolean mohe;//墨盒
    private boolean lastPrint;//最后一次打印

    public jianshiqi() {
    }

    public jianshiqi(boolean mohe, boolean lastPrint) {
        this.mohe = mohe;
        this.lastPrint = lastPrint;
    }

    public boolean needfix(){
        if (mohe || lastPrint){
            return true;
        }else {
            return false;
        }
    }
}