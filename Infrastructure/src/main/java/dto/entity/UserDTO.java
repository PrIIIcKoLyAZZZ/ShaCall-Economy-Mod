package dto.entity;

import java.util.UUID;

public record UserDTO(
        Integer id,
        UUID uuid,
        String name,
        Integer teamId
) {
}
