package mapper.entity;

import dto.entity.UserDTO;
import entity.User;

public class UserMapper {
    public static UserDTO toDto(User user) {
        return new UserDTO(
                user.getId(),
                user.getUuid(),
                user.getName(),
                user.getTeamId()
        );
    }
}
