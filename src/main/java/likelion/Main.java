package likelion;



import likelion.Parser.HospitalParser;
import likelion.hospital.Hospital;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String fileName = "/Users/jinhyuck/Downloads/seoul_hospital_info.csv";
        List<Hospital> hospitals = hospitalLineReader.readLines(fileName);

        System.out.println(hospitals.size());
        for (Hospital hospital : hospitals) {
            System.out.println(hospital.getId());
        }

    }
}
