package StaticProxy.ngief;

public class Reflectivengief extends Ngief {
    @Override
    public <T> T newInstance(Target<T> target) {

        MyHandler handler = new MyHandler();
        return handler.bind(target.type());
    }
}
