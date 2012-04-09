package com.home.learn.zilla.service.spring.batch.dosomething;

import java.util.List;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.file.ResourceAwareItemWriterItemStream;
import org.springframework.core.io.Resource;

public class LzStatementWriter implements ResourceAwareItemWriterItemStream<LzStatementDetails> {

	public void open(ExecutionContext executionContext)
			throws ItemStreamException {
		// TODO Auto-generated method stub
		
	}

	public void update(ExecutionContext executionContext)
			throws ItemStreamException {
		// TODO Auto-generated method stub
		
	}

	public void close() throws ItemStreamException {
		// TODO Auto-generated method stub
		
	}

	public void write(List<? extends LzStatementDetails> items)
			throws Exception {
		// TODO Auto-generated method stub
		for(LzStatementDetails item : items){
			System.out.println("Create statement for : "+ item);
		}
	}

	public void setResource(Resource resource) {
		// TODO Auto-generated method stub
		
	}

}
