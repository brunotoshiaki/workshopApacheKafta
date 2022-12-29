package br.com.bruno.payment.paymentservice.services.impl;

import br.com.bruno.payment.paymentservice.model.Payment;
import br.com.bruno.payment.paymentservice.services.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {

  @Override
  public void sendPayment(final Payment payment) {
    log.info("PAYMENT_SERVICE_IMPL::: Recebi o pagamento {}", payment.toString());
  }
}
