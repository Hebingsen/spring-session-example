package com.sky;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @参考文章 https://www.cnkirito.moe/2017/09/04/Re：从零开始的Spring%20Session(三)/
 * @作者 乐此不彼
 * @时间 2017年9月25日
 * @公司 sky工作室
 */
@RestController
public class CookieController {
	

	@GetMapping("/test/cookie")
	public void cookie(@RequestParam("browser") String browser, HttpServletRequest request, HttpSession session) {
		
		// 取出session中的browser
		Object sessionBrowser = session.getAttribute("browser");
		
		if (sessionBrowser == null) {
			System.err.println("不存在session，设置browser=" + browser);
			session.setAttribute("browser", browser);
		} else {
			System.err.println("存在session，browser=" + sessionBrowser.toString());
		}
		
		Cookie[] cookies = request.getCookies();
		if (cookies != null && cookies.length > 0) {
			for (Cookie cookie : cookies) {
				System.err.println(cookie.getName() + " : " + cookie.getValue());
			}
		}
	}
}
