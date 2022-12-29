package br.com.bruno.payment.paymentservice.resource.impl;

import br.com.bruno.payment.paymentservice.model.Payment;
import br.com.bruno.payment.paymentservice.resource.PaymentResource;
import br.com.bruno.payment.paymentservice.services.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/payments")
@RequiredArgsConstructor
public class PaymentResourceImpl implements PaymentResource {

  private final PaymentService paymentService;

  @Override
  public ResponseEntity<Payment> payment(final Payment payment) {
    this.paymentService.sendPayment(payment);

    return ResponseEntity.status(HttpStatus.CREATED).build();
  }
}
