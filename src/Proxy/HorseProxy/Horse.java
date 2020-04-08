package Proxy.HorseProxy;

public class Horse implements Eatable{
    @Override
    public void eat() {

        try {
            System.out.println("horse eating...");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
