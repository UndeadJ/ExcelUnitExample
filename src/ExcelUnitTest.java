import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;




public class ExcelUnitTest {
	
	public static void main(String[] args) {
		
	}

	private static Object getCurrentDate(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);

		return sdf.format(new Date());
	}

}
