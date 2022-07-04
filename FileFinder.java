import java.io.File;
import java.io.IOException;

public class FileFinder {
    public void getFiles(){
        File dirPath = new File("Input");
        File fileList[] = dirPath.listFiles();
        System.out.println("Heres your files: ");
        for(File file : fileList){
            System.out.println(file.getName());
        }
    }

}




