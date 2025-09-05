package interfaces.contracts.infrastructure.entity;

import dto.account.TeamAccountDTO;
import interfaces.contracts.infrastructure.EntityRepository;

public interface TeamAccountRepository extends EntityRepository<TeamAccountDTO> {
    TeamAccountDTO findByOwnerId(Integer id);
    TeamAccountDTO findByCurrency(String currency);
}
