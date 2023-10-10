package StringOnjavaTPoint_;

public class StringConcatination {
    public static void main(String[] args){
//        String s="Sachin"+"Tendulkar";
        String s1="Sachin ";
        String s2="Tendulkar";
        String s3=s1.concat(s2);
        System.out.println(s3);//Sachin Tendulkar
        String s=50+30+"Sachin"+40+40;
        System.out.println(s);
    }
}
