package interfaces.infrastructure.entity;

import dto.entity.UserDTO;
import interfaces.infrastructure.EntityRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends EntityRepository<UserDTO> {
    UserDTO findByUUID(UUID uuid);
    UserDTO findByName(String name);
    List<UserDTO> findAllByTeamId(Integer id);
}
