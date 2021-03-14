public class Singleton {
    public static class Db {
        private static Db instance;
        private Db() {
        }
        public static Db getInstance() {
            if (instance==null) {
                instance = new Db();
            }
            return instance;
        }
    }
}