package red.spring.creational.factory.abstracts.gopay;

import lombok.Getter;
import lombok.Setter;
import red.spring.creational.factory.abstracts.ChargePaymentRequest;
import red.spring.creational.factory.abstracts.PaymentMethod;

public class GopayChargePaymentRequest implements ChargePaymentRequest {

  @Getter
  @Setter
  private String id;

  @Getter
  @Setter
  private Long amount;

  @Override
  public Long getFee() {
    return 1000L;
  }

  @Override
  public PaymentMethod getMethod() {
    return PaymentMethod.GOPAY;
  }
}
