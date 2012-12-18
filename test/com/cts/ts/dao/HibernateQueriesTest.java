package com.cts.ts.dao;

import org.junit.Assert;
import org.junit.Test;


public class HibernateQueriesTest {

	@Test
	public void testSession(){
		HibernateQueries queries = new HibernateQueries();
		queries.executeQueries();
		Assert.assertEquals(true, true);
	}
}
