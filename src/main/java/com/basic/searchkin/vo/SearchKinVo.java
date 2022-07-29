package com.basic.searchkin.vo;

import java.util.List;

import com.basic.kin.vo.KinVo;

public class SearchKinVo {
	
		// Fields
		String lastBuildDate;
		String total;
		String start;
		String display;
		List<KinVo> items;
		
		// Constructor
		public SearchKinVo() {}
		public SearchKinVo(String lastBuildDate, String total, String start, String display, List<KinVo> items) {
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
		public List<KinVo> getItems() {
			return items;
		}
		public void setItems(List<KinVo> items) {
			this.items = items;
		}
		
		// toString
		@Override
		public String toString() {
			return "SearchKinVo [lastBuildDate=" + lastBuildDate + ", total=" + total + ", start=" + start
					+ ", display=" + display + ", items=" + items + "]";
		}
		
		
		
		
		
		
}
