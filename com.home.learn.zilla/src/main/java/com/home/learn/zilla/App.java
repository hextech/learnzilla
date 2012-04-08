package com.home.learn.zilla;

import org.springframework.batch.core.launch.support.CommandLineJobRunner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        //new ClassPathXmlApplicationContext("dosomething-context.xml");
    	CommandLineJobRunner.main(new String[]{"dosomething-context.xml", "readListJob"});
    }
}
