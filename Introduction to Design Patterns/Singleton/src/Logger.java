public class Logger {
    private static  volatile Logger instance;


    // lazy loading , thread safety and volatile

    private Logger(){};

    public  static Logger getInstance(){
       if (instance == null){
           synchronized (Logger.class){
               if (instance == null){
                   instance =new Logger();
               }
           }
       }
        return instance;
    }
}
