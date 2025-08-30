package dto.entity;

import interfaces.infrastructure.DTO;

import java.util.UUID;

public class UserDTO implements DTO {
    private Integer id;
    private UUID uuid;
    private String name;
    private Integer teamId;

    public UserDTO(Integer id, UUID uuid, String name, Integer _teamId) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.teamId = _teamId;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
}
