package interfaces.contracts.infrastructure;

import interfaces.EntityDTO;

public interface EntityRepository<T extends EntityDTO> {
    void save(T dto);
    T findById(Integer id);
}