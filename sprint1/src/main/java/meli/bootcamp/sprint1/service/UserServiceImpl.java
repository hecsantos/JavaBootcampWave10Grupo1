package meli.bootcamp.sprint1.service;

import meli.bootcamp.sprint1.dto.UserDto;
import meli.bootcamp.sprint1.entity.User;
import meli.bootcamp.sprint1.exception.NotFoundException;
import meli.bootcamp.sprint1.repository.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;

    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> getUsers() {
        List<UserDto> userList = userRepository.findAll().stream().map(this::convertUserToDto).collect(Collectors.toList());
        if (userList.isEmpty()){
            throw new NotFoundException("Nenhum usuario cadastrado");
        }
        return userList;
        }

    private UserDto convertUserToDto(User u){
        return new UserDto(
                u.getId(),
                u.getUsername()
        );
    }
}
