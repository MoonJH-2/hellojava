package com.javaex.problem08;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode = 1;

	/**
	 * @param bookNo
	 * @param title
	 * @param author
	 */
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}

	public void rent() {
		if (stateCode == 1) {
			stateCode = 0;
			System.out.println(title + " 이(가) 대여 됐습니다.");
		} else if (stateCode == 0) {
			stateCode = 1;
			System.out.println(title + " 이(가) 반납 됐습니다.");
		}
	}

	public static void print(Book[] books) {
		for (Book book : books) {
			String temp = (book.stateCode == 1) ? "재고있음" : "대여중";
			//System.out.println(book.bookNo + " " + book.title + " " + book.author + " " + temp);
			temp.toString();
		}
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", stateCode=" + stateCode + "]";
	}

	
}
