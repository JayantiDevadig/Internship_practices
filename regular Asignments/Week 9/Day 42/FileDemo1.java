import java.io.FileOutputStream;
import java.io.FileWriter;
    class FileDemo1{
  public static void main(String args[]){
    try{
      FileReader fr=new FileReader("jay.txt");
      int i;
      while((i=fr.read())!=-1){
        System.out.print((char)i);
      }
    }
    catch(Exception e){
      System.out.println(e);
    }

  }
}
