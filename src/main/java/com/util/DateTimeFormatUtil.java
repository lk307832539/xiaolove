package com.util;

import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeFormatUtil {
    public static LocalDate yyyyMMdd2LocalDate(String time) throws ParseException {
        DateTimeFormatter yyyyMMdd = DateTimeFormatter.ofPattern("yyyyMMdd");
        return LocalDate.parse(time, yyyyMMdd);
    }

    public static LocalDateTime yyyyMMdd2LocalDateTime(String time) throws ParseException {
        DateTimeFormatter yyyyMMdd = DateTimeFormatter.ofPattern("yyMMddHHmmss ");
        return LocalDateTime.parse(time, yyyyMMdd);
    }

    public static LocalDateTime date2LocalDateTime(Date date) {
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zone);
    }

    public static Date localDateTime2Date(LocalDateTime localDateTime) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return Date.from(instant);
    }

    public static LocalDate date2LocalDate(Date date) {
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zone).toLocalDate();
    }

    public static Date localDate2Date(LocalDate localDate) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDate.atStartOfDay().atZone(zone).toInstant();
        return Date.from(instant);
    }


    public static long betweenTime(LocalDateTime startTime, LocalDateTime endTime, ChronoUnit field) {
        Period period = Period.between(LocalDate.from(startTime), LocalDate.from(endTime));
        if (field == ChronoUnit.YEARS) return period.getYears();
        if (field == ChronoUnit.MONTHS) return period.getYears() * 12 + period.getMonths();
        return field.between(startTime, endTime);
    }

    public static void main(String[] args) throws ParseException {
        LocalDate start = yyyyMMdd2LocalDate("20180818");
        LocalDate end = yyyyMMdd2LocalDate("20180921");
        System.out.println(betweenTime(start.atStartOfDay(), end.atStartOfDay(), ChronoUnit.DAYS));
    }

}
