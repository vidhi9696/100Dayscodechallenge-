import java.io.*;

//import java.util.*;
public class File{
    private static byte[][] newbyte;

    public static void main(String args[] )throws IOException{
        int size;
        InputStream f = new FileInputStream("vidhi.txt");
        System.out.println("Total Available  bytes:" +(size=f.available()));
        int n=size/40;
        System.out.println("first" +n+"bytes of the file one read() at a time ");
        //new FileInputStream(("");
        //System.out.println("total Available Bytes:" +(size =((Object) f).availabe()));
        for(int i=0; i<n; i++) {
            System.out.println((char)f.read());}
        System.out.println("\nStill Available: " +f.available());
        System.out.println("Reading the next"+n+" with one read(b[])");
        byte b[] =newbyte[n];
    }
}
