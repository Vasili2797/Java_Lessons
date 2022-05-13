/*
    Chapter 5 Finding elements Using Stream API on Youtube
*/
package main.com.Personal_project_folder.API;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapCollectionExample {
    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();
        users.add(new User(1,"John","secrete","john@mail.com"));
        users.add(new User(2,"Nick","password","nick@mail.com"));
        users.add(new User(3,"Samantha","newPassword","Samantha@mail.com"));

        List<UserDTO> usersDTO = new ArrayList<UserDTO>();
        for(User user:users){
            usersDTO.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
        }
        for(UserDTO dto: usersDTO){
            System.out.println(dto);
        }

        System.out.println();

        //using stream().map() method
        List<UserDTO> usersDTOs =users.stream().map((User user) -> new UserDTO(user.getId(), user.getUserName(),
                user.getEmail())).collect(Collectors.toList());
        usersDTOs.forEach(System.out::println);
    }
}

class UserDTO{
    private int id;
    private String userName;

    private String email;

    public UserDTO(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;

        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


class User{
    private int id;
    private String userName;
    private String password;
    private String email;

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
