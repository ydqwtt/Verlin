package com.verlin.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.verlin.entity.CountryEntity;


public interface CountryService {
	
	List<CountryEntity> selectAll();

    List<CountryEntity> selectAll(RowBounds rowBounds);
}
