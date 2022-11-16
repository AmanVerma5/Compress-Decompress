/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author aman
 */
public class decompress {
    public static void method(File file) throws IOException
    {
        String FileDirectory=file.getParent();
        System.out.println(FileDirectory);
        FileInputStream fis=new FileInputStream(file);
        GZIPInputStream gzipIS=new GZIPInputStream(fis);
        FileOutputStream fos=new FileOutputStream(FileDirectory+ "\\ decompressed.txt");
        byte[] buffer=new byte[1024];
        int len;
        while((len=gzipIS.read(buffer))>0)
                {
                    fos.write(buffer,0,len);
                }
        gzipIS.close();
        fis.close();
        fos.close();
    }
    public static void main(String[] args) throws IOException
    {
        File path=new File("G:\\something\\compressedfile.gz");
        method(path);
    }
}
