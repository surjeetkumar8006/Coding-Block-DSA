
public class Client {

    public static void main(String[] args) {
        // P obj = new P();
        // System.out.println(obj.d);
        // System.out.println(obj.d1);
        // obj.fun();
        // obj.fun1();
        // P obj = new C();
        // System.out.println(obj.d);//1
        // System.out.println(obj.d1);//10
        // System.out.println(((C) obj).d);
        // System.out.println(((C) obj).d2);
        // obj.fun();
        // obj.fun1();
        // ((C) obj).fun2();
        // ((C) obj).fun();

        C obj = new C();
        System.out.println(obj.d);//1
        System.out.println(obj.d1);//10
        System.out.println(((C) obj).d);
        System.out.println(((C) obj).d2);

    }
}
