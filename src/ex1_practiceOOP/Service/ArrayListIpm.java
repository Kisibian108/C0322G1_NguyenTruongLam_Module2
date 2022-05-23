package ex1_practiceOOP.Service;

import ex1_practiceOOP.Model.Manager;
import ex1_practiceOOP.Model.Operator;
import ex1_practiceOOP.Model.Person;
import ex1_practiceOOP.Model.ProductionStaff;

import java.util.*;

public class ArrayListIpm {

    static List<Person> list = new ArrayList<>();

    static {

        list.add(new Manager("An", 1992, "HaTinh", 12000000, 3.41));
        list.add(new Manager("Linh", 1989, "Da Nang", 12000000, 3.41));
        list.add(new Operator("Xuan", 1943, "Quang Nam", 15));
        list.add(new Operator("Ngoc", 1992, "Ha Noi", 12));
        list.add(new ProductionStaff("Hoa", 1987, "Hai Phong", 10));
        list.add(new ProductionStaff("Hien", 1995, "Ha Tinh", 15));

    }

    public static void sortBySalary() {
        Collections.sort(list, new ComparatorSalary());
        for (Person person : list) {
            if (person != null)
                System.out.println(person);
        }
    }

    public static void sortByName() {
        Collections.sort(list, new ComparatorByName());
        for (Person person : list) {
            if (person != null)
                System.out.println(person);
        }
    }

    static Map<Integer, Person> map = new TreeMap<>();

    static {
        map.put(1, new Manager("An", 1992, "HaTinh", 12000000, 3.41));
        map.put(2, new Manager("Linh", 1989, "Da Nang", 12000000, 3.41));
        map.put(3, new Operator("Xuan", 1943, "Quang Nam", 15));
        map.put(4, new Operator("Ngoc", 1992, "Ha Noi", 12));
        map.put(5, new ProductionStaff("Hoa", 1987, "Hai Phong", 10));
        map.put(6, new ProductionStaff("Hien", 1995, "Ha Tinh", 15));
    }

    public static void display() {
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }
    }

    public static void isExist() {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        System.out.println("Nhap key");
        int keySearch = Integer.parseInt(scanner.nextLine());
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            if (key == keySearch) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Da ton tai");
        } else {
            System.out.println("Chua ton tai");
        }
    }

    public static void main(String[] args) {
        isExist();
        display();
    }

    // i arraylist ko can khoi tao phan tu truoc vi no co the thay doi kich thuoc khi them phan tu vao
    // j neu co 1001 phan tu thi ko van de j, array list se tu mo rong them 50%
    // uu nhuoc diem cua arraylist so voi array
    // arraylist ko can khoi tao kich thuoc , nhuoc diem la cham hon array
    // arraylist truy xuat phan tu nhanh hon, co nhieu phuong thuc de thao tac nhu get, add ...
    // array chi co thuoc tinh length
    // arraylist chi luu giu duoc kieu du lieu doi tuong ( co che auto boxing chuyen KDL nguyen thuy sang doi tuong bang wrapper class)
    // , array thi ca nguyen thuy va doi tuong
    // Suy nghĩ xem class cha có cần phương thức abstract không? Vì sao?
    // Co can de cac class con implement lai phuong thuc tinh luong theo cac cach khac nhau

    //Suy nghĩ xem phải tạo ra một interface có phương thức là chấm công rồi cho nhân viên quản lý và nhân viên sản xuất implements lại phương thức này, hay là viết phương thức abstract ở class cha? Vì sao?
    //Tao ra 1 interface de tien cho viec cham cong , vi chi co manage va operator can cham cong

    //Suy nghĩ xem khi nào nên dùng interface, khi nào nên dùng abstract class, khi nào cần có phương thức abstract ở class cha?
    // Dung interface khi muon tao mot hanh vi chung cho cac nhom doi tuong, dung abstract class
    // khi cac class con can implement lai 1 phuong thuc cua lop cha ma cac lop con co cach trien khai khac nhau
//
//    Muốn sử dụng comparator thì cần làm gì?
    //Can tao 1 class comparator rieng va trien khai phuong thuc compare
//    Muốn sử dụng comparable thì cần làm gì?
    // Implement interface comparable va trien khai phuong thuc compareTo
    //

//    Sắp xếp nhân viên theo lương tăng dần
//    Suy nghĩ xem nên sử dụng Comparable hay Comparator? Vì sao?
    // Nen su dung comparator vi co the so sanh theo nhieu tieu chi
//    Suy nghĩ xem nếu chỉ sử dụng Comparable thì có được không? Vì sao?
    // Duoc , viet phuong thuc comparable ngay trong class can so sanh
//    Suy nghĩ xem nếu chỉ sử dụng Comparator thì có được không? Vì sao?
    // Duoc, nen dung cach nay vi comparator ho tro so sanh 1 hoac nhieu tieu chi

//    Sắp xếp nhân viên theo lương tăng dần nếu lương bằng nhau thì sắp xếp theo tên giảm dần
//    Suy nghĩ xem nên sử dụng Comparable hay Comparator? Vì sao?
//      Nen su dung comparator vi comparator co the so sanh theo nhieu tieu chi
//    Suy nghĩ xem nếu chỉ sử dụng Comparable thì có được không? Vì sao?
    // Ko duoc vi comparable chi ho tro so sanh 1 tieu chi
//    Suy nghĩ xem nếu chỉ sử dụng Comparator thì có được không? Vì sao?
// // Duoc, comparator ho tro so sanh  nhieu tieu chi
//
//    Có menu để người dùng chọn việc sắp xếp (Chọn 1 để sắp xếp theo lương tăng dần, chọn 2 để sắp xếp theo tên tăng dần)
//    Suy nghĩ xem nên sử dụng Comparable hay Comparator? Vì sao?
    // nen chon comparator
//    Suy nghĩ xem nếu chỉ sử dụng Comparable thì có được không? Vì sao?
    // ko duoc vi comparable chi so sanh dc 1 tieu chi trong 1 class
//    Suy nghĩ xem nếu chỉ sử dụng Comparator thì có được không? Vì sao?
    // Duoc vi comparator ho tro so sanh nhieu tieu chi
//    Suy nghĩ xem khi nào bắt buộc phải sử dụng Comparator?
    // khi can so sanh >=2 tieu chi
//    Suy nghĩ xem khi nào chỉ cần dùng Comparable?
    // Khi chi so sanh 1 tieu chi
//    Nêu sự khác nhau giữa Comparator và Comparable?
    // Comparator trien khai compare, tao 1 class khac de trien khai, ho tro so sanh nhieu tieu chi
    // Comparable trien khai compareTo, trien khai ngay trong class, chi so sanh dc 1 tieu chi









}
