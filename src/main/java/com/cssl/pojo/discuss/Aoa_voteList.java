package com.cssl.pojo.discuss;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


/**
 * Created by asus on 2018/9/26.
 */
@Getter
@Setter
public class Aoa_voteList {
    private int vote_id;//主键id
    private Date start_time;//投票开始时间
    private Date end_time;//投票结束时间
    private int selectont;//判读单选多选
    private Aoa_discuss_list discuss;




}
