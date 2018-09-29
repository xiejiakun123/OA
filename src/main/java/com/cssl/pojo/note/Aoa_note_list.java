package com.cssl.pojo.note;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by asus on 2018/9/26.
 */
@Getter
@Setter
public class Aoa_note_list {
    private int note_id;
    private String content;
    private Date create_time;
    private String title;
    private int catalog_id;
    private int type_id;
    private int status_id;
    private int attach_id;
    private int is_collected;
    private int createman_id;
    private String receiver;

    public Aoa_note_list(String content, Date create_time, String title, int catalog_id, int type_id, int status_id, int attach_id, int is_collected, int createman_id, String receiver) {
        this.content = content;
        this.create_time = create_time;
        this.title = title;
        this.catalog_id = catalog_id;
        this.type_id = type_id;
        this.status_id = status_id;
        this.attach_id = attach_id;
        this.is_collected = is_collected;
        this.createman_id = createman_id;
        this.receiver = receiver;
    }

    public Aoa_note_list() {
    }
}
