package br.com.bruno.payment.paymentservice.services.impl;

import br.com.bruno.payment.paymentservice.model.Payment;
import br.com.bruno.payment.paymentservice.services.PaymentService;
import java.io.Serializable;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

  private final KafkaTemplate<String, Serializable> kafkaTemplate;


  @Override
  public void sendPayment(final Payment payment) throws InterruptedException {
    log.info("Recebi o pagamento {}", payment.toString());
    Thread.sleep(1000);
    log.info("Enviando pagamento....");
    this.kafkaTemplate.send("payment-topic", payment);
  }
}
