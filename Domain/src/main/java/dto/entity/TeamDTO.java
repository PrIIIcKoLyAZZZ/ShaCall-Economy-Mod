package dto.entity;

import interfaces.infrastructure.DTO;

public class TeamDTO implements DTO {
    private Integer id;
    private Integer ownerId;
    private String name;

    public TeamDTO(Integer _id, Integer _ownerId, String _name) {
        this.id = _id;
        this.ownerId = _ownerId;
        this.name = _name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
