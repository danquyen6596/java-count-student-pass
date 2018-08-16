package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mark;
        int size;

        do{
            System.out.print("Nhập vào kích thước mảng(tối đa 30): ");
            size = scanner.nextInt();
        }while (size>30);

        mark = new int[size];
        System.out.println("Nhập vào điểm của sinh viên: ");
        int i = 0;
        while (i<size)
        {
            System.out.print("Sinh viên thứ "+(i+1)+" :");
            mark[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.println("Danh sách điểm vừa nhập: ");
        for (int j = 0; j < mark.length; j++)
        {
            System.out.print(mark[j]+"\t");
            if(mark[j] > 5)
                count++;
        }

        System.out.println("\nSố lượng sinh viên đạt là: "+count);
    }
}
