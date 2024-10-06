/*
    Chapter 5 Finding elements Using Stream API on Youtube
*/
package main.com.Personal_project_folder.API.StreamMapCollectionsExample;

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