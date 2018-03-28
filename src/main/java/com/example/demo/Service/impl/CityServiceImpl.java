package com.example.demo.Service.impl;

import com.example.demo.Service.CityService;
import com.example.demo.dao.CityDao;
import com.example.demo.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HUA on 2018/3/28.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;


    @Override
    public List<City> findAll() {
        return cityDao.findAll();
    }
}
