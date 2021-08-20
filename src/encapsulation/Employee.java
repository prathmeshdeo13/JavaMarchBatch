package encapsulation;

public class Employee {

    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setId(12);
        employee.setName("Anand");
        employee.setAddress("Pune");

        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getAddress());

    }
}
