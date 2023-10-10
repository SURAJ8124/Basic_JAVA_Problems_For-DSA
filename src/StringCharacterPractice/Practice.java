package StringCharacterPractice;
import java.util.*;
public class Practice {
    public static void main(String[] args){
        HashMap<Character,Integer>map= new HashMap<>();
        String s= "anagram";
        String t= "nagaram";
        int length=s.length();
         for(int i=0; i<length; i++) {
             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
         }
         for(int i=0; i<length; i++){
             map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)-1);
         }
          for(Map.Entry m:map.entrySet()){
           System.out.println(m.getKey()+" "+ m.getValue());
          }


         }


}
