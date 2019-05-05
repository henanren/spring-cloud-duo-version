package com.laomn.zuul.filter;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class AccessTokenFilter extends ZuulFilter {

	// private static final String RESPONSE_KEY_TOKEN = "token";
	// @Value("${system.config.authFilter.authUrl}")
	// private String authUrl;
	// @Value("${system.config.authFilter.tokenKey}")
	// private String tokenKey = RESPONSE_KEY_TOKEN;

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();

		System.out.println(String.format("%s AccessTokenFilter request to %s", request.getMethod(), request
				.getRequestURL().toString()));
		// try {
		//
		// InputStream stream = ctx.getResponseDataStream();
		// String body = StreamUtils.copyToString(stream,
		// Charset.forName("UTF-8"));
		// ctx.setResponseBody(body);
		// if (StringUtils.isNotBlank(body)) {
		// Gson gson = new Gson();
		// @SuppressWarnings("unchecked")
		// Map<String, String> result = gson.fromJson(body, Map.class);
		// if (StringUtils.isNotBlank(result.get(tokenKey))) {
		// AuthModel authResult = authApi.encodeToken(result.get(tokenKey));
		// if (authResult.getStatus() != HttpServletResponse.SC_OK) {
		// throw new IllegalArgumentException(authResult.getErrMsg());
		// }
		// String accessToken = authResult.getToken();
		// result.put(tokenKey, accessToken);
		// }
		// body = gson.toJson(result);
		// }
		// ctx.setResponseBody(body);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		// 输出最终结果
		return null;
	}

	@Override
	public boolean shouldFilter() {
		RequestContext ctx = RequestContext.getCurrentContext();
		return (boolean) ctx.get("isSuccess");
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "post";// 在请求被处理之后，会进入该过滤器
	}
}
