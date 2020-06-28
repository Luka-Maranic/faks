package com.faks.faks.model.command.user;

import com.faks.faks.model.entity.User;
import lombok.Data;

@Data
public class SaveUserCommand {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String position;
    private Boolean active;

    //TODO password encoder
    public User toEntity (){
        User user = new User();
        user.setId(this.id);
        user.setFirstName(this.firstName);
        user.setLastName(this.lastName);
        user.setEmail(this.email);
        user.setPassword(this.password);
        user.setPosition(this.position);
        user.setActive(this.active);

        return user;
    }

}
