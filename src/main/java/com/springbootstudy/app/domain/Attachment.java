package com.springbootstudy.app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Attachment {
	private int file_id;
	private String original_name;
	private String saved_name;
	private String file_path;
	private int udate;
}
