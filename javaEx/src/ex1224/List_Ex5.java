package ex1224;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* ��¥ : 2018.12.24
 * ���� : List<>, LinkedList
 * ��Ÿ : List ���� Ŭ���� : ArrayList, LinkedList, Vector
 * */

public class List_Ex5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long s, e;
		
		s = System.nanoTime();
		
		for (int i = 1; i <= 100000; i++) {
			list.add("�׽�Ʈ" + i);
		}
		
		e = System.nanoTime();
		
		System.out.println("ArrayList : " + (e-s));
		
		s = System.nanoTime();

		for (int i = 1; i <= 100000; i++) {
			list2.add("�׽�Ʈ" + i);
		}

		e = System.nanoTime();

		System.out.println("LinkedList : " + (e - s));
	}

}