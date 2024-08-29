package lab01;

import java.util.List;
import java.util.UUID;

public class Room {
    private final UUID id;
    private String name;
    private List<Device> devices;

    public Room(String name) {
        this.id = UUID.randomUUID();
        this.name = name;

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

    public List<Device> getDevices() {
        return this.devices;
    }

    public void addDevice(Device device) {
        this.devices.add(device);
    }

    // TODO: toString
    // TODO: equals
    // TODO: hashCode
}
