package entity;

import interfaces.Entity;

import java.util.UUID;

public class User implements Entity {
    private Integer _id;
    private UUID _uuid;
    private String _name;
    private Integer _teamId;

    public User(Integer _id, UUID _minecraftId, String _name, Integer _teamId) {
        this._id = _id;
        this._uuid = _minecraftId;
        this._name = _name;
        this._teamId = _teamId;
    }

    @Override
    public Integer getId() {
        return this._id;
    }

    @Override
    public String getName() {
        return this._name;
    }

    public UUID get_uuid() {
        return this._uuid;
    }
}
