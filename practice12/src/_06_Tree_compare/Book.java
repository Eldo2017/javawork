package _06_Tree_compare;

import java.util.Objects;

public class Book {
	String title;
	String author;
	String category;
	int price;
	
	public Book(String title, String author, String category, int price) {

		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	public Book() {}

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "제목 : " + title + " / 저자 : " + author + " / 범주 : " + category + " / 가격 : " + price;
	}

	// 가격으로 해시코드 설정
	@Override
	public int hashCode() {
		return Objects.hash(price);
	}

	// 가격이 같으면 true
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Book other = (Book) obj;
		// return this.price == other.price;
		// 제목, 저자가 같다는 가정이면
		return other.price == price;
	}
	
	// compareTo : 제목 오름차순 정렬
	public int compareTo(Book book) {
		return this.getTitle().compareTo(getTitle());
	}
	
	
}
