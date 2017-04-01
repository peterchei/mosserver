package com.mos.app;


import com.google.inject.Inject;
import com.mos.event.EventContext;
import com.mos.heartbeat.HeartBeatDaemon;
import com.mos.messaging.IBrokerServer;
import com.mos.web.WebModule;
import io.undertow.Undertow;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;
import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.ws.spi.http.HttpExchange;
import javax.xml.ws.spi.http.HttpHandler;

import java.io.IOException;

import static org.slf4j.LoggerFactory.getLogger;


public class MosApp {

    private static Logger logger = getLogger(MosApp.class);

    @Inject
    private IBrokerServer brokerServer;

    @Inject
    private WebModule webModule;

    @Inject
    private HeartBeatDaemon heartBeat;

    public MosApp() {
        init();
    }

    public static void main(String args[]) {



                Undertow server = Undertow.builder()
                        .addHttpListener(8080, "localhost").build();


                server.start();


        try {
            MosApp myApp = new MosApp();
            myApp.start();
        } catch (Exception e) {
             logger.error("Fatal Error. ", e);
        }
    }

    protected void init() {

        //TODO
        //Dependence injection

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        try {
            brokerServer = (IBrokerServer) context.getBean("embededBrokerServer");
        } catch (Exception e) {
            logger.error("Failed to start broker server.", e);
            System.exit(1);
        }


        heartBeat = new HeartBeatDaemon();

        webModule = new WebModule();

    }

    protected void start() throws Exception {

        brokerServer.start("tcp://localhost:8081");
        webModule.start();
        heartBeat.start();
        EventContext.getInstance();
        logger.info("*****************************************");
        logger.info("******   All services started.  *********");
        logger.info("*****************************************");

    }
}
