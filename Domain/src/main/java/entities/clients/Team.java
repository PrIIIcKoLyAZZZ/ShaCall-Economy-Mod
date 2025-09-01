package entities.clients;

import interfaces.entities.Client;

public class Team implements Client {
    private final Integer id;
    private final Integer ownerId;
    private final String name;

    public Team(Integer id, Integer ownerId, String name) {
        this.id = id;
        this.ownerId = ownerId;
        this.name = name;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Integer getOwnerId() {
        return this.ownerId;
    }
}
