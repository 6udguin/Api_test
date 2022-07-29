package com.basic.book.vo;

public class BookVo {
	// Fields
	private String title; // 검색 결과 문서의 제목을 나타낸다. 제목에서 검색어와 일치하는 부분은 태그로 감싸져 있다.
	private String link; // 검색 결과 문서의 하이퍼텍스트 link를 나타낸다.
	private String image; // 썸네일 이미지의 URL이다. 이미지가 있는 경우만 나타납니다.
	private String author; // 저자 정보이다.
	private int price; // 정가 정보이다. 절판도서 등으로 가격이 없으면 나타나지 않는다.
	private int discount; // 할인 가격 정보이다. 절판도서 등으로 가격이 없으면 나타나지 않는다.
	private String publisher; // 출판사 정보이다.
	private String isbn; // ISBN 넘버이다.
	private String pubdate; // 출간일 정보이다.
	private String description; //검색 결과 문서의 내용을 요약한 패시지 정보이다. 문서 전체의 내용은 link를 따라가면
								//읽을 수 있다. 패시지에서 검색어와 일치하는 부분은 태그로 감싸져 있다.
	
	// Constructor
	public BookVo() {
	}

	public BookVo(String title, String link, String image, String author, int price, int discount, String publisher,
			String isbn, String pubdate, String description) {
		super();
		this.title = title;
		this.link = link;
		this.image = image;
		this.author = author;
		this.price = price;
		this.discount = discount;
		this.publisher = publisher;
		this.isbn = isbn;
		this.pubdate = pubdate;
		this.description = description;
	}

	// Getter, Setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPubdate() {
		return pubdate;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	// toString
	@Override
	public String toString() {
		return "BookVo [title=" + title + ", link=" + link + ", image=" + image + ", author=" + author + ", price="
				+ price + ", discount=" + discount + ", publisher=" + publisher + ", isbn=" + isbn + ", pubdate="
				+ pubdate + ", description=" + description + "]";
	}

}
