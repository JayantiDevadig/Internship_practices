import java.util.*;
class StringDemo{
  static void characterCount(String str){
    char ch[]=str.toCharArray();
    String alpha="",digits="";
    for(int i=0;i<ch.length;i++){
      if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z'))
      {
        alpha=alpha+ch[i];
      }
      else if(ch[i]>='0'&&ch[i]<='9'){
        digits=digits+ch[i];
      }
      
  
    }
    String newString=alpha+digits;
    System.out.println(newString);
    
  }
 
  public static void main(String args[]){
  //   Scanner sc=new Scanner(System.in);
  //   String str1,subString;
  //   System.out.println("enter string1"); 
  //  str1=sc.nextLine();
  //   System.out.println("enter string2"); 
  // subString=sc.nextLine();
    characterCount("a1b2c3");
    
   
    
  }
}