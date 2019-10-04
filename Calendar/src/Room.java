import java.util.ArrayList;
import java.util.List;

/**
 * // TODO Comment
 */
public class Room {
  String name;
  List<String> bookedFor = new ArrayList<>();
  List<String> availableFor = new ArrayList<>();

  public Room(String r1) {
    this.name = r1;
  }

  public void bookRoom(List<String> invites) {
    for (String invite : invites) {
      if (!this.bookedFor.contains(invite)) {
        this.bookedFor.add(invite);
        this.availableFor.remove(invite);
      }
    }

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getBookedFor() {
    return bookedFor;
  }

  public void addToBookedFor(String bookedFor) {
    this.bookedFor.add(bookedFor);
  }

  public List<String> getAvailableFor() {
    return availableFor;
  }

  public void setAvailableFor(List<String> availableFor) {
    this.availableFor = availableFor;
  }
}
