package in.ashokit.model;

import java.io.Serializable;

import io.netty.buffer.search.SearchProcessor;

public class Book implements Serializable {
	
	private Integer bookId;
	private String bookName;
	
	public Book(Integer bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	

}
