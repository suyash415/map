package com.tka.oct_18_Copy_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n---------Welcome to GVT Libraray----------");

		List<Book> bookList = new ArrayList<Book>();

		bookList.add(new Book(101, "Wings of Fire", "A.P.J. Abdul Kalam", 250));
		bookList.add(new Book(102, "The Alchemist", "Paulo Coelho", 300));
		bookList.add(new Book(103, "Rich Dad Poor Dad", "Robert Kiyosaki", 350));
		bookList.add(new Book(104, "Atomic Habits", "James Clear", 400));
		bookList.add(new Book(105, "Harry Potter", "J.K. Rowling", 450));
		bookList.add(new Book(106, "The Guide", "R.K. Narayan", 200));
		bookList.add(new Book(107, "Think and Grow Rich", "Napoleon Hill", 280));
		bookList.add(new Book(108, "Five Point Someone", "Chetan Bhagat", 220));

		Student s1 = new Student(25, "ram", 538162913, "pune");

		Map<Integer, Book> books = new HashMap<Integer, Book>();
		for (Book book : bookList) {
			books.put(book.getId(), book);
		}

		for (Book book : bookList) {
			System.out.println(
					book.getId() + " : " + book.getName() + " : " + book.getAuthor() + " : Rs." + book.getPrice());
		}

		List<Book> selectedBooks = new ArrayList<Book>();

		int totalfine = 0;
		char next;

		do {
			System.out.println("\nEnter Book id:");
			int bookId = sc.nextInt();

			Book selectedBook = books.get(bookId);

			if (selectedBook != null) {
				System.out.println("\nEnter number of days borrowed:");
				int day = sc.nextInt();
				if (day > 0) {
					selectedBooks.add(selectedBook);
					if (day > 7) {
						totalfine = totalfine + (day - 7) * 5;

					}
					System.out.println("Book Added Successfully!");
				} else {
					System.out.println("Invalid number of days");
				}
			} else {
				System.out.println("Invalid Book Id !");
			}
			System.out.println("Do you want to select more books (y/n):");
			next = sc.next().charAt(0);
		} while (next == 'y' || next == 'Y');

		LibraryTransaction t1 = new LibraryTransaction();

		t1.setTransactionId((int) (Math.random() * 1000) + 1);
		t1.setStudemnt(s1);

		if (!selectedBooks.isEmpty()) {
			t1.setBook(selectedBooks.get(0));
		}
		t1.setNumberOfdays(0);
		t1.setFine(totalfine);
		if (!selectedBooks.isEmpty()) {
			t1.setStatus("Issued");
		} else {
			t1.setStatus("Not Issued");
		}

		System.out.println("\n===== LIBRARY TRANSACTION =====");

		System.out.println("Transaction ID: " + t1.getTransactionId());
		System.out.println("Student ID: " + s1.getStudentId());
		System.out.println("Student Name: " + s1.getStudentName());
		System.out.println("Mobile: " + s1.getMob());
		System.out.println("City: " + s1.getCity());

		System.out.println("\nSelected Books:");

		for (Book b : selectedBooks) {
			System.out.println(b.getName() + " - Rs." + b.getPrice());
		}

		System.out.println("-------------------------");
		System.out.println("Total Books: " + selectedBooks.size());
		System.out.println("Total Fine: Rs." + t1.getFine());
		System.out.println("Transaction Status: " + t1.getStatus());

		sc.close();
	}

}
