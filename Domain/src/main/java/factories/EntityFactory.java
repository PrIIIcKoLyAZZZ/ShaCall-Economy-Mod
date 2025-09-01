package factories;

import builder.account.TeamAccountBuilder;
import builder.account.UserAccountBuilder;
import builder.client.TeamBuilder;
import builder.client.UserBuilder;

public class EntityFactory {
    public static TeamAccountBuilder createTeamAccountBuilder() {
        return new TeamAccountBuilder();
    }

    public static UserAccountBuilder createUserAccountBuilder() {
        return new UserAccountBuilder();
    }

    public static TeamBuilder createTeamBuilder() {
        return new TeamBuilder();
    }

    public static UserBuilder createUserBuilder() {
        return new UserBuilder();
    }
}
