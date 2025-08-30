package builder.entity;

import dto.entity.TeamDTO;
import entity.Team;
import interfaces.builder.EntityBuilder;

public class TeamBuilder implements EntityBuilder<Team, TeamBuilder> {
    private Integer teamId;
    private Integer teamOwnerId;
    private String teamName;

    public TeamBuilder(Integer teamId, Integer teamOwnerId, String teamName) {
        this.teamId = teamId;
        this.teamOwnerId = teamOwnerId;
        this.teamName = teamName;
    }

    public TeamBuilder() {
    }

    public static TeamBuilder fromDto(TeamDTO dto) {
        return new TeamBuilder(
                dto.getId(),
                dto.getOwnerId(),
                dto.getName()
        );
    }

    @Override
    public Team build() {
        if (teamId == null || teamOwnerId == null || teamName == null)
            return null;
        return new Team(
                teamId,
                teamOwnerId,
                teamName
        );
    }

    @Override
    public TeamBuilder self() {
        return this;
    }

    public TeamBuilder setTeamId(Integer teamId) {
        this.teamId = teamId;
        return self();
    }

    public TeamBuilder setTeamOwnerId(Integer teamOwnerId) {
        this.teamOwnerId = teamOwnerId;
        return self();
    }

    public TeamBuilder setTeamName(String teamName) {
        this.teamName = teamName;
        return self();
    }
}
