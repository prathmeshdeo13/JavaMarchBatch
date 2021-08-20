package encapsulation;


public class StudentDemo {
    private int rollNo;
    private String name;
    private String address;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
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
    StudentDemo studentDemo = new StudentDemo();
    studentDemo.setRollNo(13);
    studentDemo.setName("Kanchan Khadke");
    studentDemo.setAddress("Latur");
        System.out.println(studentDemo.getRollNo());
        System.out.println(studentDemo.getName());
        System.out.println(studentDemo.getAddress());
    }
}