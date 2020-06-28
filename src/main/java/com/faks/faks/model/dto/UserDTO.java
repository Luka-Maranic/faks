package com.faks.faks.model.dto;

import com.faks.faks.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String position;
    private Boolean active;

    public static UserDTO fromEntity (User user){
       UserDTO userDTO = new UserDTO();
       userDTO.setId(user.getId());
       userDTO.setFirstName(user.getFirstName());
       userDTO.setLastName(user.getLastName());
       userDTO.setEmail(user.getEmail());
       userDTO.setPosition(user.getPosition());
       userDTO.setActive(user.getActive());

        return userDTO;
    }

    public static List<UserDTO> fromList(List<User> users){
        return users.stream().map(UserDTO::fromEntity).collect(Collectors.toList());
    }


}
