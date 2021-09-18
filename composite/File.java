public class File implements AbstractFile {
    String name;

    public File(String name){
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.print("File: " + name + "   ");
    }

    @Override
    public void add(AbstractFile file) throws UnsupportedOperationException{
    }
}
