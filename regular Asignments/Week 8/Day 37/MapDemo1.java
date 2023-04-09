import java.util.Scanner;
class MapDemo2{
  public static void main(String args[]){
    HashMap<Integer,String>map=new HashMap<Integer,String>();
    map.put(222,"jaya");
    map.put(232,"manish");
    map.put(242,"maya");
    map.putIfAbsent(221, "chaitra");
    map.putIfAbsent(220, "sneha");
    System.out.println(map);
  for(Map.Entry m:map.entrySet()){
    System.out.println(m.getKey()+" "+m.getValue());
  }
  }
}