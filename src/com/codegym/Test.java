package com.codegym;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {

    String[] strings = {"Bank regulation: Bank regulation is a form of government regulation which subjects banks to certain requirements","Banking crisis: When banks suffer a sudden rush of withdrawals by depositors, this is called a bank run"};

    public static void main(String[] args) {
        Test test = new Test();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập sự lựa chọn:");
        System.out.println("1: Xem Mảng");
        System.out.println("2: Tìm kiếm Trong Mảng");
        System.out.println("3: Thoát");

        boolean check = false;
        String key;

        while (!check) {
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    test.Search();
                    check = true;
                    break;
                case 2:
                    System.out.println("Nhập từ khóa:");
                    sc.nextLine();
                    key = sc.nextLine();
                    test.findDocs(key);
                    check = true;
                    break;
                case 3 :
                    System.exit(0);

                default:
                    System.out.println("Vui lòng nhập đúng");
                    break;
            }
        }
    }

    private void Search() {
        System.out.println(Arrays.toString(strings));
    }

    public void findDocs(String keyword) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].contains(keyword)) {
                list.add(strings[i]);
            }
        }
        if (list.isEmpty()){
            System.out.println("Không có chuỗi phù hợp");
        }else {
            System.out.println("Chuỗi có chứa từ khóa cần tìm là :");
            System.out.println( list);
        }

    }

}
