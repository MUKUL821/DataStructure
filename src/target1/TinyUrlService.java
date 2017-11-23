package target1;

import java.util.HashMap;

public class TinyUrlService {

	 HashMap<Integer, String> stolg;
	 HashMap<String, Integer> ltos;
	 int size;
	 String elements;
	 
	 public TinyUrlService(){
	     stolg = new HashMap<Integer, String>();
	     ltos = new HashMap<String, Integer>();
	     size = stolg.size();
	     elements = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	   
	 }
	 
	 public static void main(String[] args) {
		 String m = "77";
		 System.out.println(Integer.valueOf(m));
		 
		 TinyUrlService obj = new TinyUrlService();
	     String res = obj.encode("http://site.douban.com/chuan");
	 System.out.println("Ans encode is!"+res);
	     
	 String res2 = obj.decode(res);
	 
	  System.out.println("Ans is!"+res2);
	 }
	 
	 
	 public String encode(String longURL){
	      StringBuilder shorturl = new  StringBuilder("");
	 int n = size+1;
	 stolg.put(n, longURL);
	 ltos.put(longURL, n);
	 System.out.println("n ise encoded"+n);
	 
	 while(n >0){
	     char ch = elements.charAt(n%62);
	     shorturl.append(ch);
	     n = n/62;  
	 }
	 while( shorturl.length()<6)
	     shorturl.append('0');
	     
	 return "http://tiny.url/" +shorturl.toString();
	 }
	 
	 public String decode(String shortURL){
	     // calculate n;
	 shortURL = shortURL.substring("http://tiny.url/".length());
	 int n =1;
	 System.out.println("shortURL "+shortURL);
	 for(int i = 5; i >=0; i-- ){
	     char ch = shortURL.charAt(i);
	     if(ch > '0' && ch < '9')
	     n = n*62 + (ch-'0');
	 if(ch > 'a' && ch < 'z' )
	      n = n*62 + (ch-'a') + 10;
	 if(ch > 'A' && ch < 'Z' )
	      n = n*62 + (ch-'A') + 36;
	 }
	 System.out.println("n is!"+n);
	 return stolg.get(n);
 }

}
