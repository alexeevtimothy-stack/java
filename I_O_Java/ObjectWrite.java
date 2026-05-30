
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable {
    String name;
    transient int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        User user = new User("Ivan", 25);


        try (FileOutputStream fileOut = new FileOutputStream("user.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(user);
            System.out.println("Объект успешно записан в файл user.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
