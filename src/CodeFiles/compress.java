package CodeFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author aman
 */
public class compress {
    public static void method(File file) throws IOException{
        String fileDirectory=file.getParent();
        System.out.println(fileDirectory);
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(fileDirectory+ "\\compressedfile.gz");
        GZIPOutputStream gzipOS=new GZIPOutputStream(fos);
        byte[] buffer=new byte[1024];
        int len;
        while((len=fis.read(buffer))!=-1)
        {
            gzipOS.write(buffer,0,len);
        }
        fis.close();
        gzipOS.close();
        fos.close();
        
    }

    public static void main(String[] args) throws IOException {
        File path=new File("G:\\something\\text.txt");
        method(path);
        
    }
    
}
