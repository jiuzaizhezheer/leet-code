import java.security.PublicKey;

//责任链模式
public class Ze {
    public static void main(String[] args) {
        //num在0到300（包含）之间
        int num1=55;
        int num2=155;
        int num3=255;
        Handler aa = new AA();
        Handler bb = new BB();
        Handler cc = new CC();
        Handler dd = new DD();
        //指定处理器链条
        aa.setNextHandler(bb);
        bb.setNextHandler(cc);
        cc.setNextHandler(dd);
        //测试
        aa.process(num1);
        aa.process(num2);
        aa.process(num3);
        //查看是否有下一个链条
        System.out.println(aa.hasNextHandler());
        System.out.println(bb.hasNextHandler());
        System.out.println(cc.hasNextHandler());
        System.out.println(dd.hasNextHandler());

    }
}


//定义一个处理器类

class Handler{
    private Handler nextHandler;
    //设置下一个处理器，形成处理器链
    public void setNextHandler(Handler nextHandler){
        this.nextHandler=nextHandler;
    }
    //判断是否有下一个处理器
    public boolean hasNextHandler(){
        return this.nextHandler != null;
    }
    //调用下一个处理器的方法
    public void process(int num){
        if (hasNextHandler()) {
            nextHandler.process(num);
        }
    }
}

class AA extends Handler{

    @Override
    public void process(int num) {
        System.out.println("执行加法");
        System.out.println(num = num + 1);
        super.process(num);
    }
}
class BB extends Handler{

    @Override
    public void process(int num) {
        System.out.println("执行减法");
        System.out.println(num = num - 1);
        super.process(num);
    }
}
class CC extends Handler{

    @Override
    public void process(int num) {
        System.out.println("执行乘法");
        System.out.println(num = num * 2);
        super.process(num);
    }
}
class DD extends Handler{

    @Override
    public void process(int num) {
        System.out.println("执行除法");
        System.out.println(num = num / 2);
        super.process(num);
    }
}