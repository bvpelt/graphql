package nl.bsoft.data.graphql;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import javax.websocket.ContainerProvider;
import javax.websocket.WebSocketContainer;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@Slf4j
@ContextConfiguration(classes = GraphqlApplication.class, loader = SpringBootContextLoader.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GraphqlApplicationTests {


    private WebSocketContainer container;
    private TestWebSocketClient client;


    @Before
    public void setup() {
        container = ContainerProvider.getWebSocketContainer();
        client = new TestWebSocketClient();
    }


    @Test
    void contextLoads() {
    }

    @Test
    public void testApp() {
        assertTrue("Sanity check", true);
    }
}
