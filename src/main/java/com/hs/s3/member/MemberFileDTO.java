package com.hs.s3.member;

public class MemberFileDTO {

	private long num;
	private String id;
	private String fileName;
	private String originName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getOriginName() {
		return originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

}
