package red.spring.creational.factory.abstracts;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import red.spring.creational.factory.abstracts.creditcard.CreditCardCancelPaymentRequest;
import red.spring.creational.factory.abstracts.creditcard.CreditCardChargePaymentRequest;
import red.spring.creational.factory.abstracts.creditcard.CreditCardGetBalancePaymentRequest;

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory{

  @Override
  public ChargePaymentRequest createChargeRequest() {
    return new CreditCardChargePaymentRequest();
  }

  @Override
  public CancelPaymentRequest createCancelRequest() {
    return new CreditCardCancelPaymentRequest();
  }

  @Override
  public GetBalancePaymentRequest createGetBalanceRequest() {
    // throw new UnsupportedOperationException("Get Balance is not supported in Credit Card");
    return new CreditCardGetBalancePaymentRequest();
  }
}
