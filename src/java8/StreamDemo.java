package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    int id;

    String name;

    String address;

    Integer salary;

    public StreamDemo(int id, String name, String address, Integer salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "StreamDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Employee {
    public static void main(String[] args) {

        StreamDemo streamDemo = new StreamDemo(1, "Govind", "Pune", 25000);
        StreamDemo streamDemo1 = new StreamDemo(2, "Neha", "Latur", 40000);
        StreamDemo streamDemo2 = new StreamDemo(3, "Akash", "Manglore", 32000);
        StreamDemo streamDemo3 = new StreamDemo(4, "Aditya", "Goa", 25000);

        List<StreamDemo> list = new ArrayList<>();
        list.add(streamDemo);
        list.add(streamDemo1);
        list.add(streamDemo2);
        list.add(streamDemo3);

        List<Integer> list1 = list.stream()
                .map(m -> m.salary * 2)
                .collect(Collectors.toList());

        System.out.println(list1);


        list.stream()
                .filter(f -> f.salary > 30000)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
