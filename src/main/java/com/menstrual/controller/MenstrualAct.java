package com.menstrual.controller;

import com.menstrual.entity.Menstrual;
import com.menstrual.service.MenstrualService;
import com.util.DateTimeFormatUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LK on 9/18/2018.
 */
@Controller
@RequestMapping("/menstrual")
public class MenstrualAct {
    @Resource
    private MenstrualService menstrualService;

    @RequestMapping("/defalutMenstrual")
    public void defaultMenstrual() throws ParseException {

        List<Menstrual> all = menstrualService.findAll();
        if (all.size() == 0) {
            List<String> list = new ArrayList<>();
            list.add("20160614");
            list.add("20160714");
            list.add("20160822");
            list.add("20160927");
            list.add("20161106");
            list.add("20161210");
            list.add("20170116");
            list.add("20170217");
            list.add("20170322");
            list.add("20170427");
            list.add("20170602");
            list.add("20170709");
            list.add("20170810");
            list.add("20170923");
            list.add("20171121");
            list.add("20180103");
            list.add("20180302");
            list.add("20180421");
            list.add("20180523");
            list.add("20180623");
            list.add("20180805");
            list.add("20180913");


            List<Menstrual> menstruals = new ArrayList<>();

            menstruals.add(getFirstMenstrual(list.get(0), 0));

            int minInterval;
            int maxInterval;
            int avgInterval;

            int total = 0;

            List<Integer> betweenTimeList = new ArrayList<>();

            for (int i = 1; i < list.size(); i++) {
                LocalDate now = DateTimeFormatUtil.yyyyMMdd2LocalDate(list.get(i));
                LocalDate past = DateTimeFormatUtil.yyyyMMdd2LocalDate(list.get(i - 1));

                int betweenTime = (int) DateTimeFormatUtil.betweenTime(now.atStartOfDay(), past.atStartOfDay(), ChronoUnit.DAYS);

                total = total + betweenTime;

                betweenTimeList.add(betweenTime);

                Menstrual menstrual = new Menstrual();
                menstrual.setStartDate(DateTimeFormatUtil.localDate2Date(DateTimeFormatUtil.yyyyMMdd2LocalDate(list.get(i))));
                menstrual.setInterval(betweenTime);
                menstruals.add(menstrual);

            }

        }

    }

    private Menstrual getFirstMenstrual(String time,Integer betweenTime) throws ParseException {
        Menstrual menstrual = new Menstrual();
        menstrual.setStartDate(DateTimeFormatUtil.localDate2Date(DateTimeFormatUtil.yyyyMMdd2LocalDate(time)));
        menstrual.setInterval(betweenTime);
        return menstrual;
    }

    public static void main(String[] args) throws ParseException {
        List<String> list = new ArrayList<>();
        list.add("20160614");
        list.add("20160714");
        list.add("20160822");
        list.add("20160927");
        list.add("20161106");
        list.add("20161210");
        list.add("20170116");
        list.add("20170217");
        list.add("20170322");
        list.add("20170427");
        list.add("20170602");
        list.add("20170709");
        list.add("20170810");
        list.add("20170923");
        list.add("20171121");
        list.add("20180103");
        list.add("20180302");
        list.add("20180421");
        list.add("20180523");
        list.add("20180623");
        list.add("20180805");
        list.add("20180913");

        for (int i = 1; i < list.size(); i++) {
            LocalDate now = DateTimeFormatUtil.yyyyMMdd2LocalDate(list.get(i));
            LocalDate past = DateTimeFormatUtil.yyyyMMdd2LocalDate(list.get(i - 1));

            System.out.println(DateTimeFormatUtil.betweenTime(past.atStartOfDay(), now.atStartOfDay(), ChronoUnit.DAYS));

        }

    }
}
