package com.xxkxxy.entity.base;

import com.xxkxxy.entity.Content;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 内容拓展实体抽象类
 */
@MappedSuperclass
public abstract class BaseContentExt implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer contentId;
    private String title;
    private String text;

    @OneToOne(mappedBy = "contentExt")
    private Content content;

    public BaseContentExt() {
        super();
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }
}
