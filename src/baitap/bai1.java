package baitap;

import java.io.File;
import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String url = sc.nextLine();
		File f = new File(url);
		if (f.exists())
			System.out.println("Độ dài của file là : "+f.length()+" byte");
		else 
			System.out.println("File không tồn tại");
	}
}
