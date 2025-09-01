package repository.entity;

import dto.entity.UserDTO;
import interfaces.infrastructure.entity.UserRepository;

import java.util.List;
import java.util.UUID;

public class JSONUserRepository implements UserRepository {
    @Override
    public UserDTO findByUUID(UUID uuid) {
        return null;
    }

    @Override
    public UserDTO findByName(String name) {
        return null;
    }

    @Override
    public List<UserDTO> findAllByTeamId(Integer id) {
        return List.of();
    }

    @Override
    public void save(UserDTO dto) {

    }

    @Override
    public UserDTO findById(Integer id) {
        return null;
    }
}
