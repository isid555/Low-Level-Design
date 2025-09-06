import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Singleton s1 = Singleton.getInstance();
//
//
//
//// Serialize
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
//        oos.writeObject(s1);
//
//// Deserialize
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
//        Singleton s2 = (Singleton) ois.readObject();
//
//
//        System.out.println(s1 == s2);

        Loger.INSTANCE.log("Hello");


    }
}