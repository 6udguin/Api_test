package com.basic.image.vo;

public class ImageVo {

	// Fileds
	private String title; // 검색 결과 이미지의 제목을 나타낸다.
	private String link; // 검색 결과 이미지의 하이퍼텍스트 link를 나타낸다.
	private String thumbnail; // 검색 결과 이미지의 썸네일 link를 나타낸다.
	private String sizeheight; // 검색 결과 이미지의 썸네일 높이를 나타낸다.
	private String sizewidth; // 검색 결과 이미지의 너비를 나타낸다. 단위는 pixel이다.

	// Constructor
	public ImageVo() {
	}

	public ImageVo(String title, String link, String thumbnail, String sizeheight, String sizewidth) {
		super();
		this.title = title;
		this.link = link;
		this.thumbnail = thumbnail;
		this.sizeheight = sizeheight;
		this.sizewidth = sizewidth;
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

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getSizeheight() {
		return sizeheight;
	}

	public void setSizeheight(String sizeheight) {
		this.sizeheight = sizeheight;
	}

	public String getSizewidth() {
		return sizewidth;
	}

	public void setSizewidth(String sizewidth) {
		this.sizewidth = sizewidth;
	}

	// toString
	@Override
	public String toString() {
		return "ImageVo [title=" + title + ", link=" + link + ", thumbnail=" + thumbnail + ", sizeheight=" + sizeheight
				+ ", sizewidth=" + sizewidth + "]";
	}

}
