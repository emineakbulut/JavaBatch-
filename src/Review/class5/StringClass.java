package Review.class5;

public class StringClass {
    public static void main(String[] args) {
        String str = "Danilo";
        String str2 = new String("anything !@@345&*");
        System.out.println(str2);

        //returns the number of characters in the String variable including spaces
        System.out.println(str.length());
        System.out.println(str2.length());
        String name = "Mina 123 !@#";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        String newString = str.concat(name);
        System.out.println(newString);
        System.out.println(str + name);
        //always prefer the + to combine two strings
        // why because we can get an error in some cases when using the concat method how?
        String var1 = null;
        String var3 = new String();
        var3 = null;
        String var2 = "Burju";
        // System.out.println(var1.concat(var2)); ///Error Null pointer Exception
        // System.out.println(var2.concat(var1)); Error Null pointer Exception
        System.out.println(var1 + var2);
        System.out.println(var2 + var1);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sdjfvsjdf");

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("asnfvasdfj");
    }
}

