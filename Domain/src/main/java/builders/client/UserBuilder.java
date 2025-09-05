package builders.client;

import dto.entity.UserDTO;
import entities.clients.User;
import interfaces.builder.EntityBuilder;

import java.util.UUID;

public class UserBuilder implements EntityBuilder<User, UserBuilder> {
    private Integer userId;
    private UUID userUuid;
    private String userName;
    private Integer userTeamId;

    public UserBuilder(Integer userId, UUID userUuid, String userName, Integer userTeamId) {
        this.userId = userId;
        this.userUuid = userUuid;
        this.userName = userName;
        this.userTeamId = userTeamId;
    }

    public UserBuilder() {
        userTeamId = null;
    }

    public static UserBuilder fromDto(UserDTO dto) {
        return new UserBuilder(
                dto.getId(),
                dto.getUuid(),
                dto.getName(),
                dto.getTeamId()
        );
    }

    @Override
    public User build() {
        if (userId == null || userUuid == null || userName == null)
            return null;
        return new User(
                userId,
                userUuid,
                userName,
                userTeamId);
    }

    @Override
    public UserBuilder self() {
        return this;
    }

    public UserBuilder setUserId(Integer userId) {
        this.userId = userId;
        return self();
    }

    public UserBuilder setUserUuid(UUID userUuid) {
        this.userUuid = userUuid;
        return self();
    }

    public UserBuilder setUserName(String userName) {
        this.userName = userName;
        return self();
    }

    public UserBuilder setUserTeamId(Integer userTeamId) {
        this.userTeamId = userTeamId;
        return self();
    }
}
