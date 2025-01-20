package meli.bootcamp.sprint1.repository;

import meli.bootcamp.sprint1.entity.User;

import java.util.List;

public interface IUserRepository {
    List<User> findAll();
}
