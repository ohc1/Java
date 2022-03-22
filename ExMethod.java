package lec12_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

// ¿¡·¯ Ã³¸®ÇÒ ¸Ş¼ÒµåµéÀ» °¡Áö´Â Å¬·¡½º
public class ExMethod {
	
	// ÀÔ·Â¹ŞÀº µÎ ¼ıÀÚ¸¦ ³ª´« °ª ¸®ÅÏ
	public static int divide(int numA, int numB) throws BizException {
		if(numB == 0) {
			// 
			throw new BizException("numB´Â 0 ÀÌ¿ÜÀÇ ¼ıÀÚ¸¦ ÀÔ·ÂÇØ");
		}else {
			return numA/numB;
		}
	}
	
	// ÀÔ·Â¹ŞÀº ÀÌ¸§À» ÄÜ¼Ö¿¡ Ãâ·ÂÇÏ´Â ¸Ş¼Òµå
	// ¸¸¾à ÀÔ·Â¹ŞÀº ÀÌ¸§ÀÌ ¼ıÀÚ°Å³ª, empty¸é throw BizException
	public static void showName(String name) throws BizException {
		String regex = "[a-zA-Z°¡-ÆR]*";
		if(name.length() == 0) {
			throw new BizException(ErrConstants.API_0001, "ÀÌ¸§À» ÇÑ ±ÛÀÚ ÀÌ»ó ÀÔ·ÂÇØÁÖ¼¼¿ä. ÀÔ·ÂÇÑ °ª : " + name);
		}else if(!Pattern.matches(regex, name)) {
			throw new BizException(ErrConstants.API_0002, "¼ıÀÚ¸¦ ÀÔ·ÂÇÏÁö ¸¶¼¼¿ä. ÀÔ·ÂÇÑ °ª : " + name);
		}else {
			System.out.println(name);
		}
	}
	
	// ³¯Â¥ ¹®ÀÚ¿­À» ÀÔ·ÂÇÏ¸é ¹Ğ¸®ÃÊ·Î ¹Ù²ã¼­ ¸®ÅÏ
	// yyyy.MM.dd
	public static long dateMillSec(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp = sdf.parse(date);
		return temp.getTime();
	}
	
	
	
	
	
	
	
	
}