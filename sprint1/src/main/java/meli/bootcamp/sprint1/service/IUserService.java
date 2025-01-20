package meli.bootcamp.sprint1.service;

import meli.bootcamp.sprint1.dto.UserDto;
import java.util.List;

public interface IUserService {
    List<UserDto> getUsers();
}
