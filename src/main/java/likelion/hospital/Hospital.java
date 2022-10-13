package likelion.hospital;

public class Hospital{

    /*id(Pk)
    address
    district
    category
    emergency_room
    name
    subdivision*/

    private String id;
    private String address;
    private String district;
    private String category;
    private Integer emergency_room;
    private String name;
    private String subdivision;

    public Hospital(String id, String address) {
        this.id = id;
        this.address = address;
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

    public Integer getEmergency_room() {
        return emergency_room;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }
}
