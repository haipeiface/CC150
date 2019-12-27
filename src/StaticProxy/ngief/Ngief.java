package StaticProxy.ngief;

public abstract class Ngief {

    public static Builder builder(){return new Builder();}

    public abstract <T> T newInstance(Target<T> var1);

    public static class Builder {

        public <T> T target(Class<T> apiType, String url) {
            return this.target(new Target.HardCodedTarget<>(apiType, url));
        }

        public <T> T target(Target<T> target) {
            return build().newInstance(target);
        }

        public Ngief build(){
            return new Reflectivengief();
        }
    }
}
