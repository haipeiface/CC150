package StaticProxy.RunoobDemo;

public class ProxyImage implements Image{
    private Image image;

    public ProxyImage(Image image) {
        this.image = image;
    }

    @Override
    public void display() {
        System.out.println("proxy image display...");
        image.display();
    }
}
