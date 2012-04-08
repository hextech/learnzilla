package com.home.learn.zilla.service.spring.batch.dosomething;

import org.springframework.batch.item.ItemProcessor;

public class LzStatementProcessor implements ItemProcessor<CisCodeItem, LzStatementDetails> {

	public LzStatementDetails process(CisCodeItem item) throws Exception {

		return new LzStatementDetails(item);
	}
}
