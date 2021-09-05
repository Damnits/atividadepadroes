package br.edu.ifpb.padroes.service.log;

import br.edu.ifpb.padroes.service.notification.EventManager;

public class LogService {

    public LogService(LogHandler logHandler) {
        this.logHandler = logHandler;
        this.events = new EventManager("debug", "info", "error");
    }

    private LogHandler logHandler;
    public EventManager events;


    public void debug(String message) {
        logHandler.log("stack trace");
        logHandler.log(message);
        events.notify("debug", message);
    }

    public void info(String message) {
        logHandler.log(message);
        events.notify("info", message);
    }
    public void error(String message) {
        logHandler.log("error");
        logHandler.log(message);
        events.notify("error", message);
    }
}
