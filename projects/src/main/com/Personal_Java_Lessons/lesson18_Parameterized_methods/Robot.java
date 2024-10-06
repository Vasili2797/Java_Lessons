package main.com.Personal_Java_Lessons.lesson18_Parameterized_methods;

public class Robot<T extends Head> {

    private Body body;
    private T head;

    public void foo(Robot<?> ob){
        return ;
    }

    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }

    //
//    public Robot(Body body, T head) {
//        this.body = body;
//        this.head = head;
//    }
//
//    public Body getBody() {
//        return body;
//    }
//    public T getHead(){
//        return head;
//    }
//    public void setBody(Body body){
//        this.body=body;
//    }
//    public void setHead(T head){
//        this.head=head;
//    }
}
