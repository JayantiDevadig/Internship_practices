import java.util.StringTokenizer;
class LengthOfToken{
  public static void main(String args[]){
    StringTokenizer s=new StringTokenizer("Hello Hi");
    System.out.println("Length of each token is");
    while(s.hasMoreTokens()){
      System.out.println(s.nextToken().length());
    }
  }
}