package br.edu.ifpb.padroes.service.payment.types;

import br.edu.ifpb.padroes.service.payment.Payment;
import br.edu.ifpb.padroes.service.payment.PaymentService;

public interface StrategyPayment
{
    public Payment doPayment(PaymentService paymentType);
}
