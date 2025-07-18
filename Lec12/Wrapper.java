
public class Wrapper {
    public static void main(String[] args) {
        int a = 9;
        Integer a1 = 9;
        System.out.println(a);
        System.out.println(a1);
        Long l = 9l;
        int i=a1;//Un _boxing
        int b=a;//Aut-Boxing
        Integer c1=19;
        Integer c2=19;
        Integer c3=191;
        Integer c4=191;
        System.out.println(c1==c2);
        System.out.println(c3==c4);
    }
}
