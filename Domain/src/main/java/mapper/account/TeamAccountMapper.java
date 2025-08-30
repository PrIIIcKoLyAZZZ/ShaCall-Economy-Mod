package mapper.account;

import accounts.TeamAccount;
import dto.account.TeamAccountDTO;

public class TeamAccountMapper {
    public static TeamAccountDTO dto(TeamAccount account) {
        return new TeamAccountDTO(
                account.getId(),
                account.getTeamId(),
                account.getCurrency().toString(),
                account.getBalance()
        );
    }
}
