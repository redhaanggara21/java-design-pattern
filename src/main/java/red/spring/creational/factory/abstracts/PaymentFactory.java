package red.spring.creational.factory.abstracts;

public interface PaymentFactory {

  ChargePaymentRequest createChargeRequest();

  CancelPaymentRequest createCancelRequest();

  GetBalancePaymentRequest createGetBalanceRequest();

}
