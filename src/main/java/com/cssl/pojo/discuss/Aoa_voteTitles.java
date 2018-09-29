package com.cssl.pojo.discuss;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by asus on 2018/9/26.
 */
@Getter
@Setter
public class Aoa_voteTitles {
    private int title_id;
    private String color;
    private String title;
    private Aoa_voteList voteList;

    public Aoa_voteTitles(String color, String title, Aoa_voteList voteList) {
        this.color = color;
        this.title = title;
        this.voteList = voteList;
    }

    public Aoa_voteTitles() {
    }
}
