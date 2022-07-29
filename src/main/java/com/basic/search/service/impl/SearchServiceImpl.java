package com.basic.search.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

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
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service("searchService")
public class SearchServiceImpl implements SearchService {

	private static String clientId = "RK8xxcu2ywx9mqjIDKlk";
	private static String clientSecret = "IsUhJac75h";

	// 영화 검색
	@Override
	public SearchVo searchMovies(String country, String display, String yearfrom, String yearto, String genre,
			String keyword) {

		String query = null;

		try {
			query = URLEncoder.encode(keyword, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String apiURL = null;

		apiURL = "https://openapi.naver.com/v1/search/movie?query=" + query;

		apiURL += "&display=" + display;

		if (!country.equals("all")) {
			apiURL += "&country=" + country;
		}

		if (yearfrom != "") {
			apiURL += "&yearfrom=" + yearfrom;
		}
		if (yearto != "") {
			apiURL += "&yearto=" + yearto;
		}

		if (!genre.equals("all")) {
			apiURL += "&genre=" + genre;
		}

		System.out.println(apiURL);

		Map<String, String> requestHeaders = new HashMap<String, String>();
		requestHeaders.put("X-Naver-Client-Id", clientId);
		requestHeaders.put("X-Naver-Client-Secret", clientSecret);
		requestHeaders.put("Content-Type", "application/json");

		// json response
		String responseBody = get(apiURL, requestHeaders);

		// json -> object
		ObjectMapper om = new ObjectMapper();
		SearchVo vo = null;
		try {
			vo = om.readValue(responseBody, SearchVo.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vo;
	}

	// 도서 검색
	@Override
	public SearchBookVo searchBooks(String display, String sort, String search, String keyword) {
		String query = null;

		try {
			query = URLEncoder.encode(keyword, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String apiURL = null;

		apiURL = "https://openapi.naver.com/v1/search/mo" + "vie?query=" + query;

		apiURL += "&display=" + display;

		switch (search) {
		case "all":
			apiURL = "https://openapi.naver.com/v1/search/book?query=" + query;
			break;
		case "d_titl":
			apiURL = "https://openapi.naver.com/v1/search/book_adv?d_titl=" + query;
			break;
		case "d_auth":
			apiURL = "https://openapi.naver.com/v1/search/book_adv?d_auth=" + query;
			break;
		case "d_cont":
			apiURL = "https://openapi.naver.com/v1/search/book_adv?d_cont=" + query;
			break;
		case "d_isbn":
			apiURL = "https://openapi.naver.com/v1/search/book_adv?d_isbn=" + query;
		}

		// 보여줄 개수
		apiURL += "&display=" + display;

		// 정렬 옵션
		apiURL += "&sort=" + sort;

		System.out.println(apiURL);

		Map<String, String> requestHeaders = new HashMap<String, String>();
		requestHeaders.put("X-Naver-Client-Id", clientId);
		requestHeaders.put("X-Naver-Client-Secret", clientSecret);
		requestHeaders.put("Content-Type", "application/json");

		// json response
		String responseBody = get(apiURL, requestHeaders);

		// json -> object
		ObjectMapper om = new ObjectMapper();
		SearchBookVo vo = null;
		try {
			vo = om.readValue(responseBody, SearchBookVo.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vo;
	}

	// 뉴스 검색
	@Override
	public SearchNewsVo searchNews(String display, String sort, String keyword) {
		String query = null;

		try {
			query = URLEncoder.encode(keyword, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String apiURL = null;

		apiURL = "https://openapi.naver.com/v1/search/news?query=" + query;

		apiURL += "&display=" + display;

		// 정렬 옵션
		apiURL += "&sort=" + sort;

		System.out.println(apiURL);

		Map<String, String> requestHeaders = new HashMap<String, String>();
		requestHeaders.put("X-Naver-Client-Id", clientId);
		requestHeaders.put("X-Naver-Client-Secret", clientSecret);
		requestHeaders.put("Content-Type", "application/json");

		// json response
		String responseBody = get(apiURL, requestHeaders);

		// json -> object
		ObjectMapper om = new ObjectMapper();
		SearchNewsVo vo = null;
		try {
			vo = om.readValue(responseBody, SearchNewsVo.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vo;
	}

	// 이미지 검색
	@Override
	public SearchImageVo searchImage(String keyword, String display, String sort, String filter) {
		String query = null;

		try {
			query = URLEncoder.encode(keyword, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String apiURL = null;

		apiURL = "https://openapi.naver.com/v1/search/image?query=" + query;

		apiURL += "&display=" + display;

		// 정렬 옵션
		apiURL += "&sort=" + sort;

		// 필터 옵션
		apiURL += "&filter=" + filter;

		System.out.println(apiURL);

		Map<String, String> requestHeaders = new HashMap<String, String>();
		requestHeaders.put("X-Naver-Client-Id", clientId);
		requestHeaders.put("X-Naver-Client-Secret", clientSecret);
		requestHeaders.put("Content-Type", "application/json");

		// json response
		String responseBody = get(apiURL, requestHeaders);

		// json -> object
		ObjectMapper om = new ObjectMapper();
		SearchImageVo vo = null;
		try {
			vo = om.readValue(responseBody, SearchImageVo.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vo;
	}

	// 지식인 검색
	@Override
	public SearchKinVo searchKin(String keyword, String display, String sort) {
		String query = null;

		try {
			query = URLEncoder.encode(keyword, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String apiURL = null;

		apiURL = "https://openapi.naver.com/v1/search/kin?query=" + query;

		apiURL += "&display=" + display;

		// 정렬 옵션
		apiURL += "&sort=" + sort;

		System.out.println(apiURL);

		Map<String, String> requestHeaders = new HashMap<String, String>();
		requestHeaders.put("X-Naver-Client-Id", clientId);
		requestHeaders.put("X-Naver-Client-Secret", clientSecret);
		requestHeaders.put("Content-Type", "application/json");

		// json response
		String responseBody = get(apiURL, requestHeaders);

		// json -> object
		ObjectMapper om = new ObjectMapper();
		SearchKinVo vo = null;
		try {
			vo = om.readValue(responseBody, SearchKinVo.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vo;
	}

	// 쇼핑 검색
	@Override
	public SearchShopVo searchShop(String keyword, String display, String sort) {
		String query = null;

		try {
			query = URLEncoder.encode(keyword, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String apiURL = null;

		apiURL = "https://openapi.naver.com/v1/search/shop?query=" + query;

		apiURL += "&display=" + display;

		// 정렬 옵션
		apiURL += "&sort=" + sort;

		System.out.println(apiURL);

		Map<String, String> requestHeaders = new HashMap<String, String>();
		requestHeaders.put("X-Naver-Client-Id", clientId);
		requestHeaders.put("X-Naver-Client-Secret", clientSecret);
		requestHeaders.put("Content-Type", "application/json");

		// json response
		String responseBody = get(apiURL, requestHeaders);

		// json -> object
		ObjectMapper om = new ObjectMapper();
		SearchShopVo vo = null;
		try {
			vo = om.readValue(responseBody, SearchShopVo.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vo;
	}

	// 블로그 검색
	@Override
	public SearchBlogVo searchBlog(String keyword, String display, String sort) {
		String query = null;

		try {
			query = URLEncoder.encode(keyword, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String apiURL = null;

		apiURL = "https://openapi.naver.com/v1/search/blog?query=" + query;

		apiURL += "&display=" + display;

		// 정렬 옵션
		apiURL += "&sort=" + sort;

		System.out.println(apiURL);

		Map<String, String> requestHeaders = new HashMap<String, String>();
		requestHeaders.put("X-Naver-Client-Id", clientId);
		requestHeaders.put("X-Naver-Client-Secret", clientSecret);
		requestHeaders.put("Content-Type", "application/json");

		// json response
		String responseBody = get(apiURL, requestHeaders);

		// json -> object
		ObjectMapper om = new ObjectMapper();
		SearchBlogVo vo = null;
		try {
			vo = om.readValue(responseBody, SearchBlogVo.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vo;
	}

	// 백과사전 검색
	@Override
	public SearchEncycVo searchEncyc(String keyword, String display) {
		String query = null;

		try {
			query = URLEncoder.encode(keyword, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String apiURL = null;

		apiURL = "https://openapi.naver.com/v1/search/encyc?query=" + query;

		apiURL += "&display=" + display;


		System.out.println(apiURL);

		Map<String, String> requestHeaders = new HashMap<String, String>();
		requestHeaders.put("X-Naver-Client-Id", clientId);
		requestHeaders.put("X-Naver-Client-Secret", clientSecret);
		requestHeaders.put("Content-Type", "application/json");

		// json response
		String responseBody = get(apiURL, requestHeaders);

		// json -> object
		ObjectMapper om = new ObjectMapper();
		SearchEncycVo vo = null;
		try {
			vo = om.readValue(responseBody, SearchEncycVo.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vo;
	
	}
	
	// 지역 검색
	@Override
	public SearchLocalVo searchLocal(String keyword, String display, String sort) {
		String query = null;

		try {
			query = URLEncoder.encode(keyword, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
		String apiURL = null;

		apiURL = "https://openapi.naver.com/v1/search/local?query=" + query;
		
		apiURL += "&sort=" + sort; 
		
		apiURL += "&display=" + display;


		System.out.println(apiURL);

		Map<String, String> requestHeaders = new HashMap<String, String>();
		requestHeaders.put("X-Naver-Client-Id", clientId);
		requestHeaders.put("X-Naver-Client-Secret", clientSecret);
		requestHeaders.put("Content-Type", "application/json");

		// json response
		String responseBody = get(apiURL, requestHeaders);

		// json -> object
		ObjectMapper om = new ObjectMapper();
		SearchLocalVo vo = null;
		try {
			vo = om.readValue(responseBody, SearchLocalVo.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vo;
	}
	
	// 웹문서 검색
	@Override
	public SearchWebkrVo searchWebkr(String keyword, String display) {
		String query = null;

		try {
			query = URLEncoder.encode(keyword, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
		String apiURL = null;

		apiURL = "https://openapi.naver.com/v1/search/webkr?query=" + query;
		
		apiURL += "&display=" + display;


		System.out.println(apiURL);

		Map<String, String> requestHeaders = new HashMap<String, String>();
		requestHeaders.put("X-Naver-Client-Id", clientId);
		requestHeaders.put("X-Naver-Client-Secret", clientSecret);
		requestHeaders.put("Content-Type", "application/json");

		// json response
		String responseBody = get(apiURL, requestHeaders);

		// json -> object
		ObjectMapper om = new ObjectMapper();
		SearchWebkrVo vo = null;
		try {
			vo = om.readValue(responseBody, SearchWebkrVo.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vo;
	}
	
	/* 공공데이터포털 API */
	// 부산 영도구 관광 정보 API
	@Override
	public SearchBusanYDVo SearchBusanYD(String numOfRows, String title) {
		String query = null;

		try {
			query = URLEncoder.encode(title, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String serviceKey = "VVYz4W%2BGHKMfPgAWB%2FNEJ0pWPvbjfbjo2k92wTKBbcYMKQQN566vxUAr3QmK7XErBUhhsfp%2BJKu2O3AYiGjECg%3D%3D";
		String dataUrl = "http://openapi.yeongdo.go.kr:8081/openapi-data/service/rest/tour/list";
		
		String apiURL = null;

		http://openapi.yeongdo.go.kr:8081/openapi-data/service/rest/tour/list?serviceKey=TwQ7vsIsiayEmrJRVUcEJlqQQ41ibd51Yog341h8MbA1kFOiF3L4h4rvnYgF3xH%2B%2FpvhTx9oGhrw8KxpzyCkGA%3D%3D&numOfRows=20&pageNo=1
		
		apiURL = dataUrl;
		
		apiURL += "?serviceKey=" + serviceKey;
		
		apiURL += "&numOfRows=" + numOfRows;


		System.out.println(apiURL);

		Map<String, String> requestHeaders = new HashMap<String, String>();
		requestHeaders.put("X-Naver-Client-Id", clientId);
		requestHeaders.put("X-Naver-Client-Secret", clientSecret);
		requestHeaders.put("Content-Type", "application/json");

		// json response
		String responseBody = get(apiURL, requestHeaders);

		// json -> object
		ObjectMapper om = new ObjectMapper();
		SearchBusanYDVo vo = null;
		try {
			vo = om.readValue(responseBody, SearchBusanYDVo.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vo;
	}

	// -----------------------------------------------------------------------------------------
	private static String get(String apiUrl, Map<String, String> requestHeaders) {
		HttpURLConnection con = connect(apiUrl);
		try {
			con.setRequestMethod("GET");
			for (Map.Entry<String, String> header : requestHeaders.entrySet()) {
				con.setRequestProperty(header.getKey(), header.getValue());
			}

			int responseCode = con.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
				return readBody(con.getInputStream());
			} else { // 에러 발생
				return readBody(con.getErrorStream());
			}
		} catch (IOException e) {
			throw new RuntimeException("API 요청과 응답 실패", e);
		} finally {
			con.disconnect();
		}
	}

	private static HttpURLConnection connect(String apiUrl) {

		try {
			URL url = new URL(apiUrl);
			return (HttpURLConnection) url.openConnection();
		} catch (MalformedURLException e) {
			throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
		} catch (IOException e) {
			throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
		}
	}

	private static String readBody(InputStream body) {
		InputStreamReader streamReader = new InputStreamReader(body);

		try (BufferedReader lineReader = new BufferedReader(streamReader)) {
			StringBuilder responseBody = new StringBuilder();

			String line;
			while ((line = lineReader.readLine()) != null) {
				responseBody.append(line);
			}

			return responseBody.toString();
		} catch (IOException e) {
			throw new RuntimeException("API 응답을 읽는데 실패했습니다.", e);
		}
	}

	

	
	

}
