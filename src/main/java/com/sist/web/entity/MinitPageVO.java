package com.sist.web.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MinitPageVO {
	private int curpage;
	private int totalpage;
	private int startPage;
	private int endPage;
}
