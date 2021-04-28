package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(value = "", tags = "TEST")
@RestController
@RequestMapping(value = "/test")
public class DemoController {
	
	@RequestMapping(value = "test", method = { RequestMethod.POST })
	@ApiOperation(value = "test", notes = "")
	public Object create(HttpServletRequest request, HttpServletResponse response) {
//		测试测试
		JSONObject result = new JSONObject();
		result.put("msg", "success!!!");
		return result;
	}
}
