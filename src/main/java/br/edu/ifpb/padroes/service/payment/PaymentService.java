package br.edu.ifpb.padroes.service.payment;

import br.edu.ifpb.padroes.service.payment.types.StrategyPayment;

public class PaymentService {

    public PaymentService(StrategyPayment strategyPayment){
        this.strategyPayment = strategyPayment;
    }
    private StrategyPayment strategyPayment;

    public Payment doPayment(PaymentService type){
        return strategyPayment.doPayment(type);
    }

}

