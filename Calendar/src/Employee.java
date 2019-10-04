import java.util.ArrayList;
import java.util.List;

/**
 * // TODO Comment
 */
public class Employee {

  String name;
  List<String> availability = new ArrayList<>();
  List<String> busyTimes = new ArrayList<>();
  private String roomName;

  public String getRoomName() {
    return roomName;
  }

  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }

  public Employee(String name) {
    this.name = name;

    this.availability.add("8-9");
    this.availability.add("9-10");
    this.availability.add("10-11");
    this.availability.add("11-12");
    this.availability.add("12-1");
    this.availability.add("2-3");
    this.availability.add("3-4");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getAvailability() {
    return availability;
  }

  public void setAvailability(List<String> availability) {
    this.availability = availability;
  }

  public List<String> getBusyTimes() {
    return busyTimes;
  }

  public void setBusyTimes(List<String> busyTimes) {
    this.busyTimes = busyTimes;
  }

  public void createInvite(List<String> invites, Room room) {
    for (String invite : invites) {
      if (!this.busyTimes.contains(invite)) {
        this.busyTimes.add(invite);
        this.availability.remove(invite);
        room.addToBookedFor(invite);
        this.roomName = room.getName();
      }
    }

  }

}
