package red.spring.creational.factory.abstracts.creditcard;

import lombok.Getter;
import lombok.Setter;
import red.spring.creational.factory.abstracts.GetBalancePaymentRequest;
import red.spring.creational.factory.abstracts.PaymentMethod;

public class CreditCardGetBalancePaymentRequest implements GetBalancePaymentRequest {

  @Getter
  @Setter
  private String userId;

  @Override
  public PaymentMethod getMethod() {
    return PaymentMethod.CREDIT_CARD;
  }
}
