package red.spring.creational.factory.abstracts.bcaklikpay;

import lombok.Getter;
import lombok.Setter;
import red.spring.creational.factory.abstracts.CancelPaymentRequest;
import red.spring.creational.factory.abstracts.PaymentMethod;

public class BcaKlikpayCancelPaymentRequest implements CancelPaymentRequest {

  @Getter
  @Setter
  private String id;

  @Override
  public PaymentMethod getMethod() {
    return PaymentMethod.BCA_KLIKPAY;
  }
}
