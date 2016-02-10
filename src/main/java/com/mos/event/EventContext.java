package com.mos.event;

import com.google.gson.Gson;
import com.google.inject.Inject;
import com.mos.messaging.IBrokerService;
import com.mos.messaging.IMessageProducer;
import com.mos.messaging.impl.ActivemqBrokerService;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;

import javax.jms.MessageListener;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;


/**
 * Just a temp class for Event resource, need to make it configurable
 *
 * @author Peter Chei
 */
public class EventContext {

    private static Logger logger = Logger.getLogger(EventContext.class.getName());

    @Inject
    private IBrokerService brokerService = new ActivemqBrokerService();

    private ConcurrentHashMap<String, IMessageProducer> publishers = new ConcurrentHashMap<String, IMessageProducer>(10);

    private static EventContext instance;

    public static final String FIX_IN = "MOS.FIX_IN";

    public static final String QUEUE_TRADE_OUT = "MOS.TRADE_OUT";
    public static final String QUEUE_TRADE_REPLY_IN = "MOS.TRADE_REPLY_IN";

    public static final String QUEUE_CONF_OUT = "MOS.CONF_OUT";
    public static final String QUEUE_CONF_REPLY_IN = "MOS.CONF_REPLY_IN";

    public static final String QUEUE_BLOCK_OUT = "MOS.BLOCK_OUT";
    public static final String QUEUE_BLOCK_REPLY_IN = "MOS.BLOCK_IN";

    public static final String QUEUE_CONTRACT_NOTE_OUT = "MOS.CONTRACT_NOTE_OUT";
    public static final String QUEUE_CONTRACT_NOTE_REPLY_IN = "MOS.CONTRACT_NOTE_REPLY_IN";

    public static final String TOPIC_HEARTBEAT_OUT = "MOS.HEARTBEAT_OUT";

    public static final String TOPIC_NOTIFICATION_OUT = "MOS.NOTIFICATION";

    private EventContext() {

        brokerService.bindToBrokerAtUrl("tcp://localhost:8081");

        IMessageProducer producer = null;

        producer = brokerService.getMessageProducer(new ActiveMQQueue(QUEUE_TRADE_OUT));
        publishers.put(QUEUE_TRADE_OUT, producer);

        producer = brokerService.getMessageProducer(new ActiveMQQueue(QUEUE_CONF_OUT));
        publishers.put(QUEUE_CONF_OUT, producer);

        producer = brokerService.getMessageProducer(new ActiveMQQueue(QUEUE_BLOCK_OUT));
        publishers.put(QUEUE_BLOCK_OUT, producer);

        producer = brokerService.getMessageProducer(new ActiveMQQueue(QUEUE_CONTRACT_NOTE_OUT));
        publishers.put(QUEUE_CONTRACT_NOTE_OUT, producer);

        producer = brokerService.getMessageProducer(new ActiveMQTopic(TOPIC_HEARTBEAT_OUT));
        publishers.put(TOPIC_HEARTBEAT_OUT, producer);

        producer = brokerService.getMessageProducer(new ActiveMQTopic(TOPIC_NOTIFICATION_OUT));
        publishers.put(TOPIC_NOTIFICATION_OUT, producer);


    }

    public void subscribe(String destination, MessageListener listener) {

    }

    public void unSubscribe(String destination, MessageListener listener) {

    }


    public static synchronized EventContext getInstance() {
        if (instance == null) {
            instance = new EventContext();
        }
        return instance;
    }

    public static void publish(String destination, Notification event) {

        String message = new Gson().toJson(event);
        logger.info(message);
        getInstance().getEventPublisher(destination).send(message);
    }

    private IMessageProducer getEventPublisher(String dest) {
        return publishers.get(dest);

    }
}
