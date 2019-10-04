import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * // TODO Comment
 */
public class Calendar {
  static List<Employee> listOfEmployees = new ArrayList<>();
  static List<Room> listOfRooms = new ArrayList<>();
  static List<String> listOfInvites;

  public static void addEmployee(Employee emp) {
    listOfEmployees.add(emp);
  }

  public static void addRoom(Room room) {
    listOfRooms.add(room);
  }

  public static void main(String[] args) {

    Room r1 = new Room("R1");
    Room r2 = new Room("R2");
    Room r3 = new Room("R3");
    Room r4 = new Room("R4");
    addRoom(r1);
    addRoom(r2);
    addRoom(r3);
    addRoom(r4);

    Employee e1 = new Employee("Vikas");
    Employee e2 = new Employee("Ashish");
    Employee e3 = new Employee("Ramesh");

    addEmployee(e1);
    addEmployee(e2);
    addEmployee(e3);

    listOfInvites = new ArrayList<>();
    listOfInvites.add("9-10");
    listOfInvites.add("11-12");
    e1.createInvite(listOfInvites, r1);

    listOfInvites = new ArrayList<>();
    listOfInvites.add("9-10");
    listOfInvites.add("12-1");
    e2.createInvite(listOfInvites, r2);

    listOfInvites = new ArrayList<>();
    listOfInvites.add("2-3");
    e3.createInvite(listOfInvites, r3);


    System.out.printf("%s Meetings: %s for meeting room %s%n", e1.getName(), Arrays.toString(e1.getBusyTimes().toArray()), e1.getRoomName());
    System.out.printf("%s Meetings: %s for meeting room %s%n", e2.getName(), Arrays.toString(e2.getBusyTimes().toArray()), e2.getRoomName());
    System.out.printf("%s Meetings: %s for meeting room %s%n", e3.getName(), Arrays.toString(e3.getBusyTimes().toArray()), e3.getRoomName());

  }
}
