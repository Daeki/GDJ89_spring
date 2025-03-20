package com.winter.app.rest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.winter.app.SampleTestCase;

public class RestFulControllerTest extends SampleTestCase{

	@Test
	public void test() {
		//Server에서 다른 서버로 요청을 보내려 함
		
		//URL, Method, Paramter, Header
		RestTemplate restTemplate = new RestTemplate();
		
		//1. Header 생성
		HttpHeaders headers = new HttpHeaders();
//		headers.add("Content-Type", "application/json;charset=utf-8");
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
		
		//2. paramter 생성
//		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
//		params.add("grant_type", "authorization_code");
//		params.add("client_id", "authorization_code");
		
		//3. 요청 객체 생성
		//HttpEntity<MultiValueMap<String, String>> req = new HttpEntity<MultiValueMap<String,String>>(params, null);
		
		
		//4. 요청 전송 결과 처리
		
		//1) Get
		//ResponseEntity<JsonDTO> res = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts/1", JsonDTO.class, req);
		
		//List<JsonDTO> r= restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/1", List.class, null);
		List<Object> ar=restTemplate.getForObject("http://localhost/json/", List.class);
		LinkedHashMap<String, String> map=(LinkedHashMap<String, String>)ar.get(0);
		System.out.println(ar.get(0).getClass());
		System.out.println(map.get("title"));
		
		
//		for(JsonDTO j:ar) {
//			System.out.println(j.getId());
//			System.out.println(j.getTitle());
//			System.out.println("=============");
//		}
		
		
		
		
		//2)Post
		//restTemplate.postForEntity("url", req, JsonDTO.class);
		
		//3) GET/POST
		//ResponseEntity<JsonDTO> response = restTemplate.exchange("url", HttpMethod.POST, req, JsonDTO.class);
		
		
		//5. 요청의 결과를 DTO에 담는데 DTO가 여러개 나올경우
		//List<JsonDTO> r= restTemplate.getForObject("url", List.class, req);
	}

}
