package com.example.administrator.flyfish.Entiy;

import org.litepal.crud.DataSupport;

public class School extends DataSupport {
    private Area area;

    private  String name;

    private  String code;

    private  String sort;

    private boolean is211;

    private boolean is985;

    private String photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public boolean isIs211() {
        return is211;
    }

    public void setIs211(boolean is211) {
        this.is211 = is211;
    }

    public boolean isIs985() {
        return is985;
    }

    public void setIs985(boolean is985) {
        this.is985 = is985;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
