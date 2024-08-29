package lab01;

import java.util.List;
import java.util.UUID;

public class House {
    private final UUID id;
    private String name;
    private String address;
    private List<Room> rooms;

    public House(String name, String address) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.address = address;
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Room> getRooms() {
        return this.rooms;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }


    // TODO: toString
//    @Override
//    public String toString() {
////        return ""
//    }

    // TODO: equals

    // TODO: hashCode

}
