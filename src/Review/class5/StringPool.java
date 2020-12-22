package Review.class5;

public class StringPool {
    public static void main(String[] args) {
        String name="LOL";
        String name1="LOL";
        String name2=new String("LOL");
        System.out.println(name==name1);
        System.out.println(name.equals(name1));



        System.out.println(name.hashCode());

        System.out.println(name==name2);
        System.out.println(name.equals(name2));

        //break till 8:40 //100

    }
}

