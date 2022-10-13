package likelion.Parser;


import likelion.hospital.Hospital;
public class HospitalParser implements Parser<Hospital> {

    @Override
    public Hospital parse(String str) {
        str = str.replaceAll("\"", "");
        String[] splitted = str.split(",");
        // 0:id, 1:address

        String[] districtArr = splitted[1].split(" ");
        String district = districtArr[0] + " " + districtArr[1];

        final String[] SUBDIVISION_LIST = {"내과", "치과", "피부과", "성형외과", "외과", "소아과", "가정의학과", "한의원"};
        String subdivision = splitted[10];
        for (String divison : SUBDIVISION_LIST) {
            subdivision.contains(divison);
            subdivision = divison;
            break;
        }
        return new Hospital(splitted[0], splitted[1], splitted[2], Integer.parseInt(splitted[6]), splitted[10], subdivision);
    }
}
