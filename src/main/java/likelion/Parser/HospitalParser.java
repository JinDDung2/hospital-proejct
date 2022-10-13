package likelion.Parser;


import likelion.hospital.Hospital;
public class HospitalParser implements Parser<Hospital> {

    private String replaceAllOut(String str) {
        return str.replaceAll("\"", "");
    }
    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        return new Hospital(replaceAllOut(splitted[0]),replaceAllOut(splitted[1]));
    }
}
