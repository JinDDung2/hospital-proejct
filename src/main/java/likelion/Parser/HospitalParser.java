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

        final String[] SUBDIVISION_LIST = {"내과", "소아", "피부", "성형", "정형외과", "척추", "교정", "산부인과", "관절", "봉합", "화상", "골절", "영유아", "안과", "가정의학과", "비뇨기과", "치과", "의원", "한방병원", "병원", "외과"} ;
        String subdivision = splitted[10];
        for (String divison : SUBDIVISION_LIST) {
            if (subdivision.contains(divison))  {
                subdivision = divison;
                break;
            }
        }
        return new Hospital(splitted[0], splitted[1], splitted[2], Integer.parseInt(splitted[6]), splitted[10], subdivision);
    }
}
