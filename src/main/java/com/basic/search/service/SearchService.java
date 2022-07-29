package com.basic.search.service;

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

public interface SearchService {
	
	/* 네이버 API */
	
	// 영화 검색
	SearchVo searchMovies(String country, String display, String yearfrom, String yearto, String genre, String keyword);

	// 도서 검색
	SearchBookVo searchBooks(String display, String sort, String search, String keyword);

	// 뉴스 검색
	SearchNewsVo searchNews(String display, String sort, String keyword);

	// 이미지 검색
	SearchImageVo searchImage(String keyword, String display, String sort, String filter);

	// 지식인 검색
	SearchKinVo searchKin(String keyword, String display, String sort);

	// 쇼핑 검색
	SearchShopVo searchShop(String keyword, String display, String sort);

	// 블로그 검색
	SearchBlogVo searchBlog(String keyword, String display, String sort);

	// 사전 검색
	SearchEncycVo searchEncyc(String keyword, String display);
	
	// 지역 검색
	SearchLocalVo searchLocal(String keyword, String display, String sort);
	
	// 웹문서 검색
	SearchWebkrVo searchWebkr(String keyword, String display);
	
	/* 공공데이터포털 API */
	
	//부산 영도구 관광정보 API */
	SearchBusanYDVo SearchBusanYD(String numOfRows, String title);
}