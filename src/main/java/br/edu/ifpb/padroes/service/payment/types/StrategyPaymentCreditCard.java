package br.edu.ifpb.padroes.service.payment.types;

import br.edu.ifpb.padroes.service.payment.Payment;
import br.edu.ifpb.padroes.service.payment.PaymentService;

public class StrategyPaymentCreditCard implements StrategyPayment {
    public Payment doPayment(PaymentService paymentType){
        System.out.println("Pagamento no cartão de crédito");
        return null;
    }
}
