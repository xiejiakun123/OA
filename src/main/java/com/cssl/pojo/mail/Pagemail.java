package com.cssl.pojo.mail;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Pagemail {

	private Long mailId;//邮件id
	
	private Long mailType;//邮件类型（通知，公告，邮件）
	
	private Long mailStatusid;//邮件状态（一般，紧急，重要）
	
	private String mailTitle;//邮件主题
	
	private String inReceiver;//接收人（可以是多个）
	
	private Long mailFileid;//邮件附件id
	
	private Date mailCreateTime;//邮件创建时间
	
	private Boolean star=false;//是否星标
	
	private Boolean read=false;//是否已读
	
	public Pagemail(){}

	public Pagemail(Long mailId, Long mailType, Long mailStatusid, String mailTitle, String inReceiver,
                    Long mailFileid, Date mailCreateTime, Boolean star, Boolean read) {
		super();
		this.mailId = mailId;
		this.mailType = mailType;
		this.mailStatusid = mailStatusid;
		this.mailTitle = mailTitle;
		this.inReceiver = inReceiver;
		this.mailFileid = mailFileid;
		this.mailCreateTime = mailCreateTime;
		this.star = star;
		this.read = read;
	}


	@Override
	public String toString() {
		return "Pagemail [mailId=" + mailId + ", mailType=" + mailType + ", mailStatusid=" + mailStatusid
				+ ", mailTitle=" + mailTitle + ", inReceiver=" + inReceiver + ", mailFileid=" + mailFileid
				+ ", mailCreateTime=" + mailCreateTime + ", star=" + star + ", read=" + read + "]";
	}

	
	
}
