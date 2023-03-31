package bai1_copyfiletext;

import java.io.*;

public class Bai1 {
    public static void main(String[] args) {
        String line = null;
        try {
            File file = new File("src/bai1_copyfiletext/source.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            FileWriter writer = new FileWriter("src/bai1_copyfiletext/target.txt");
            BufferedWriter bw = new BufferedWriter(writer);
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            br.close();
        } catch (IOException i) {
            System.out.println("Lỗi xảy ra");
        }
    }
}

