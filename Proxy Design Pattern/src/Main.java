public class Main {
    public static void main(String[] args) {
//        Image img1 = new RealImage("f1");
//        Image img2 = new RealImage("f2");

//        System.out.println("All images are created but never used");
//
//        img1.display();
//        img1.display();

        Image p1 = new ProxyImage("f45");
        Image p2 = new ProxyImage("f89");

        System.out.println("Images are just created but not loaded yet");

        p1.display();
        p2.display();
        p1.display();

    }
}