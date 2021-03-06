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
    // Suy ngh?? xem class cha c?? c???n ph????ng th???c abstract kh??ng? V?? sao?
    // Co can de cac class con implement lai phuong thuc tinh luong theo cac cach khac nhau

    //Suy ngh?? xem ph???i t???o ra m???t interface c?? ph????ng th???c l?? ch???m c??ng r???i cho nh??n vi??n qu???n l?? v?? nh??n vi??n s???n xu???t implements l???i ph????ng th???c n??y, hay l?? vi???t ph????ng th???c abstract ??? class cha? V?? sao?
    //Tao ra 1 interface de tien cho viec cham cong , vi chi co manage va operator can cham cong

    //Suy ngh?? xem khi n??o n??n d??ng interface, khi n??o n??n d??ng abstract class, khi n??o c???n c?? ph????ng th???c abstract ??? class cha?
    // Dung interface khi muon tao mot hanh vi chung cho cac nhom doi tuong, dung abstract class
    // khi cac class con can implement lai 1 phuong thuc cua lop cha ma cac lop con co cach trien khai khac nhau
//
//    Mu???n s??? d???ng comparator th?? c???n l??m g???
    //Can tao 1 class comparator rieng va trien khai phuong thuc compare
//    Mu???n s??? d???ng comparable th?? c???n l??m g???
    // Implement interface comparable va trien khai phuong thuc compareTo
    //

//    S???p x???p nh??n vi??n theo l????ng t??ng d???n
//    Suy ngh?? xem n??n s??? d???ng Comparable hay Comparator? V?? sao?
    // Nen su dung comparator vi co the so sanh theo nhieu tieu chi
//    Suy ngh?? xem n???u ch??? s??? d???ng Comparable th?? c?? ???????c kh??ng? V?? sao?
    // Duoc , viet phuong thuc comparable ngay trong class can so sanh
//    Suy ngh?? xem n???u ch??? s??? d???ng Comparator th?? c?? ???????c kh??ng? V?? sao?
    // Duoc, nen dung cach nay vi comparator ho tro so sanh 1 hoac nhieu tieu chi

//    S???p x???p nh??n vi??n theo l????ng t??ng d???n n???u l????ng b???ng nhau th?? s???p x???p theo t??n gi???m d???n
//    Suy ngh?? xem n??n s??? d???ng Comparable hay Comparator? V?? sao?
//      Nen su dung comparator vi comparator co the so sanh theo nhieu tieu chi
//    Suy ngh?? xem n???u ch??? s??? d???ng Comparable th?? c?? ???????c kh??ng? V?? sao?
    // Ko duoc vi comparable chi ho tro so sanh 1 tieu chi
//    Suy ngh?? xem n???u ch??? s??? d???ng Comparator th?? c?? ???????c kh??ng? V?? sao?
// // Duoc, comparator ho tro so sanh  nhieu tieu chi
//
//    C?? menu ????? ng?????i d??ng ch???n vi???c s???p x???p (Ch???n 1 ????? s???p x???p theo l????ng t??ng d???n, ch???n 2 ????? s???p x???p theo t??n t??ng d???n)
//    Suy ngh?? xem n??n s??? d???ng Comparable hay Comparator? V?? sao?
    // nen chon comparator
//    Suy ngh?? xem n???u ch??? s??? d???ng Comparable th?? c?? ???????c kh??ng? V?? sao?
    // ko duoc vi comparable chi so sanh dc 1 tieu chi trong 1 class
//    Suy ngh?? xem n???u ch??? s??? d???ng Comparator th?? c?? ???????c kh??ng? V?? sao?
    // Duoc vi comparator ho tro so sanh nhieu tieu chi
//    Suy ngh?? xem khi n??o b???t bu???c ph???i s??? d???ng Comparator?
    // khi can so sanh >=2 tieu chi
//    Suy ngh?? xem khi n??o ch??? c???n d??ng Comparable?
    // Khi chi so sanh 1 tieu chi
//    N??u s??? kh??c nhau gi???a Comparator v?? Comparable?
    // Comparator trien khai compare, tao 1 class khac de trien khai, ho tro so sanh nhieu tieu chi
    // Comparable trien khai compareTo, trien khai ngay trong class, chi so sanh dc 1 tieu chi









}
