package com.alex.pojo;

import org.springframework.lang.Nullable;

public class Works {


    private int works_id;

    private int author_id;
    private String works_name;
    private String works_data;
    private String works_description;
    private String works_static_image;
    private String works_short_description;

    public Works() {
    }

    public Works(int works_id, int author_id, String works_name, String works_data, String works_description, String works_static_image, String works_short_description) {
        this.works_id = works_id;
        this.author_id = author_id;
        this.works_name = works_name;
        this.works_data = works_data;
        this.works_description = works_description;
        this.works_static_image = works_static_image;
        this.works_short_description = works_short_description;
    }

    public int getWorks_id() {
        return works_id;
    }

    public void setWorks_id(int works_id) {
        this.works_id = works_id;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getWorks_name() {
        return works_name;
    }

    public void setWorks_name(String works_name) {
        this.works_name = works_name;
    }

    public String getWorks_data() {
        return works_data;
    }

    public void setWorks_data(String works_data) {
        this.works_data = works_data;
    }

    public String getWorks_description() {
        return works_description;
    }

    public void setWorks_description(String works_description) {
        this.works_description = works_description;
    }

    public String getWorks_static_image() {
        return works_static_image;
    }

    public void setWorks_static_image(String works_static_image) {
        this.works_static_image = works_static_image;
    }

    public String getWorks_short_description() {
        return works_short_description;
    }

    public void setWorks_short_description(String works_short_description) {
        this.works_short_description = works_short_description;
    }

    @Override
    public String toString() {
        return "Works{" +
                "works_id=" + works_id +
                ", author_id=" + author_id +
                ", works_name='" + works_name + '\'' +
                ", works_data='" + works_data + '\'' +
                ", works_description='" + works_description + '\'' +
                ", works_static_image='" + works_static_image + '\'' +
                ", works_short_description='" + works_short_description + '\'' +
                '}';
    }
}
