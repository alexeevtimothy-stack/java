import java.io.*;
import java.nio.charset.StandardCharsets;

class Main {
    void main(String[] Arg) {
        try{
            OutputStreamWriter wri=new OutputStreamWriter(new FileOutputStream("data.txt"), StandardCharsets.UTF_8);
            wri.write("абракадабра 😆😆😆😢💕😜💖🤔😃🤔🤔🤔");
            wri.close();


            InputStreamReader reader=new InputStreamReader(new FileInputStream("data.txt"), StandardCharsets.UTF_8);

            int symbol;

            while((symbol=reader.read())!=-1){
                System.out.print((char)symbol);
            }

            reader.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}



