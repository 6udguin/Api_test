package com.basic.shop.vo;

public class ShopVo {

	// Fields
	private String title; // 검색 결과 문서의 제목을 나타낸다. 제목에서 검색어와 일치하는 부분은 태그로 감싸져 있다.
	private String link; // 검색 결과 문서의 하이퍼텍스트 link를 나타낸다.
	private String image; // 썸네일 이미지의 URL이다. 이미지가 있는 경우만 나타난다.
	private int lprice; // 최저가 정보이다. 최저가 정보가 없는 경우 0으로 표시되며, 가격비교 데이터가 없는 경우 이 필드는 가격을 나타낸다.
	private int hprice; // 최고가 정보이다. 최고가 정보가 없거나 가격비교 데이타거 없는 경우 0으로 표시된다.
	private String mallName; // 상품을 판매하는 쇼핑몰의 상호이다. 정보가 없을 경우 네이버로 표기된다.
	private String productId; // 해당 상품에 대한 ID이다.
	private int productType; // 상품군 정보를 일반상품, 중고상품, 단종상품, 판매예정상품으로 구분한다. 상품군의 종류는 다음과 같다.
	/*
	 * 일반상품, 가격비교 상품:1, 가격비교 비매칭 일반상품:2, 가격비교 매칭 일반상품:3 중고상품, 가격비교 상품:4, 기격비교 비매칭
	 * 일반상품:5, 가격비교 매칭 일반상품:6 단종상품, 가격비교 상품:7, 가격비교 비매칭 일반상품:8, 가격비교 매칭 일반상품:7
	 * 판매예정상품, 가격비교 상품:10, 가격비교 비매칭 일반상품:11, 가격비교 매칭 일반상품:12
	 */
	private String maker; // 해당 상품의 제조사 명이다.
	private String brand; // 해당 상품의 브랜드 명이다.
	private String category1; // 해당 상품의 카테고리, 대분류이다.
	private String category2; // 해당 상품의 카테고리, 중분류이다.
	private String category3; // 해당 상품의 카테고리, 소분류이다.
	private String category4; // 해당 상품의 카테고리, 세분류이다.

	public ShopVo() {
	};

	public ShopVo(String title, String link, String image, int lprice, int hprice, String mallName, String productId,
			int productType, String maker, String brand, String category1, String category2, String category3,
			String category4) {
		super();
		this.title = title;
		this.link = link;
		this.image = image;
		this.lprice = lprice;
		this.hprice = hprice;
		this.mallName = mallName;
		this.productId = productId;
		this.productType = productType;
		this.maker = maker;
		this.brand = brand;
		this.category1 = category1;
		this.category2 = category2;
		this.category3 = category3;
		this.category4 = category4;
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

	public int getLprice() {
		return lprice;
	}

	public void setLprice(int lprice) {
		this.lprice = lprice;
	}

	public int getHprice() {
		return hprice;
	}

	public void setHprice(int hprice) {
		this.hprice = hprice;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getProductType() {
		return productType;
	}

	public void setProductType(int productType) {
		this.productType = productType;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory1() {
		return category1;
	}

	public void setCategory1(String category1) {
		this.category1 = category1;
	}

	public String getCategory2() {
		return category2;
	}

	public void setCategory2(String category2) {
		this.category2 = category2;
	}

	public String getCategory3() {
		return category3;
	}

	public void setCategory3(String category3) {
		this.category3 = category3;
	}

	public String getCategory4() {
		return category4;
	}

	public void setCategory4(String category4) {
		this.category4 = category4;
	}

	// toString
	@Override
	public String toString() {
		return "ShopVo [title=" + title + ", link=" + link + ", image=" + image + ", lprice=" + lprice + ", hprice="
				+ hprice + ", mallName=" + mallName + ", productId=" + productId + ", productType=" + productType
				+ ", maker=" + maker + ", brand=" + brand + ", category1=" + category1 + ", category2=" + category2
				+ ", category3=" + category3 + ", category4=" + category4 + "]";
	}

}
