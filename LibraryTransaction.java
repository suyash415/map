package com.tka.oct_18_Copy_1;

public class LibraryTransaction {
	private int transactionId;
	private Student studemnt;
	private Book book;
	private int numberOfdays;
	private double fine;
	private String status;

	public LibraryTransaction() {
		// TODO Auto-generated constructor stub
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Student getStudemnt() {
		return studemnt;
	}

	public void setStudemnt(Student studemnt) {
		this.studemnt = studemnt;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getNumberOfdays() {
		return numberOfdays;
	}

	public void setNumberOfdays(int numberOfdays) {
		this.numberOfdays = numberOfdays;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
