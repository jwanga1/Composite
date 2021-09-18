import java.util.ArrayList;

public class InClass10 {
    public static void main(String[] args){

        AbstractFile root = new Directory("Top Level Directory");
        AbstractFile file1 = new File("File #1");
        AbstractFile dir2 = new Directory("Directory 2");
        AbstractFile file2 = new File("File #2");
        AbstractFile dir3 = new Directory("Directory 3");
        AbstractFile file3 = new File("File #3");
        AbstractFile dir4 = new Directory("Directory 4");
        AbstractFile file4 = new File("File #4");
        AbstractFile dir5 = new Directory("Directory 5");
        AbstractFile file5 = new File("File #5");
        AbstractFile dir6 = new Directory("Directory 6");
        AbstractFile file6 = new File("File #6");
        AbstractFile dir7 = new Directory("Directory 7");
        AbstractFile file7 = new File("File #7");
        root.add(file1);
        root.add(file2);
        root.add(dir2);
        root.add(dir3);
        dir2.add(file3);
        dir2.add(file4);
        dir3.add(file5);
        dir3.add(dir4);
        dir2.add(file6);
        dir2.add(dir5);
        dir5.add(file7);


        root.ls();

    }
}
