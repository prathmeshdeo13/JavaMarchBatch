package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
    int id;
    String empName;
    String empAddress;
    Integer empSalary;

    public StreamDemo1(int id, String empName, String empAddress, Integer empSalary) {
        this.id = id;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empSalary = empSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Integer getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Integer empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "StreamDemo1{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
class Employee1 {
    public static void main(String[] args) {

        StreamDemo1 employee = new StreamDemo1(1, "Aditya", "Hyderabad", 25000);
        StreamDemo1 employee1 = new StreamDemo1(1, "Riddhi", "Aurangabad", 40000);
        StreamDemo1 employee2 = new StreamDemo1(1, "Sakshi", "Pune", 37000);
        StreamDemo1 employee3 = new StreamDemo1(1, "Yogesh", "Solapur", 55000);

        List<StreamDemo1> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);


        List<Integer> list1 = list.stream()
                .map(m->m.empSalary*2)
                .collect(Collectors.toList());
                 System.out.println(list1);
//
//        list.stream()
//                .filter(f->f.empSalary>30000)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
//
//        list.stream()
//                .filter(f->f.getEmpSalary()>40000)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
    }
}