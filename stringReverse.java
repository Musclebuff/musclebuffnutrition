package musclebuffnutrition;

public class stringReverse extends charAt {
public static void main(String[] args) {
    String s = new String("peacock");
    char[] ca= s.toCharArray();
    for(int i=ca.length-1;i>=0; i--)
    {
        System.out.print(ca[i]);
    }
    System.out.println();
    str("Bharat");
    System.out.println();
    strbldr("joshi");
    strbfr("mikky");
}

}
class charAt{

    static void str(String s){
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
    static void strbldr(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
    }
    static void strbfr(String s){
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());
    }
}
