public class ProxyImage implements  Image{

    private RealImage realImage;
    private  final String filename;

    public ProxyImage(String filename){
        this.filename = filename;
        //notice : No loading yet
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
