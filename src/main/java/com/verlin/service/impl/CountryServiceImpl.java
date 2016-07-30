package com.verlin.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.verlin.dao.CountryDao;
import com.verlin.entity.CountryEntity;
import com.verlin.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Resource
	private CountryDao countryDao;
	
	@Override
	public List<CountryEntity> selectAll() {
	
		return countryDao.selectAll();
	}

	@Override
	public List<CountryEntity> selectAll(RowBounds rowBounds) {
		
		return countryDao.selectAll(rowBounds);
	}

}
