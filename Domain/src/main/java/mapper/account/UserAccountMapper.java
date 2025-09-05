package mapper.account;

import entities.accounts.UserAccount;
import dto.account.UserAccountDTO;

public class UserAccountMapper {
    public static UserAccountDTO toDto(UserAccount account) {
        return new UserAccountDTO(
                account.getId(),
                account.getOwnerId(),
                account.getCurrency().toString(),
                account.getBalance()
        );
    }
}
