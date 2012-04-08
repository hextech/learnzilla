package com.home.learn.zilla.service.spring.batch.dosomething;

import java.util.List;

public class LzStatementDetails {

	List<LzAccount> lzAccounts;
	
	public LzStatementDetails(CisCodeItem item){
		
	}

	public List<LzAccount> getLzAccounts() {
		return lzAccounts;
	}

	public void setLzAccounts(List<LzAccount> lzAccounts) {
		this.lzAccounts = lzAccounts;
	}
	
}
