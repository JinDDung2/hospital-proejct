package likelion;



import likelion.Parser.HospitalParser;
import likelion.hospital.Hospital;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String fileName = "/Users/jinhyuck/Downloads/seoul_hospital_info.csv";
        List<Hospital> hospitals = hospitalLineReader.readLines(fileName);
        

        System.out.println(hospitals.size());
        FileWriter writer = new FileWriter();
        List<String> strs = new ArrayList<>();

        for (Hospital hospital : hospitals) {
            strs.add(hospital.getSqlInsertQuery2());
            /*System.out.printf("%s, %s, %s, %s, %d, %s, %s \n",
                    hospital.getId(),
                    hospital.getAddress(),
                    hospital.getDistrict(),
                    hospital.getCategory(),
                    hospital.getEmergencyRoom(),
                    hospital.getName(),
                    hospital.getSubdivision());*/
        }

        writer.write(strs, "hospital_data.sql");
    }
}
