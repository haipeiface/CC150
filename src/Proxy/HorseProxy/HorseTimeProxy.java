package Proxy.HorseProxy;

public class HorseTimeProxy implements Eatable{

    Eatable eatable;

    public HorseTimeProxy(Eatable eatable) {
        this.eatable = eatable;
    }

    @Override
    public void eat() {
        long start = System.currentTimeMillis();
        eatable.eat();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
