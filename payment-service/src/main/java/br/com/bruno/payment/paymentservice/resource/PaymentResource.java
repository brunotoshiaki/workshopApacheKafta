package br.com.bruno.payment.paymentservice.resource;

import br.com.bruno.payment.paymentservice.model.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface PaymentResource {

  @PostMapping
  ResponseEntity<Payment> payment(@RequestBody final Payment payment);

}
