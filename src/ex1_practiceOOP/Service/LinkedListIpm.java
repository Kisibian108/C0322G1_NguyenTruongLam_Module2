package ex1_practiceOOP.Service;

import ex1_practiceOOP.Model.Manager;
import ex1_practiceOOP.Model.Operator;
import ex1_practiceOOP.Model.Person;
import ex1_practiceOOP.Model.ProductionStaff;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListIpm {
    static Scanner scanner = new Scanner(System.in);
    static List<Person> list = new LinkedList<>();
    static {
        list.add(new Manager("Lam", 1992, "HaTinh", 10000000, 3.14));
        list.add(new Manager("Linh", 1989, "Da Nang", 12000000, 3.41));
        list.add(new Operator("Nam", 1943, "Quang Nam", 15));
        list.add(new Operator("Ngoc", 1992, "Ha Noi", 15));
        list.add(new ProductionStaff("Hoa", 1987,"Hai Phong", 19));
        list.add(new ProductionStaff("Hien", 1995, "Ha Tinh", 25));
    }

    public static void main(String[] args) {
        for (Person person: list) {
            if (person != null)
                System.out.println(person);
        }
    }
    // ii Có nên dùng vòng lặp truyền thống (for i = 0 -> size() – 1 => get(i))
    // để duyệt qua từng phần tử có trong LinkedList hay không? Lý do?
    // ko nen vi linkedlist luu du lieu theo cac node, neu lam vay phai duyet tu dau den cuoi
    // trong khi co the truy cap truc tiep thong qua get ....

   // Giả sử công ty ABC thay đổi nhân sự liên tục (xóa và thêm nhân viên) thì nên sử dụng ArrayList hay LinkedList? Lý do?
   // nen su dung linkedlist se xoa nhanh hon vi linked co the be gay lien ket giua node can xoa va node lien ke
    // trong khi arraylist phai dich chuyen toan bo phan tu phia sau ve phia trua 1 vi tri

    //Ưu và nhược điểm của ArrayList và LinkedList.
    // arraylist duyet qua cac phan tu nhanh hon trong khi linkedlist xoa, chen cac phan tu nhanh hon
    // arraylist dung cho cac du lieu hay tim kiem , it thay doi
    // linkedlist dung cho cac du lieu it tim kiem, hay them xoa

    //Suy nghĩ xem class cha có cần phương thức abstract không? Vì sao?
    //

}
