package interfaces.contracts.service.managingService;

import interfaces.Entity;

public interface ManagingService<E extends Entity> {
    E create();
}
