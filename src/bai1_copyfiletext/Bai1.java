package bai1_copyfiletext;

import java.io.*;

public class Bai1 {
    public static void main(String[] args) {
        String line = null;
        try {
            File file = new File("src/bai1_copyfiletext/source.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            while ((line = reader.readLine()) != null) {
                FileWriter writer = new FileWriter("src/bai1_copyfiletext/target.txt");
                writer.write(line);
                writer.close();
            }
            reader.close();
        } catch (IOException i) {
            System.out.println("Lỗi xảy ra");
        }
    }
}

