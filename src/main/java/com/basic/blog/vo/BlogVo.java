package com.basic.blog.vo;

public class BlogVo {

	// Fields
	private String title; // 검색 결과 문서의 제목을 나타낸다. 제목에서 검색어와 일치하는 부분은 태그로 감싸져 있다.
	private String link; // 검색 결과 문서의 하이퍼텍스트 link를 나타낸다.
	private String description;// 검색 결과 문서의 내용을 요약한 패시지 정보이다. 문서 전체의 내용은 link를 따라가면 읽을 수 있다. 패시지에서 검색어와 일치하는
								// 부분은 태그로 감싸져 있다.
	private String bloggername; // 검색 결과 블로그 포스트를 작성한 블로거의 이름이다.
	private String bloggerlink; // 검색 결과 블로그 포스트를 작성한 블로거의 하이퍼텍스트 link이다.
	private String postdate;
	
	// Constructor
	public BlogVo() {
	}

	public BlogVo(String title, String link, String description, String bloggername, String bloggerlink, String postdate) {
		super();
		this.title = title;
		this.link = link;
		this.description = description;
		this.bloggername = bloggername;
		this.bloggerlink = bloggerlink;
		this.postdate = postdate;
	}

	// Getter, Setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBloggername() {
		return bloggername;
	}

	public void setBloggername(String bloggername) {
		this.bloggername = bloggername;
	}

	public String getBloggerlink() {
		return bloggerlink;
	}

	public void setBloggerlink(String bloggerlink) {
		this.bloggerlink = bloggerlink;
	}
	
	public String getPostdate() {
		return postdate;
	}
	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}
	

	// toString
	@Override
	public String toString() {
		return "BlogVo [title=" + title + ", link=" + link + ", description=" + description + ", bloggername="
				+ bloggername + ", bloggerlink=" + bloggerlink + ", postdate-" + postdate + "]";
	}

}
