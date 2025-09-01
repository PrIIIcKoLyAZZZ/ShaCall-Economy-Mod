package factories;

import builders.account.TeamAccountBuilder;
import builders.account.UserAccountBuilder;
import builders.client.TeamBuilder;
import builders.client.UserBuilder;

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
