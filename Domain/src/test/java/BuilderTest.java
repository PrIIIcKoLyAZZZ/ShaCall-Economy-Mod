import builder.account.TeamAccountBuilder;
import builder.account.UserAccountBuilder;
import builder.entity.TeamBuilder;
import builder.entity.UserBuilder;
import interfaces.Account;
import interfaces.Entity;
import org.junit.jupiter.api.Test;
import value_objects.Currency;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class BuilderTest {
    @Test
    void team_account_build_test() {
        Account testAccount;
        TeamAccountBuilder teamAccountBuilder = new TeamAccountBuilder();
        testAccount = teamAccountBuilder.setAccountId(1)
                .setAccountTeamId(1)
                .setAccountCurrency(new Currency("USDT"))
                .setAccountBalance(12)
                .build();

        assertEquals(12, testAccount.getBalance());
    }

    @Test
    void user_account_build_test() {
        Account testAccount;
        UserAccountBuilder userAccountBuilder = new UserAccountBuilder();
        testAccount = userAccountBuilder.setAccountId(1)
                .setAccountOwnerId(1)
                .setAccountCurrency(new Currency("USDT"))
                .setAccountBalance(12)
                .build();

        assertEquals(12, testAccount.getBalance());
    }

    @Test
    void team_build_test() {
        Entity testTeam;
        TeamBuilder teamBuilder = new TeamBuilder();
        testTeam = teamBuilder
                .setTeamId(1)
                .setTeamOwnerId(1)
                .setTeamName("one")
                .build();
        assertEquals("one", testTeam.getName());
    }

    @Test
    void user_build_test() {
        Entity testUser;
        UserBuilder userBuilder = new UserBuilder();
        testUser = userBuilder
                .setUserId(1)
                .setUserUuid(UUID.randomUUID())
                .setUserName("name")
                .build();

        assertEquals("name", testUser.getName());
    }
}
