package interfaces.infrastructure;

public interface EntityRepository {
    public boolean save(DTO dto);
    public DTO findById();
    public DTO findByUUID();
}
