package com.spring.vo;

public class BoardVO {
	public int id;
	public String category_cd;
	public String title;
	public String content;
	public String tag;
	public int view_cnt;
	public String reg_id;
	public String reg_date;
	public String edit_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory_cd() {
		return category_cd;
	}
	public void setCategory_cd(String category_cd) {
		this.category_cd = category_cd;
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
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public int getView_cnt() {
		return view_cnt;
	}
	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
	}
	public String getReg_id() {
		return reg_id;
	}
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getEdit_date() {
		return edit_date;
	}
	public void setEdit_date(String edit_date) {
		this.edit_date = edit_date;
	}
	@Override
	public String toString() {
		return "BoardVO [id=" + id + ", category_cd=" + category_cd + ", title=" + title + ", content=" + content
				+ ", tag=" + tag + ", view_cnt=" + view_cnt + ", reg_id=" + reg_id + ", reg_date=" + reg_date
				+ ", edit_date=" + edit_date + "]";
	}
}

//`title` varchar(200) not null,
//`content` text not null,
//`tag` varchar(1000) null,
//`view_cnt` int default 0 not null,
//`reg_id` varchar(45) not null,
//`reg_date` datetime default CURRENT_TIMESTAMP not null,
//`edit_date` datetime default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP not null
