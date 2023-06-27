package red.spring.creational.factory.abstracts.gopay;

import lombok.Getter;
import lombok.Setter;
import red.spring.creational.factory.abstracts.CancelPaymentRequest;
import red.spring.creational.factory.abstracts.PaymentMethod;

public class GopayCancelPaymentRequest implements CancelPaymentRequest {

  @Getter
  @Setter
  private String id;

  @Override
  public PaymentMethod getMethod() {
    return PaymentMethod.GOPAY;
  }
}
