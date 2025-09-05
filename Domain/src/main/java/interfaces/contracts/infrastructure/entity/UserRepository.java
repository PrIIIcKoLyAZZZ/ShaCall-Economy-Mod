package interfaces.contracts.infrastructure.entity;

import dto.entity.UserDTO;
import interfaces.contracts.infrastructure.EntityRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends EntityRepository<UserDTO> {
    UserDTO findByUUID(UUID uuid);
    UserDTO findByName(String name);
    List<UserDTO> findAllByTeamId(Integer id);
}
