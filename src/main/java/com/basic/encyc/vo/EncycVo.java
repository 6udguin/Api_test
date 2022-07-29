package com.basic.encyc.vo;

public class EncycVo {

	// Fields
	private String title; // 검색 결과 사전 정의의 제목을 나타낸다.
	private String link; // 사전 정의 정보 및 추가 정보를 볼 수 있는 link를 제공한다. link값은 두산 백과사전 사이트의 해당 페이지로 연결된다.
	private String description; // 검색 결과 문서의 내용을 요약한 패시지 정보이다. 문서 전체의 내용은 link를 따라가면 읽을 수 있다. 패시지에서 검색어와 일치하는
								// 부분은 태그로 감싸져 있다.
	private String thumbnail; // 검색 결과에 이미지가 포함된 경우, 해당 이미지의 썸네일 link url을 나타낸다.

	// Constructor
	public EncycVo() {
	}

	public EncycVo(String title, String link, String description, String thumbnail) {
		super();
		this.title = title;
		this.link = link;
		this.description = description;
		this.thumbnail = thumbnail;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	// toString
	@Override
	public String toString() {
		return "EncycVo [title=" + title + ", link=" + link + ", description=" + description + ", thumbnail="
				+ thumbnail + "]";
	}

}
