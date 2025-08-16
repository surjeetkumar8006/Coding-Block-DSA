
public class Queue_client {

    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.Equeue(10);
        q.Equeue(20);
        System.out.println(q.Dqueue()); // should print 10
        q.Display();                    // should print 20
    }
}
