import java.io.*;
import java.util.zip.*;

class Main {
    void main(String[] args)  {
        String fileName = "test.txt";
        File fileToZip = new File(fileName);

        try (FileOutputStream fos = new FileOutputStream("archive.zip");
             ZipOutputStream zos = new ZipOutputStream(fos);
             FileInputStream fis = new FileInputStream(fileToZip)) {


            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zos.putNextEntry(zipEntry);


            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) >= 0) {
                zos.write(buffer, 0, length);
            }
            zos.closeEntry();


        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}


