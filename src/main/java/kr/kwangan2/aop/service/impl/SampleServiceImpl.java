package kr.kwangan2.aop.service.impl;

import org.springframework.stereotype.Service;

import kr.kwangan2.aop.service.SampleService;

@Service
public class SampleServiceImpl implements SampleService {

	@Override
	public Integer doAdd(String str1, String str2) throws Exception {
		return Integer.parseInt(str1) + Integer.parseInt(str2);
	}

}
