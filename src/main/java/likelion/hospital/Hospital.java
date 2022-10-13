package likelion.hospital;

public class Hospital{

    private String id;                  // [0]
    private String address;             // [1]
    private String district;            // [1] 수정
    private String category;            // [2]
    private Integer emergencyRoom;     // [6]
    private String name;                // [10]
    private String subdivision;         // [10] 수정

    public Hospital(String id, String address) {
        this.id = id;
        this.address = address;
        String[] splitted = address.split(" ");
        this.district = String.format("%s %s", splitted[0], splitted[1]);
    }

    public Hospital(String id, String address, String category, Integer emergency_room, String name, String subdivision) {
        this.id = id;
        this.address = address;
        this.category = category;
        this.emergencyRoom = emergency_room;
        this.name = name;
        this.subdivision = subdivision;
        setDistrict();
    }

    public String getSqlInsertQuery() {
        String sql = String.format("INSERT INTO `likelion-db`.`seoul_hospital`\n" +
                "(`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`)\n" +
                "VALUES\n" +
                "(\"%s\",\n" +
                "\"%s\",\n" +
                "\"%s\",\n" +
                "\"%s\",\n" +
                "%d\",\n" +
                "\"%s\",\n" +
                "\"%s\");", this.id, this.address, this.district, this.category, this.emergencyRoom, this.name, this.subdivision);
        return sql;
    }

    private void setDistrict() {
        String[] splitted = this.address.split(" ");
        this.district = String.format("%s %s", splitted[0], splitted[1]);
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCategory() {
        return category;
    }

    public Integer getEmergencyRoom() {
        return emergencyRoom;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }
}
