package StringOnjavaTPoint_;

public class StringComparision {
    //There are only three ways to compare a string
    /* 1)Using equals() methoad
    2)By using == operator
    3)By CompareTo()Methoad
     */
    public static void main(String[] args){
        //by using equals and equalsIgnoreCase() methoad
        String s1="Sachin";
        String s2="Sachin";
        String s3= new String("SACHIN");
        System.out.println(s3.equals(s2));
        System.out.println(s3.equalsIgnoreCase(s2));
        //by == operator
        System.out.println(s2==s3);
        System.out.println(s1==s2);
        //by using compareTo() methoad
        System.out.println(s2.compareTo(s1));
        System.out.println(s3.compareTo(s2));

    }
}
