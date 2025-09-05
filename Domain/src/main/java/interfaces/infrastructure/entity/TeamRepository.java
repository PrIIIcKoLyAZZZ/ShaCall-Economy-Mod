package interfaces.infrastructure.entity;

import dto.entity.TeamDTO;
import interfaces.infrastructure.EntityRepository;

public interface TeamRepository extends EntityRepository<TeamDTO> {
    TeamDTO findByOwnerId(Integer id);
    TeamDTO findByName(String name);
}
