package br.edu.ifpb.padroes.service.notification;

import br.edu.ifpb.padroes.domain.Customer;

public class EmailListener implements EventListener{
    private String emailAdministration = "contact@food-store.com";

    @Override
    public  void  update(String eventType, String message){
        System.out.println("Email to"+ emailAdministration);
    }

}
