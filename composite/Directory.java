import java.util.ArrayList;

public class Directory implements AbstractFile {
    String name;
    ArrayList<AbstractFile> includedFiles = new ArrayList<AbstractFile>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println();
        System.out.println("Directory: " + this.name);
        System.out.println("------------------------------------");
        for (AbstractFile a : includedFiles) {
            if (a instanceof Directory)
            System.out.print(((Directory)a).name + "    ");
            else a.ls();
        }
        for (AbstractFile a : includedFiles) {
            if (a instanceof Directory) {
                System.out.println();
                a.ls();
            }
        }
    }

    public void add(AbstractFile file) {
        includedFiles.add(file);
    }
}
