package com.cssl.pojo.note;

import com.cssl.pojo.User.Aoa_user;
import lombok.Getter;
import lombok.Setter;


/**
 * Created by asus on 2018/9/27.
 */
@Getter
@Setter
public class Aoa_receiver_note {
    private int id;
    private Aoa_user user;
    private Aoa_note_list note;

    public Aoa_receiver_note(Aoa_user user, Aoa_note_list note) {
        this.user = user;
        this.note = note;
    }

    public Aoa_receiver_note() {
    }
}
