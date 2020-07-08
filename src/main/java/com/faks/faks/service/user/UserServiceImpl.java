package com.faks.faks.service.user;

import com.faks.faks.model.command.base.ApiBasePageCommand;
import com.faks.faks.model.command.user.DeleteUserCommand;
import com.faks.faks.model.command.user.FilterUserCommand;
import com.faks.faks.model.command.user.SaveUserCommand;
import com.faks.faks.model.dto.auth.UserDTO;
import com.faks.faks.model.dto.base.base.ApiBaseDTO;
import com.faks.faks.model.dto.base.base.ApiBasePageDTO;
import com.faks.faks.model.dto.base.base.PageDTO;
import com.faks.faks.model.entity.User;
import com.faks.faks.model.specification.UserSpecification;
import com.faks.faks.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    @Override
    public ApiBaseDTO<UserDTO> saveUser(SaveUserCommand command) {
        return ApiBaseDTO.generateSuccessResponse(UserDTO.fromEntity(userRepository.save(command.toEntity())));
    }

    @Transactional
    @Override
    public ApiBasePageDTO<UserDTO> filterUser(ApiBasePageCommand<FilterUserCommand> command) {
        Page<User> users = userRepository.findAll(UserSpecification.getUserSpecification(command.getCommand()),
                command.getPagination().generatePagingAndSortingRequest());
        return ApiBasePageDTO.setApiPageResponse(UserDTO.fromList(users.getContent()), PageDTO.ofPage(users));
    }

    @Override
    public Boolean deleteUser(DeleteUserCommand command) {
        userRepository.deleteById(command.getId());
        return true;
    }

}
