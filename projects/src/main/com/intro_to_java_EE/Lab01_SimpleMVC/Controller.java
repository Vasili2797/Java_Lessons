package main.com.intro_to_java_EE.Lab01_SimpleMVC;

public class Controller {
    String findAContact(String id){
        return LocalRepository.getContact(Long.parseLong(id)).toString();
    }
    public void addAContact(String id, String first_name, String last_name){
        long anId=Long.parseLong(id);
        LocalRepository.addContact(new Contact(anId,first_name,last_name));
    }
}
