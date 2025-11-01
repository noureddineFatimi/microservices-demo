package microservicesdemo;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
