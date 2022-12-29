package br.com.bruno.payment.paymentservice.services;

import br.com.bruno.payment.paymentservice.model.Payment;

public interface PaymentService {

  void sendPayment(final Payment payment);

}
