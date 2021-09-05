package br.edu.ifpb.padroes.service.notification;

import java.io.File;

public interface EventListener
{
    void update(String eventType, String message);
}
