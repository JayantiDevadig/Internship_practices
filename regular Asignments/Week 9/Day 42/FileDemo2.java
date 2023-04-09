import java.io.FileOutputStream;
import java.io.FileWriter;
    class FileDemo2{
      public static void main(String args[]){
try{
      FileOutputStream fw=new FileOutputStream("abc.txt");
       String str="hi hello how are you";
      byte bytes[]=str.getBytes();
      
      fw.write(bytes);
     fw.close();
     }
    catch(Exception e){
       System.out.println(e);
     }

      }

    }
}


    
    