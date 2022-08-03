
package com.basic.searchBusanYD.vo;

import java.util.List;

import com.basic.busanYD.vo.BusanYDVo;

public class SearchBusanYDVo {

	// Fields
	List<BusanYDVo> item;

	// Constructor
	public SearchBusanYDVo() {
	}

	public SearchBusanYDVo(List<BusanYDVo> item) {
		super();
		this.item = item;
	}

	// Getter, Setter
	public List<BusanYDVo> getItem() {
		return item;
	}

	public void setItem(List<BusanYDVo> item) {
		this.item = item;
	}

	// toString
	@Override
	public String toString() {
		return "SearchBusanYDVo [item=" + item + "]";
	}

}
