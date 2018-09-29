package com.cssl.pojo.process;

import lombok.Getter;
import lombok.Setter;

/**
 * 费用科目明细表
 */
@Getter
@Setter
public class Aoa_subject {
    private int subject_id;
    private int parent_id;
    private String name;

    public Aoa_subject(int parent_id, String name) {
        this.parent_id = parent_id;
        this.name = name;
    }

    public Aoa_subject() {
    }
}
