package dto.account;

public record TeamAccountDTO(
        Integer id,
        Integer teamId,
        String currency,
        double balance
) {
}
