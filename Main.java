import java.math.*;
import java.util.Scanner; //console for debugging
import java.io.*;


public class Main{
    static StringBuilder builder;
    
    static StringBuilder ispdf(String filename){
        builder = new StringBuilder(filename);
        builder.reverse();
        return builder;        
    }

    public static void main(String[]args){
        String folder = "Input";
        int i = 0;
        for (i = 0; i != 10; i++){
            
        }        
        File file = new File(folder + "pdf");
        String filename = file.getName();
        System.out.println(ispdf(filename));
        
    }
}