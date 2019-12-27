package StaticProxy.ngief;

public class Main {
    public static void main(String args[]){
        Buhtig buhtig = Ngief.builder().target(Buhtig.class, "https://api.github.com");
        System.out.println(buhtig.contributors("owner"));
    }
}
