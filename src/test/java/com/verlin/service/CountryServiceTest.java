package com.verlin.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageInfo;
import com.verlin.base.SpringTestCase;
import com.verlin.entity.CountryEntity;
import static org.junit.Assert.assertEquals;

public class CountryServiceTest extends SpringTestCase{
	
	@Autowired  
    private CountryService countryService;
	
	@Test  
    public void selectCountryByIdTest(){
		 //获取第1页，10条内容，默认查询总数count
		List<CountryEntity> list = countryService.selectAll(new RowBounds(1, 10));
		CountryEntity c = list.get(0);
		System.out.println(c.getCountryName());
		System.out.println(c.getCountryCode());
		System.out.println(list.size());
		 //新增PageInfo对象，对返回结果进行封装
        PageInfo<CountryEntity> page = new PageInfo<CountryEntity>(list);
        System.out.println(page.getFirstPage());
        assertEquals(10, list.size());
        assertEquals(183, page.getTotal());
        //判断查询结果的位置是否正确
        assertEquals(1, list.get(0).getId());
        assertEquals(10, list.get(list.size() - 1).getId());
    }
}
