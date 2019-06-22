package com.chunboyang.week3.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chunboyang.week3.dao.CompanyMapper;
import com.chunboyang.week3.domain.Company;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Resource
	private CompanyMapper companyMapper;

	@Override
	public List<Map> list(Map map) {
		return companyMapper.list(map);
	}

	@Override
	public int insert(Company company) {
		return companyMapper.insert(company);
	}

}
