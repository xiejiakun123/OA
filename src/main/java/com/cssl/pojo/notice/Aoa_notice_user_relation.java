package com.cssl.pojo.notice;

import com.cssl.pojo.User.Aoa_user;
import com.cssl.pojo.note.Aoa_note_list;
import lombok.Getter;
import lombok.Setter;

/**
 * 通知与用户中间关联表，多一个字段，是否已读
 */
@Getter
@Setter
public class Aoa_notice_user_relation {
    private int relatin_id;
    private Aoa_note_list note_list;
    private Aoa_user user;
    private Boolean is_read=false;

    public Aoa_notice_user_relation(Aoa_note_list note_list, Aoa_user user, Boolean is_read) {
        this.note_list = note_list;
        this.user = user;
        this.is_read = is_read;
    }

    public Aoa_notice_user_relation() {
    }
}
