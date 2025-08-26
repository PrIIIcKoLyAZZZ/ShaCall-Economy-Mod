package dto.account;

public record UserAccountDTO(
        Integer id,
        Integer ownerId,
        String currency,
        double balance
) {
}
