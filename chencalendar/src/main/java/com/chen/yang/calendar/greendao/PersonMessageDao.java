package com.chen.yang.calendar.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author Chenhong
 * @date 2020/3/12.
 * @des
 */
@Entity
public class PersonMessageDao {
    @Id(autoincrement = true)
    private Long id;
    private String name;
    private String type1;
    private String day1;
    private String type2;
    private String day2;
    private String type3;
    private String day3;
    private String type4;
    private String day4;
    private String type5;
    private String day15;
    private String type6;
    private String day6;
    private String type7;
    private String day7;
    private String type8;
    private String day8;


    public PersonMessageDao() {
    }

    @Generated(hash = 203853543)
    public PersonMessageDao(Long id, String name, String type1, String day1,
            String type2, String day2, String type3, String day3, String type4,
            String day4, String type5, String day15, String type6, String day6,
            String type7, String day7, String type8, String day8) {
        this.id = id;
        this.name = name;
        this.type1 = type1;
        this.day1 = day1;
        this.type2 = type2;
        this.day2 = day2;
        this.type3 = type3;
        this.day3 = day3;
        this.type4 = type4;
        this.day4 = day4;
        this.type5 = type5;
        this.day15 = day15;
        this.type6 = type6;
        this.day6 = day6;
        this.type7 = type7;
        this.day7 = day7;
        this.type8 = type8;
        this.day8 = day8;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getDay1() {
        return day1;
    }

    public void setDay1(String day1) {
        this.day1 = day1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getDay2() {
        return day2;
    }

    public void setDay2(String day2) {
        this.day2 = day2;
    }

    public String getType3() {
        return type3;
    }

    public void setType3(String type3) {
        this.type3 = type3;
    }

    public String getDay3() {
        return day3;
    }

    public void setDay3(String day3) {
        this.day3 = day3;
    }

    public String getType4() {
        return type4;
    }

    public void setType4(String type4) {
        this.type4 = type4;
    }

    public String getDay4() {
        return day4;
    }

    public void setDay4(String day4) {
        this.day4 = day4;
    }

    public String getType5() {
        return type5;
    }

    public void setType5(String type5) {
        this.type5 = type5;
    }

    public String getDay15() {
        return day15;
    }

    public void setDay15(String day15) {
        this.day15 = day15;
    }

    public String getType6() {
        return type6;
    }

    public void setType6(String type6) {
        this.type6 = type6;
    }

    public String getDay6() {
        return day6;
    }

    public void setDay6(String day6) {
        this.day6 = day6;
    }

    public String getType7() {
        return type7;
    }

    public void setType7(String type7) {
        this.type7 = type7;
    }

    public String getDay7() {
        return day7;
    }

    public void setDay7(String day7) {
        this.day7 = day7;
    }

    public String getType8() {
        return type8;
    }

    public void setType8(String type8) {
        this.type8 = type8;
    }

    public String getDay8() {
        return day8;
    }

    public void setDay8(String day8) {
        this.day8 = day8;
    }
}
