package com.basic.searchImage.vo;

import java.util.List;

import com.basic.image.vo.ImageVo;

public class SearchImageVo {

	// Fields
	String lastBuildDate;
	String total;
	String start;
	String display;
	List<ImageVo> items;

	// Constructor
	public SearchImageVo() {
	}

	public SearchImageVo(String lastBuildDate, String total, String start, String display, List<ImageVo> items) {
		super();
		this.lastBuildDate = lastBuildDate;
		this.total = total;
		this.start = start;
		this.display = display;
		this.items = items;
	}

	// Getter, Setter
	public String getLastBuildDate() {
		return lastBuildDate;
	}

	public void setLastBuildDate(String lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public List<ImageVo> getItems() {
		return items;
	}

	public void setItems(List<ImageVo> items) {
		this.items = items;
	}

	// toString
	@Override
	public String toString() {
		return "SearchImageVo [lastBuildDate=" + lastBuildDate + ", total=" + total + ", start=" + start + ", display="
				+ display + ", items=" + items + "]";
	}

}
