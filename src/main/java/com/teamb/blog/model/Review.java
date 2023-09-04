package com.teamb.blog.model;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

	@Column(name = "author")
    private String author;

    @Column(name = "createdtime")
    private LocalDateTime createdtime;
    
    @Column(name = "updatedtime")
    private LocalDateTime updatedtime;

	public Review() {
    }

    public Review(long id, String title, String content, String author, LocalDateTime createdtime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdtime = createdtime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDateTime getCreatedtime() {
		return createdtime;
	}

	public void setCreatedtime(LocalDateTime createdtime) {
		this.createdtime = createdtime;
	}
	
	 public LocalDateTime getUpdatedtime() {
			return updatedtime;
	}

	public void setUpdatedtime(LocalDateTime updatedtime) {
		this.updatedtime = updatedtime;
	}
}
