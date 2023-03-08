import java.util.Scanner;

public class String_Sort {

  public static void main(String[] args) {

       String s1 = "racbde";
       String s2 = "carbed";
       
       String sort1 = sort(s1);
       String sort2 = sort(s2);
       
       if(sort1.equals(sort2)) {
    	   System.out.println("Anagram");
       }else {
    	   System.out.println("not anagram");
       }
        
    }
  
  
  public static String sort(String s1)
  {
      char ch[]=s1.toCharArray();         
      String res=" ";
      
      for(int i=0; i<ch.length ; i++)
      {
          for(int j=i+1;j<ch.length; j++)
          {
              if(ch[i]>=ch[j])
              {
                  char m=ch[i];
                  ch[i]=ch[j];
                  ch[j]=m;
              }
          }
          
          res=res+ch[i];
          
      }

      return res;
  }
}
