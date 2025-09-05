package entities.clients;

import interfaces.entities.Client;

import java.util.UUID;

public class User implements Client {
    private final Integer id;
    private final UUID uuid;
    private final String name;
    private Integer teamId;

    public User(Integer id, UUID uuid, String name, Integer teamId) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.teamId = teamId;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public Integer getTeamId() {
        return this.teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
}
