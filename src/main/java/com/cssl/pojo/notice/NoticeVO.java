package com.cssl.pojo.notice;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by asus on 2018/9/27.
 */
@Getter
@Setter
public class NoticeVO {
    private Long noticeId;		//公告通知id
    private String content;		//通知内容
    private Boolean top;		//此消息是否置顶
    private Date modifyTime;	//修改时间
    private Date noticeTime;	//发布时间
    private Long statusId;		//状态id
    private Long typeId;		//类型id
    private String title;		//标题
    private Boolean read;		//是否已读

    public NoticeVO(Long noticeId, String content, Boolean top, Date modifyTime, Date noticeTime, Long statusId, Long typeId, String title, Boolean read) {
        this.noticeId = noticeId;
        this.content = content;
        this.top = top;
        this.modifyTime = modifyTime;
        this.noticeTime = noticeTime;
        this.statusId = statusId;
        this.typeId = typeId;
        this.title = title;
        this.read = read;
    }

    public NoticeVO() {
    }
}
