package interfaces.contracts.infrastructure.entity;

import dto.account.TeamAccountDTO;
import interfaces.contracts.infrastructure.EntityRepository;

import java.util.List;

public interface TeamAccountRepository extends EntityRepository<TeamAccountDTO> {
    List<TeamAccountDTO> findByOwnerId(Integer id);
    TeamAccountDTO findByCurrency(String currency);
}
