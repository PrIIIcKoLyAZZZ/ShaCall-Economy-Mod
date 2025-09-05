package interfaces.infrastructure.entity;

import dto.account.TeamAccountDTO;
import interfaces.infrastructure.EntityRepository;

public interface TeamAccountRepository extends EntityRepository<TeamAccountDTO> {
    TeamAccountDTO findByOwnerId(Integer id);
    TeamAccountDTO findByCurrency(String currency);
}
