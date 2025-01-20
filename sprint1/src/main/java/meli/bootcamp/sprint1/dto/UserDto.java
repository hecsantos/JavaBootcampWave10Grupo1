package meli.bootcamp.sprint1.dto;
import lombok.AllArgsConstructor;
import meli.bootcamp.sprint1.entity.User;
import java.util.List;

public record UserDto(
        Integer id,
        String username) {
}


