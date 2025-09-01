package mapper.account;

import entities.accounts.TeamAccount;
import dto.account.TeamAccountDTO;

public class TeamAccountMapper {
    public static TeamAccountDTO toDto(TeamAccount account) {
        return new TeamAccountDTO(
                account.getId(),
                account.getTeamId(),
                account.getCurrency().toString(),
                account.getBalance()
        );
    }
}
