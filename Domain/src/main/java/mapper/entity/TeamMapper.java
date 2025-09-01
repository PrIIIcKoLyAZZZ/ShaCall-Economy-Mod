package mapper.entity;

import dto.entity.TeamDTO;
import entities.clients.Team;

public class TeamMapper {
    public static TeamDTO toDto(Team team) {
        return new TeamDTO(
                team.getId(),
                team.getOwnerId(),
                team.getName()
        );
    }
}
