import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import net.sf.jxls.exception.ParsePropertyException;
import net.sf.jxls.transformer.XLSTransformer;





public class JXLSExample {
    private static String templateFileName = "e:/test.xlt";
    private static String destFileName = "e:/test3.xls";
    
	public static void main(String[] args) throws IOException, ParsePropertyException, InvalidFormatException {
		ArrayList<HashMap<String,String>> reportTests = new ArrayList<HashMap<String,String>>();
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("money", "123");
		map.put("name", "Jack");
		map.put("name2", "James");
		map.put("no", "voajjewml");
		map.put("no2", "vooilk123");
		map.put("report", "test");
		reportTests.add(map);
		HashMap<String,String> map2 = new HashMap<String,String>();
		map2.put("money", "456");
		map2.put("name", "Bob");
		map2.put("name2", "Andy");
		map2.put("no", "889314");
		map2.put("no2", "09141");
		map2.put("report", "test2");
		reportTests.add(map2);
		//List<ReportTest> reportTests = new ArrayList<ReportTest>();
		/*
		ReportTest reportTest = new ReportTest();
		reportTest.setMoney("123");
		reportTest.setName("rrr");
		reportTest.setName2("yyy");
		reportTest.setNo("91321141");
		reportTest.setNo2("99888331");
		reportTest.setReport("ovoaofuas");
		reportTests.add(reportTest);
		ReportTest reportTest2 = new ReportTest();
		reportTest2.setMoney("456");
		reportTest2.setName("rrr1111");
		reportTest2.setName2("yyy1111");
		reportTest2.setNo("4666");
		reportTest2.setNo2("663");
		reportTest2.setReport("aaazzzz");
		reportTests.add(reportTest2);
		
		reportTest2 = new ReportTest();
		reportTest2.setMoney("433356");
		reportTest2.setName("rrr3331111");
		reportTest2.setName2("yy333y1111");
		reportTest2.setNo("46633336");
		reportTest2.setNo2("663333");
		reportTest2.setReport("aa1111azzzz");
		reportTests.add(reportTest2);
		
		reportTest2 = new ReportTest();
		reportTest2.setMoney("45aaa6");
		reportTest2.setName("rrraaa1111");
		reportTest2.setName2("yyaaaay1111");
		reportTest2.setNo("466ccc6");
		reportTest2.setNo2("66123123");
		reportTest2.setReport("aaa21222zzzz");
		reportTests.add(reportTest2);
		
		reportTest2 = new ReportTest();
		reportTest2.setMoney("45caasd6");
		reportTest2.setName("rr123231r1111");
		reportTest2.setName2("y123123yy1111");
		reportTest2.setNo("461231266");
		reportTest2.setNo2("6132163");
		reportTest2.setReport("aaa12312zzzz");
		reportTests.add(reportTest2);
		*/
	    //InputStream is = new FileInputStream("d:/test.xls");
	    //OutputStream os = new FileOutputStream("d:/test3.xls");
		  Map beans = new HashMap();
	        beans.put("reportTests", reportTests);
	        beans.put("index", 1);
	        beans.put("unit", "ด๚ธี");
	        beans.put("org", "test");
	        beans.put("srno", 1999999);
	        XLSTransformer transformer = new XLSTransformer();
			transformer.transformXLS(templateFileName, beans, destFileName);

	}

	private static List<ReportTest> generateExcelData() {
		List<ReportTest> col = new ArrayList<ReportTest>();
		ReportTest test = new ReportTest();
		test.setMoney("123");
		test.setName("rrr");
		test.setName2("yyy");
		test.setNo("91321141");
		test.setNo2("99888331");
		test.setReport("ovoaofuas");
		col.add(test);
		test = new ReportTest();
		test.setMoney("456");
		test.setName("rrr1111");
		test.setName2("yyy1111");
		test.setNo("4666");
		test.setNo2("663");
		test.setReport("aaazzzz");
		col.add(test);
		return col;
	}

}
