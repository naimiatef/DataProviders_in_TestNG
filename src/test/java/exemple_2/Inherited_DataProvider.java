package exemple_2;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import exemple_1.DP;

/*
 * on peut hérité les dataprovider une autre class 
 */

public class Inherited_DataProvider {

	  @Test (dataProvider = "data-provider", dataProviderClass = DP.class)
	    public void myTest (String val) {
	      System.out.println("Statut actuel : " + val);
	  }
 
}
