package stringpgms;

public class Pgm4 {

	public static void main(String[] args) {
		String s3 = "selenium webdriver is used for webapplication testing";
        String[] ar = s3.split(" ");
        for(String v : ar) {
            System.out.println(v);
            if(v.equals("webapplication")) {
                break;
            }
        }

	}

}
