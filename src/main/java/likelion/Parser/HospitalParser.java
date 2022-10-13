package likelion.Parser;


import likelion.hospital.Hospital;
public class HospitalParser implements Parser<Hospital> {

    @Override
    public Hospital parse(String str) {
        str = str.replaceAll("\"", "");
        String[] splitted = str.split(",");
        // 0:id, 1:address
        return new Hospital(splitted[0], splitted[1]);
    }
}
