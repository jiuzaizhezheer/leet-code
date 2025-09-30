//工厂加策略模式
abstract class Car{
    Celue celue ;
     void fly(){
       celue.fly();
    }
     void run(){
        System.out.println("我能启动");
    }
    abstract void color();
}
class A extends Car{
    public A(Celue celue) {
       super.celue=celue;
    }

    @Override
    public void color() {
        System.out.println("我是绿色");
    }
}

class B extends Car{
    public B(Celue celue) {
        super.celue=celue;
    }

    @Override
    public void color() {
        System.out.println("我是蓝色");
    }
}

interface Celue{
    void fly();
}
class Celue1 implements Celue{

    @Override
    public void fly() {
        System.out.println("我会飞");
    }
}

class Celue2 implements Celue{

    @Override
    public void fly() {
        System.out.println("我不会飞");
    }
}

class Factory{
    public static Car produce(String type,Celue celue){
        switch (type){
            case "A":
                return new A(celue);
            case "B":
                return new B(celue);
            default:
                return null;
        }
    }
}

class Tes{
    public static void main(String[] args) {
        Car a = Factory.produce("c", new Celue2());
        if(a==null){
            System.out.println("找不到该对象");
        return;
        }
        a.fly();
        a.color();
        a.run();
    }
}