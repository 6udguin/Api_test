package com.basic.search.vo;

import java.util.List;

import com.basic.movie.vo.MovieVo;

public class SearchVo {
	String lastBuildDate;
	String total;
	String start;
	String display;
	List<MovieVo> items;

	public SearchVo() {
	};

	public SearchVo(String lastBuildDate, String total, String start, String display, List<MovieVo> items) {
		super();
		this.lastBuildDate = lastBuildDate;
		this.total = total;
		this.start = start;
		this.display = display;
		this.items = items;
	}

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

	public List<MovieVo> getItems() {
		return items;
	}

	public void setItems(List<MovieVo> items) {
		this.items = items;
	}
	

}
