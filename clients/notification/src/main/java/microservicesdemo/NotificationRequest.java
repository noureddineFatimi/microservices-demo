package microservicesdemo;

public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerName,
        String message
) {
}