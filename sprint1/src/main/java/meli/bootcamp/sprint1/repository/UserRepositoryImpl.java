package meli.bootcamp.sprint1.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import meli.bootcamp.sprint1.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements IUserRepository{

    private List<User> listOfUsers = new ArrayList<>();

    public UserRepositoryImpl() throws IOException{
        loadDataBase();
    }

    @Override
    public List<User> findAll() {
        return listOfUsers;
    }

    private void loadDataBase() throws IOException{
        File file;
        ObjectMapper objectMapper = new ObjectMapper();
        List<User> users;

        file = ResourceUtils.getFile("classpath:data/users.json");
        users = objectMapper.readValue(file, new TypeReference<List<User>>() {});

        listOfUsers = users;
    }
}
