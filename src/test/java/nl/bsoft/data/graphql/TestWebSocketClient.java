package nl.bsoft.data.graphql;

import javax.websocket.ClientEndpoint;
import javax.websocket.OnOpen;
import javax.websocket.Session;

@ClientEndpoint
public class TestWebSocketClient {
    Session session;

    @OnOpen
    public void onOpen(final Session session) {
        this.session = session;
    }
}
