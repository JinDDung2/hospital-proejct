package likelion;

import likelion.hospital.Hospital;

import java.io.*;
import java.util.List;

public class FileWriter {

    public void write(List<String> strs, String fileName) throws IOException {
        File file = new File(fileName);

        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(file), "utf-8"));

        for (String str : strs) {
            writer.write(str);
        }
        writer.close();
    }
}
