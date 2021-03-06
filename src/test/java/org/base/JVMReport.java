package org.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String json) {
		
		File loc = new File(System.getProperty("User.dir")+"\\src\\test\\resources\\Reports\\JVMReport");
		
		Configuration con = new Configuration(loc, "FootLocker");
		con.addClassifications("BrowserName", "Chrome");
		
		List<String> jsonFiles = new LinkedList<String>();
		jsonFiles.add(json);
		
		ReportBuilder rb = new ReportBuilder(jsonFiles, con);
		rb.generateReports();		
	}
}
