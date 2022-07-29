package com.basic.searchEncyc.vo;

import java.util.List;

import com.basic.encyc.vo.EncycVo;

public class SearchEncycVo {

	// Fields
	String lastBuildDate;
	String total;
	String start;
	String display;
	List<EncycVo> items;

	// Constructor
	public SearchEncycVo() {
	}

	public SearchEncycVo(String lastBuildDate, String total, String start, String display, List<EncycVo> items) {
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

	public List<EncycVo> getItems() {
		return items;
	}

	public void setItems(List<EncycVo> items) {
		this.items = items;
	}

	// toString
	@Override
	public String toString() {
		return "SearchEncycVo [lastBuildDate=" + lastBuildDate + ", total=" + total + ", start=" + start + ", display="
				+ display + ", items=" + items + "]";
	}

}
