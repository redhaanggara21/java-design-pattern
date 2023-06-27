package red.spring.creational.factory.abstracts;

import org.springframework.context.annotation.Configuration;
import red.spring.creational.factory.abstracts.gopay.GopayCancelPaymentRequest;
import red.spring.creational.factory.abstracts.gopay.GopayChargePaymentRequest;
import red.spring.creational.factory.abstracts.gopay.GopayGetBalancePaymentRequest;

@Configuration
public class GopayPaymentFactory implements PaymentFactory{

  @Override
  public ChargePaymentRequest createChargeRequest() {
    return new GopayChargePaymentRequest();
  }

  @Override
  public CancelPaymentRequest createCancelRequest() {
    return new GopayCancelPaymentRequest();
  }

  @Override
  public GetBalancePaymentRequest createGetBalanceRequest() {
    return new GopayGetBalancePaymentRequest();
  }
}
