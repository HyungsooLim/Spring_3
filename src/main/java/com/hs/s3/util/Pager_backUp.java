package com.hs.s3.util;

public class Pager_backUp {

	private long perPage = 10;
	private long perBlock = 5;

	private long curPage;
	private long startRow;
	private long lastRow;

	private long startNum;
	private long lastNum;
	private boolean pre; // 이전 block O -> true X -> false
	private boolean next; // 다음 block O -> true X -> false

	private String kind; // 검색할 컬럼명
	private String search; // 검색어

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getSearch() {
		if (this.search == null) {
			this.search = "";
		}
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public boolean isPre() {
		return pre;
	}

	public void setPre(boolean pre) {
		this.pre = pre;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public long getCurPage() {
		if (this.curPage < 1) {
			this.curPage = 1;
		}
		return curPage;
	}

	public void setCurPage(long curPage) {
		if (curPage < 1) {
			curPage = 1;
		}
		this.curPage = curPage;
	}

	public long getStartRow() {
		return startRow;
	}

	public void setStartRow(long startRow) {
		this.startRow = startRow;
	}

	public long getLastRow() {
		return lastRow;
	}

	public void setLastRow(long lastRow) {
		this.lastRow = lastRow;
	}

	public long getStartNum() {
		return startNum;
	}

	public void setStartNum(long startNum) {
		this.startNum = startNum;
	}

	public long getLastNum() {
		return lastNum;
	}

	public void setLastNum(long lastNum) {
		this.lastNum = lastNum;
	}

	public void makeRow() {
		long startRow = (this.getCurPage() - 1) * perPage + 1;
		long lastRow = this.getCurPage() * perPage;

		this.setStartRow(startRow);
		this.setLastRow(lastRow);
	}

	public void makeNum(long totalCount) {
		// 2. totalPage
		long totalPage = totalCount / perPage;
		if (totalCount % perPage != 0) {
			totalPage++;
		}

		// 3. totalBlock
		long totalBlock = totalPage / perBlock;
		if (totalPage % perBlock != 0) {
			totalBlock++;
		}

		// 4. curBlock
		long curBlock = this.getCurPage() / perBlock;
		if (this.getCurPage() % perBlock != 0) {
			curBlock++;
		}

		// 5. startNum, lastNum
		long startNum = (curBlock - 1) * perBlock + 1;
		long lastNum = curBlock * perBlock;

		// 6. curBlock이 마지막 block일때(totalBlock)
		if (curBlock == totalBlock) {
			lastNum = totalPage;
		}

		this.setStartNum(startNum);
		this.setLastNum(lastNum);

		// 7. 이전, 다음 block 존재 여부
		// 이전
		if (curBlock != 1) {
			this.setPre(true);
		}

		// 다음
		if (curBlock != totalBlock) {
			this.setNext(true);
		}
	}

}
