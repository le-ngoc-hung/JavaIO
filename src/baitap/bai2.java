package baitap;

import java.io.File;
import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String url = sc.nextLine();
		File f = new File(url);
		if (f.exists()) {
			if (f.isDirectory()) 
				xoaThuMuc(f);
			else
				f.delete();
			System.out.println("Xóa thành công");
		}
		else
			System.out.println("Không tồn tại");
	}
	public static void xoaThuMuc(File tm) {
		File[] list = tm.listFiles();
		for (File f : list) {
			if (f.isDirectory())
				xoaThuMuc(f);
			else
				f.delete();
		}
		tm.delete();
	}
}

