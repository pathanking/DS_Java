package com.srkr.oop;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		
		book1.setbId(101);
		book1.setTitle("Let's C");
		book1.setAuthor("Bala");
		book1.setPages(250);
		book1.setPrice(500.5);
		
		System.out.println(book1);
	}
}