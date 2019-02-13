package org.kidding.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class BoardVO {

	private Integer bno;
	private String title, content, writer;
	private Date regdate, updatedate;
	
}
