package com.infosys.demo.infycart;


import java.sql.Connection;
import org.junit.Assert;
import org.junit.Test;
public class AppTest {
  @Test
  public void testGetConnection(){
	  Connection con=App.getConnection();
	  Assert.assertNotNull(con);
  }
}

