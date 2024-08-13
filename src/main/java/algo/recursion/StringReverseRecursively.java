package algo.recursion;

public class StringReverseRecursively {

    String rev = "";
    public String recReverse (String str){
        rev = rev.concat(String.valueOf(str.charAt(str.length()-1)));
        if(str.length()==1){
            return rev;
        }
        str = str.substring(0,str.length()-1);
        return recReverse(str);
    }

    public static void main(String[] args) {
        StringReverseRecursively reverseRecursively = new StringReverseRecursively();
        System.out.println(reverseRecursively.recReverse("Krishnamoorthy Sundar"));
    }
}
