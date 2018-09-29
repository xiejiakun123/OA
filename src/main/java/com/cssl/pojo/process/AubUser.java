package com.cssl.pojo.process;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AubUser {

	private Long processId;
	
	private String typeNmae;	
	
	private Long deeply;    //紧急程度
	
	private String processName;	
	
	private String userName;//申请人姓名	
	
	private Date applyTime;
	
	private Long statusId;//审核人状态

	public AubUser(Long processId, String typeNmae, Long deeply, String processName, String userName, Date applyTime,
                   Long statusId) {
		super();
		this.processId = processId;
		this.typeNmae = typeNmae;
		this.deeply = deeply;
		this.processName = processName;
		this.userName = userName;
		this.applyTime = applyTime;
		this.statusId = statusId;
	}

	public AubUser() {
	}
}
