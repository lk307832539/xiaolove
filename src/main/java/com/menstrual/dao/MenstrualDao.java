package com.menstrual.dao;

import com.menstrual.entity.Menstrual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by LK on 10/8/2018.
 */
@Repository
public interface MenstrualDao extends JpaRepository<Menstrual, Integer> {

}
