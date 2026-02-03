package DSAQueue;

import java.util.Scanner;
import java.util.TreeMap;

public class WordCountUsingTreeMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String str = sc.nextLine();

        // Chuyển về chữ thường để tránh phân biệt hoa/thường
        str = str.toLowerCase();

        // Tách chuỗi thành các từ
        String[] words = str.split(" ");

        // Khởi tạo TreeMap
        TreeMap<String, Integer> map = new TreeMap<>();

        // Đếm số lần xuất hiện
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // In kết quả
        System.out.println("So lan xuat hien cua moi tu:");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}

