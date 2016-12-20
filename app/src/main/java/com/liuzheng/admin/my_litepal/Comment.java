package com.liuzheng.admin.my_litepal;

import org.litepal.crud.DataSupport;

import java.util.Date;

/**
 * 作者：刘正
 * 时间：2016/12/20 0020
 * 作用：
 */

public class Comment extends DataSupport {

    private int id;

    private String content;

    private Date publishDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

}
