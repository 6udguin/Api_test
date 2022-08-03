package servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TourlListYD
 */
@WebServlet("/tourlist")
public class TourlListYD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TourlListYD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request : 넘어온 파라미터 처리
		request.setCharacterEncoding("UTF-8");
		String pageNo = request.getParameter("pageNo");
		if (pageNo == null)
			pageNo = "1";
		String numOfRows = request.getParameter("numOfRows");
		if (numOfRows == null)
			numOfRows = "10";
		String addr = request.getParameter("addr");
		if (addr == null)
			addr = "";
		String title = request.getParameter("title");
		if (title == null)
			title = "";

		String serviceKey = "VVYz4W%2BGHKMfPgAWB%2FNEJ0pWPvbjfbjo2k92wTKBbcYMKQQN566vxUAr3QmK7XErBUhhsfp%2BJKu2O3AYiGjECg%3D%3D";
		String dataUrl = "http://openapi.yeongdo.go.kr:8081/openapi-data/service/rest/tour/list";

		// 호출
		StringBuilder sb = new StringBuilder(dataUrl);
		sb.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + serviceKey);
		sb.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode(numOfRows, "UTF-8"));
		sb.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode(pageNo, "UTF-8"));
		sb.append("&" + URLEncoder.encode("addr", "UTF-8") + "=" + URLEncoder.encode(addr, "UTF-8"));
		sb.append("&" + URLEncoder.encode("title", "UTF-8") + "=" + URLEncoder.encode(title, "UTF-8"));

		URL url = new URL(sb.toString());

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/xml");
		System.out.println("response code:" + conn.getResponseCode()); // 200, 404, 500

		// 도착한 데이터 처리
		BufferedReader br;
		if (200 <= conn.getResponseCode() && conn.getResponseCode() < 300) {
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}

		// data -> 문자열로 변환
		StringBuilder sbxml = new StringBuilder();
		String line;
		while ((line = br.readLine()) != null) {
			sbxml.append(line);
		}
		br.close();
		conn.disconnect();

		String xml = sbxml.toString();
		System.out.println(xml);

		// Response
		response.setContentType("application/xml;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(xml);
		System.out.println("TourListYD toString= " + xml.toString());
		System.out.println("TourListYD = " + xml);
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
