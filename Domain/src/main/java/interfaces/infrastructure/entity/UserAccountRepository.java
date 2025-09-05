package interfaces.infrastructure.entity;

import dto.account.UserAccountDTO;
import interfaces.infrastructure.EntityRepository;

import java.util.List;

public interface UserAccountRepository extends EntityRepository<UserAccountDTO> {
    List<UserAccountDTO> findAllByOwnerId(Integer id);
    List<UserAccountDTO> findAllByCurrency(String currency);
}
