package Proxy.HorseProxy;

public class HorseLogProxy implements Eatable{

    Eatable eatable;

    public HorseLogProxy(Proxy.HorseProxy.Eatable eatable) {
        this.eatable = eatable;
    }

    @Override
    public void eat() {
        System.out.println("before eating...");
        eatable.eat();
        System.out.println("after eating...");
    }
}
