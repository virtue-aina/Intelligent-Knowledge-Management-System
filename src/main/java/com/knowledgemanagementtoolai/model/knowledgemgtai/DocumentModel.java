package com.knowledgemanagementtoolai.model.knowledgemgtai;

import lombok.Data;

import javax.xml.stream.events.Comment;
import java.util.Date;
import java.util.List;

@Data
public class DocumentModel {
    private String id;
    private String title;
    private String content;
    private List<String> tags;
    private Date createdAt;
    private Date updatedAt;
    private User creator;
    private List<Comment> comments;

    public DocumentModel(String id, String title, String content, List<String> tags, Date createdAt, Date updatedAt, User creator, List<Comment> comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.tags = tags;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.creator = creator;
        this.comments = comments;
    }
    public  void addComment(Comment comment) {
        this.comments.add(comment);
    }
    public void addTag(String tag) {
       if(!this.tags.contains(tag)){
        this.tags.add(tag);}
    }
    public void removeTag(String tag) {
        this.tags.remove(tag);
    }
    public void updateContent(String newContent) {
        this.content = newContent;
        this.updatedAt = new Date();
    }
    public String getSummary() {
    return "Summary of" + this.title;
    }
}
