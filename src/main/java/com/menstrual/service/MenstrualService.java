package com.menstrual.service;

import com.menstrual.dao.MenstrualDao;
import com.menstrual.entity.Menstrual;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 10/8/2018.
 */
@Service
public class MenstrualService {
    @Resource
    private MenstrualDao menstrualDao;

    public Menstrual save(Menstrual menstrual) {
        return menstrualDao.save(menstrual);
    }

    public List<Menstrual> saveAll(List<Menstrual> list) {
        return menstrualDao.saveAll(list);
    }

    public List<Menstrual> findAll() {
        return menstrualDao.findAll();
    }

}
