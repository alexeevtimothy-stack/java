import java.io.*;
import java.util.zip.*;

class Main {
    void main(String[] args) {

        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("archive.zip"))) {

            ZipEntry entry;

            while ((entry = zis.getNextEntry()) != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(zis));


                String line;


                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                zis.closeEntry();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

