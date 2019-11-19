package com.example.demo1.configg;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Project:               newGit
 *
 * @Author: ljw
 * Company:               Big Player Group
 * Created Date:          2019/11/18
 * Description:   {类描述}
 * Copyright @ 2017-2019 BIGPLAYER.GROUP – Confidential and Proprietary
 * <p>
 * History:
 * ------------------------------------------------------------------------------
 * Date            |time        |Author    |Change Description
 */
@WebFilter(filterName = "basicFilter",urlPatterns="/")
public class BasicAuthFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		String name="1231";
	}
}
