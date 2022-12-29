package br.com.bruno.payment.paymentservice.model;

import java.io.Serial;
import java.io.Serializable;


public record Payment(Long id, Long idUser, Long idProduct, String cardNumber) implements Serializable {

  @Serial
  private static final long serialVersionUID = 1;
}
