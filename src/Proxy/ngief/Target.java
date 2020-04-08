package Proxy.ngief;

public interface Target<T> {
    Class<T> type();

    String name();

    String url();

    public static class HardCodedTarget<T> implements Target<T> {
        private final Class<T> type;
//        private final String name;
        private final String url;

        public HardCodedTarget(Class<T> type, String url) {
            this.type = type;
            this.url = url;
        }


        @Override
        public Class<T> type() {
            return type;
        }

        @Override
        public String name() {
            return null;
        }

        @Override
        public String url() {
            return url;
        }
    }
}
