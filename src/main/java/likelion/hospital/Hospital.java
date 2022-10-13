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

    public Hospital(String id) {
        this.id = id.replaceAll("\"", "");
    }

    public String getId() {
        return id;
    }
}
