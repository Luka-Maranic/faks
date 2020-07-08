package com.faks.faks.service.user;

import com.faks.faks.model.command.base.ApiBasePageCommand;
import com.faks.faks.model.command.user.DeleteUserCommand;
import com.faks.faks.model.command.user.FilterUserCommand;
import com.faks.faks.model.command.user.SaveUserCommand;
import com.faks.faks.model.dto.auth.UserDTO;
import com.faks.faks.model.dto.base.base.ApiBaseDTO;
import com.faks.faks.model.dto.base.base.ApiBasePageDTO;

public interface UserService {

    ApiBaseDTO<UserDTO> saveUser(SaveUserCommand command);

    ApiBasePageDTO<UserDTO> filterUser(ApiBasePageCommand<FilterUserCommand> command);

    Boolean deleteUser(DeleteUserCommand command);

}
