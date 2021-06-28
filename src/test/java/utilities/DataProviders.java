package utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {


@DataProvider(name="getdata")
public Object[][] getdata() {
	return	new Object[][] {{"vishnu chapter","Vis100","10087","VisGanster"},{"vishnu chapter1","Vis101","10077","VisGanster"},
		{"vishnu chapter2","Vis102","10067","VisGanster"}};
	
}
}