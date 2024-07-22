package com.scarabERP.ERP.jay.BBS;

public class QueryVO {
	private String key;
	private String word;
	private int page;
	private int size;
	private int strat;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getStrat() {
		return strat;
	}
	public void setStrat(int strat) {
		this.strat = strat;
	}
	@Override
	public String toString() {
		return "QueryVO [key=" + key + ", word=" + word + ", page=" + page + ", size=" + size + ", strat=" + strat
				+ "]";
	}
	

}
