package repository;

import interfaces.infrastructure.DTO;
import interfaces.infrastructure.EntityRepository;

public class JSONEntityRepository implements EntityRepository {
    @Override
    public boolean save(DTO dto) {
        return false;
    }

    @Override
    public DTO findById() {
        return null;
    }

    @Override
    public DTO findByUUID() {
        return null;
    }
}
