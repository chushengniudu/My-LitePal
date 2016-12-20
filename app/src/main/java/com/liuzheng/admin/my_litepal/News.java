package com.liuzheng.admin.my_litepal;

import org.litepal.crud.DataSupport;

import java.util.Date;

/**
 * 作者：刘正
 * 时间：2016/12/20 0020
 * 作用：每一张表都应该对应一个模型(Model)，也就是说，如果我们想要建一张news表，就应该有一个对应的News模型类。新建一个News类，如下所示：
 */

public class News extends DataSupport {

    private int id;

    private String title;

    private String content;

    private Date publishDate;

    private int commentCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }


}
