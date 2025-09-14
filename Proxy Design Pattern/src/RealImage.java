public class RealImage implements  Image{

    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        LoadFromDisk();
    }

    private void LoadFromDisk(){
        System.out.println("Loading 1000 Gb from disk ,heavy IO work");
        // heavy work , time consuming
    }

    @Override
    public void display() {
        System.out.println("The filename " + fileName);
    }
}
