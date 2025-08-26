package entity;

import interfaces.Entity;

public class Team implements Entity {
    private Integer _id;
    private Integer _ownerId;
    private String _name;

    public Team(Integer _id, Integer _ownerId, String _name) {
        this._id = _id;
        this._ownerId = _ownerId;
        this._name = _name;
    }

    @Override
    public Integer getId() {
        return this._id;
    }

    @Override
    public String getName() {
        return this._name;
    }

    public Integer getOwnerId() {
        return this._ownerId;
    }
}
