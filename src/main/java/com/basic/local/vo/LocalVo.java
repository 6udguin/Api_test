package com.basic.local.vo;

public class LocalVo {

	// Fields
	private String category; // 검색 결과 업체 ,기관 분류 정보를 제공한다.
	private String title; // 검색 결과 업체, 기관명을 나타낸다.
	private String link; // 검색 결과 업체, 기관의 상세 정보가 제공되는 네이버 페이지의 하이퍼텍스트 link를 나타낸다.
	private String description; // 검색 결과 업체, 기관명에 대한 설명을 제공한다.
	private String telephone; // 빈 문자열 반환. 과거에 제공되던 항목이라 하위 호환성을 위해 존재한다.
	private String address; // 검색 결과 업체, 기관명의 주소를 제공한다.
	private String roadAddress; // 검색 결과 업체, 기관명의 도로명 주소를 제공한다.
	private int mapx; // 검색 결과 업체, 기관명 위치 정보의 x좌표를 제공한다. 제공값은 카텍좌표계 값으로 제공된다. 이 좌표값은 지도API와 연동가능하다.
	private int mapy; // 검색 결과 업체, 기관명 위치 정보의 y좌표를 제공한다. 제공값은 카텍좌표계 값으로 제공된다. 이 좌표값은 지도API와 연동가능하다.

	// Constructor
	public LocalVo() {
	}

	public LocalVo(String category, String title, String link, String description, String telephone, String address,
			String roadAddress, int mapx, int mapy) {
		super();
		this.category = category;
		this.title = title;
		this.link = link;
		this.description = description;
		this.telephone = telephone;
		this.address = address;
		this.roadAddress = roadAddress;
		this.mapx = mapx;
		this.mapy = mapy;
	}

	// Getter, Setter
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRoadAddress() {
		return roadAddress;
	}

	public void setRoadAddress(String roadAddress) {
		this.roadAddress = roadAddress;
	}

	public int getMapx() {
		return mapx;
	}

	public void setMapx(int mapx) {
		this.mapx = mapx;
	}

	public int getMapy() {
		return mapy;
	}

	public void setMapy(int mapy) {
		this.mapy = mapy;
	}

	// toString
	@Override
	public String toString() {
		return "LocalVo [category=" + category + ", title=" + title + ", link=" + link + ", description=" + description
				+ ", telephone=" + telephone + ", address=" + address + ", roadAddress=" + roadAddress + ", mapx="
				+ mapx + ", mapy=" + mapy + "]";
	}

}
