package com.faks.faks.service.user;

import com.faks.faks.model.command.user.FilterUserCommand;
import com.faks.faks.model.command.user.SaveUserCommand;
import com.faks.faks.model.dto.UserDTO;
import com.faks.faks.model.dto.base.base.ApiBaseDTO;
import com.faks.faks.model.dto.base.base.ApiBasePageDTO;
import com.faks.faks.model.entity.User;

public interface UserService {

    ApiBaseDTO<UserDTO> saveUser(SaveUserCommand command);

    ApiBasePageDTO<UserDTO> filterUser(FilterUserCommand command);

}
