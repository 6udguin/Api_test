package com.basic.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	/* 네이버 API */
	
	// 홈화면
	@RequestMapping("/")
	public String home() {
		return "home";
	}

	// 영화 검색
	@RequestMapping("/Movie")
	public String movie() {
		return "service/movie";
	}

	// 도서 검색
	@RequestMapping("/Book")
	public String book() {
		return "service/book";
	}

	// 뉴스 검색
	@RequestMapping("/News")
	public String news() {
		return "service/news";
	}

	// 이미지 검색
	@RequestMapping("/Image")
	public String image() {
		return "service/image";
	}

	// 지식인 검색
	@RequestMapping("/Kin")
	public String kin() {
		return "service/kin";
	}
	
	// 쇼핑 검색
	@RequestMapping("/Shop")
	public String shop() {
		return "service/shop";
	}
	
	// 블로그 검색
	@RequestMapping("/Blog")
	public String blog() {
		return "service/blog";
	}
	
	// 백과사전 검색
	@RequestMapping("/Encyc")
	public String encyc() {
		return "service/encyc";
	}
	
	// 지역 검색
	@RequestMapping("/Local")
	public String local() {
		return "service/local";
	}
	
	// 웹문서 검색
	@RequestMapping("/Webkr")
	public String webkr() {
		return "service/webkr";
	}
	
	/* 공공데이터포털 API */
	
	// 부산 영도구 관광정보 API
	@RequestMapping("/BusanYD")
	public String busanYD() {
		return "service/busanYD";
	}
	
	// 부산 영도구 관광정보 API 테스트
	@RequestMapping("/BusanYDTest")
	public String busanYDTest() {
		return "result/TestBusanYD";
	}
}
