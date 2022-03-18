package lec11_java_api;

import java.util.regex.Pattern;

public class ApiPattern {

	public static void main(String[] args) {
		// Á¤±ÔÇ¥Çö½Ä (Regular Expression)
		// Æ¯Á¤ÇÑ ±ÔÄ¢À» °¡Áø ¹®ÀÚ¿­ÀÇ ÁıÇÕÀ» Ç¥ÇöÇÏ±â À§ÇØ ¾²´Â Çü½Ä
		// ÀüÈ­¹øÈ£, ÁÖ¹Îµî·Ï¹øÈ£, ÀÌ¸ŞÀÏ µî°ú °°ÀÌ Á¤ÇØÁø Çü½Ä¿¡
		// ´ëÇØ Á¤±ÔÇ¥Çö½Ä + PatternÀ» ÀÌ¿ëÇÏ¿© °ËÁõÇÒ ¼ö ÀÖ´Ù.
		
		// ¼ıÀÚ¸¸ Á¸ÀçÇÏ´ÂÁö °ËÁõ
		String regex = "[0-9]*";
		String example = "123432";
		boolean result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " °á°ú = " + result);
		
		// ¼ıÀÚ °ËÁõ µÎ¹øÂ°
		regex = "\\d*"; // == regex = "[0-9]"*
		example = "783413";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " °á°ú = " + result);
		
		System.out.println("\n==================================\n");
		
		// ¾ËÆÄºª¸¸ Á¸ÀçÇÏ´ÂÁö °ËÁõ
		regex = "[a-zA-Z]*";
		example = "dwdaf dad";		// ¶ç¾î¾²±â°¡ ÀÖ¾îµµ ¾ÈµÊ.
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " °á°ú = " + result);
		
		// ¶ç¾î¾²±â Æ÷ÇÔ
		regex = "[a-zA-Z ]*";	
		regex = "[a-zA-Z\\s]*"; 	// Á¤¼®´ë·Î¸é °ø¹éÀ» ³ªÅ¸³»´Â \\s ³ÖÀ½
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " °á°ú = " + result);
		
		
		System.out.println("\n==================================\n");
		
		// ÇÑ±Û·Î¸¸ Á¸ÀçÇÏ´ÂÁö °ËÁõ
		regex = "[°¡-ÆR]*";
		example = "Á¤Âù¿õ";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " °á°ú = " + result);
		
		System.out.println("\n===================================\n");
		
		
		// ºñ¹Ğ¹øÈ£ ÆĞÅÏ
		// ¿µ¾î¿Í ¼ıÀÚ·Î¸¸ ±¸¼º
		regex = "[a-zA-Z\\d]*";	// == regex = "\\w*";
		regex = "\\w*";
		example = "abc123";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " °á°ú = " + result);
		
		
		// ¿µ¾î¿Í ¼ıÀÚ + Æ¯¼ö¹®ÀÚ(ÇÊ¼ö ¾Æ´Ñ)
		regex = "[\\w!@#$%^&*)(-_+=]*";
		example = "nextit28850";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " °á°ú = " + result);
		
		
		// ¼ıÀÚ, ¿µ¾î ¼Ò¹®ÀÚ ¹× ´ë¹®ÀÚ, Æ¯¼ö¹®ÀÚ°¡ °¢°¢ 1°³ ÀÌ»ó(?=.*[])
		// Æ÷ÇÔµÇ¸ç, ºñ¹Ğ¹øÈ£ ÀÚ¸®¼ö°¡ 8~20ÀÚ¸®ÀÎÁö.{8,20}
//		regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*)(-_=+]).{8,20}$";
		regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$";
		example = "nextIt1234#";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " °á°ú = " + result);
		
		// 6ÀÚ¸® ¼ıÀÚ ºñ¹Ğ¹øÈ£ Áß 3ÀÚ¸® ÀÌ»ó ¹İº¹ ±İÁö
		regex = "^.*(\\d)\\1\\1.*$";
		example = "122234";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " °á°ú = " + result);
		
		
		regex = "[\\d]{6}";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " °á°ú = " + result);
		
		
		System.out.println("\n========================================\n");
		
		// ÀÌ¸ŞÀÏ Çü½Ä È®ÀÎ
		regex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z]+$";		// ¹®ÀÚ¿­Ç¥Çö \\
		example = "adbad123@gmail.com";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " °á°ú = " + result);
		
		// ¿¬¶ôÃ³ Çü½Ä È®ÀÎ
		regex = "^[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}$";
		example = "010-9133-4345";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " °á°ú = " + result);
		
		
		
		
	}	// main Á¾·á
}