package com.example.demo.dao;

import com.example.demo.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by HUA on 2018/3/28.
 */
@Mapper
public interface CityDao {

    City findByName(@Param("cityName") String cityName);

    List<City> findAll();

}
