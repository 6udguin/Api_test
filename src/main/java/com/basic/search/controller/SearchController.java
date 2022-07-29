package com.basic.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.basic.search.service.SearchService;
import com.basic.search.vo.SearchVo;
import com.basic.searchBlog.vo.SearchBlogVo;
import com.basic.searchBook.vo.SearchBookVo;
import com.basic.searchBusanYD.vo.SearchBusanYDVo;
import com.basic.searchEncyc.vo.SearchEncycVo;
import com.basic.searchImage.vo.SearchImageVo;
import com.basic.searchLocal.vo.SearchLocalVo;
import com.basic.searchNews.vo.SearchNewsVo;
import com.basic.searchShop.vo.SearchShopVo;
import com.basic.searchWebkr.vo.SearchWebkrVo;
import com.basic.searchkin.vo.SearchKinVo;

@RequestMapping("Search")
@Controller
public class SearchController {

	@Autowired
	private SearchService searchService;

	/* 네이버 검색 API */

	// 영화 검색
	@RequestMapping("/SearchMovie")
	public ModelAndView movieSearch(String country, String display, String yearfrom, String yearto, String genre,
			String keyword) {

		System.out.println("SearchController movieSearch param, country=" + country + ", display=" + display
				+ ", yearfrom= " + yearfrom + ", yearto= " + yearto + ", genre= " + genre + ", keyword= " + keyword);

		SearchVo searchVo = searchService.searchMovies(country, display, yearfrom, yearto, genre, keyword);

		ModelAndView mv = new ModelAndView();

		System.out.println("결과:" + searchVo.getItems());

		mv.addObject("movieList", searchVo.getItems());
		mv.setViewName("result/movies");

		return mv;

	}

	// 도서 검색
	@RequestMapping("/SearchBook")
	public ModelAndView bookSearch(String display, String sort, String search, String keyword) {

		System.out.println("SearchController bookSearch param, display= " + display + ", sort= " + sort + ", search= "
				+ search + ", keyword= " + keyword);

		SearchBookVo searchVo = searchService.searchBooks(display, sort, search, keyword);

		ModelAndView mv = new ModelAndView();

		System.out.println("결과:" + searchVo.getItems());

		mv.addObject("bookList", searchVo.getItems());
		mv.setViewName("result/books");

		return mv;
	}

	// 뉴스 검색
	@RequestMapping("/SearchNews")
	public ModelAndView newsSearch(String display, String sort, String keyword) {

		System.out.println(
				"SearchController newsSearch, display=" + display + ", sort=" + sort + ", keyword= " + keyword);

		SearchNewsVo newsVo = searchService.searchNews(display, sort, keyword);

		ModelAndView mv = new ModelAndView();

		System.out.println("결과:" + newsVo.getItems());

		mv.addObject("newsList", newsVo.getItems());
		mv.setViewName("result/news");

		return mv;

	}

	// 이미지 검색
	@RequestMapping("/SearchImage")
	public ModelAndView imageSearch(String keyword, String display, String sort, String filter) {

		System.out.println("SearchController imageSearch, display=" + display + ", sort=" + sort + ", keyword="
				+ keyword + ", filter=" + filter);

		SearchImageVo imageVo = searchService.searchImage(keyword, display, sort, filter);

		ModelAndView mv = new ModelAndView();

		System.out.println("결과:" + imageVo.getItems());

		mv.addObject("imageList", imageVo.getItems());
		mv.setViewName("result/images");

		return mv;
	}

	// 지식인 검색
	@RequestMapping("SearchKin")
	public ModelAndView kinSearch(String keyword, String display, String sort) {

		System.out
				.println("SearchController kinSearch, keyword=" + keyword + ", display=" + display + ", sort=" + sort);

		SearchKinVo kinVo = searchService.searchKin(keyword, display, sort);

		ModelAndView mv = new ModelAndView();

		System.out.println("결과:" + kinVo.getItems());

		mv.addObject("kinList", kinVo.getItems());

		mv.setViewName("result/kins");

		return mv;

	}

	// 쇼핑 검색
	@RequestMapping("SearchShop")
	public ModelAndView shopSearch(String keyword, String display, String sort) {

		System.out
				.println("SearchController shopSearch, keyword=" + keyword + ", display=" + display + ", sort=" + sort);

		SearchShopVo shopVo = searchService.searchShop(keyword, display, sort);

		ModelAndView mv = new ModelAndView();

		System.out.println("결과:" + shopVo.getItems());

		mv.addObject("shopList", shopVo.getItems());
		mv.setViewName("result/shops");

		return mv;

	}

	// 블로그 검색
	@RequestMapping("SearchBlog")
	public ModelAndView blogSearch(String keyword, String display, String sort) {

		System.out.println("SearchController blogSearch, keyword=" + keyword + ", display=" + ", display=" + display
				+ ", sort=" + sort);

		SearchBlogVo blogVo = searchService.searchBlog(keyword, display, sort);

		ModelAndView mv = new ModelAndView();

		System.out.println("결과:" + blogVo.getItems());

		mv.addObject("blogList", blogVo.getItems());
		mv.setViewName("result/blogs");

		return mv;
	}

	// 백과사전 검색
	@RequestMapping("SearchEncyc")
	public ModelAndView encycSearch(String keyword, String display) {

		System.out.println("SearchController encycSearch, keyword=" + keyword + ", display=" + display);

		SearchEncycVo encycVo = searchService.searchEncyc(keyword, display);

		ModelAndView mv = new ModelAndView();

		System.out.println("결과:" + encycVo.getItems());

		mv.addObject("encycList", encycVo.getItems());
		mv.setViewName("result/encycs");

		return mv;
	}

	// 지역 검색
	@RequestMapping("SearchLocal")
	public ModelAndView localSearch(String keyword, String sort, String display) {

		System.out.println(
				"SearchController localSearch, keyword=" + keyword + ", display=" + display + ", sort=" + sort);

		SearchLocalVo localVo = searchService.searchLocal(keyword, display, sort);

		ModelAndView mv = new ModelAndView();

		System.out.println("결과:" + localVo.getItems());

		mv.addObject("localList", localVo.getItems());
		mv.setViewName("result/locals");

		return mv;

	}

	// 웹 문서 검색
	@RequestMapping("SearchWebkr")
	public ModelAndView webkrSearch(String keyword, String display) {

		System.out.println("SearchController webkrSearch, keyword=" + keyword + ", display=" + display);

		SearchWebkrVo webkrVo = searchService.searchWebkr(keyword, display);

		ModelAndView mv = new ModelAndView();

		System.out.println("결과:" + webkrVo.getItems());

		mv.addObject("webkrList", webkrVo.getItems());
		mv.setViewName("result/webkrs");

		return mv;
	}

	/* 공공데이터포털 API */

	// 부산 영도구 관광정보 API
	@RequestMapping("SearchBusanYD")
	public ModelAndView busanYDSearch(String numOfRows, String title) {

		SearchBusanYDVo busanYDVo = searchService.SearchBusanYD(numOfRows, title);

		ModelAndView mv = new ModelAndView();

		System.out.println("결과:" + busanYDVo);

		mv.addObject("busanYDList", busanYDVo.getItem());
		mv.setViewName("result/busanYDs");
		
		return mv;
	}

}
