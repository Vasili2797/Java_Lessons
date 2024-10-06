package main.com.intro_to_java_EE.Lab01_SimpleMVC;

public class Contact{
    private long id;
    private String first_name;
    private String last_name;

    public Contact(long id, String first_name, String last_name){
        this.id=id;
        this.first_name=first_name;
        this.last_name=last_name;
    }
    public String getFirst_name(){
        return first_name;
    }
    public String getLast_name(){
        return last_name;
    }
    public long getId(){
        return id;
    }

//    @Override
//    public String toString() {
//        return "Contact{" +
//                "id=" + id +
//                ", first_name='" + first_name + '\'' +
//                ", last_name='" + last_name + '\'' +
//                '}';
//    }
    @Override
    public String toString(){
        return "Contact id="+id+"\tfirst name="+first_name+"\tlast name="+last_name;
    }
}
