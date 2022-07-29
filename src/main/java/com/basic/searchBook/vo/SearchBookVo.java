package com.basic.searchBook.vo;

import java.util.List;

import com.basic.book.vo.BookVo;

public class SearchBookVo {

	// Fields
	String lastBuildDate;
	String total;
	String start;
	String display;
	List<BookVo> items;

	// Constructor
	public SearchBookVo() {
	};

	public SearchBookVo(String lastBuildDate, String total, String start, String display, List<BookVo> items) {
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

	public List<BookVo> getItems() {
		return items;
	}

	public void setItems(List<BookVo> items) {
		this.items = items;
	}

	// toString
	@Override
	public String toString() {
		return "SearchBookVo [lastBuildDate=" + lastBuildDate + ", total=" + total + ", start=" + start + ", display="
				+ display + ", items=" + items + "]";
	}

}
