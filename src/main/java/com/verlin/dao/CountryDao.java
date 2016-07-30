package com.verlin.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.verlin.entity.CountryEntity;

public interface CountryDao {
	
	public List<CountryEntity> selectAll();
	
	public List<CountryEntity> selectAll(RowBounds rowBounds);
}
