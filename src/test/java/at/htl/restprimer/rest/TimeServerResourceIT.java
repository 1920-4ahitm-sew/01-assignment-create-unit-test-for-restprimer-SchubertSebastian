package at.htl.restprimer.rest;

import org.junit.Before;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class TimeServerResourceIT {
    private Client client;
    private WebTarget tut;

    @Before
    public void initCLient() {
        this.client = ClientBuilder.newClient();
        this.tut = this.client.target("http://localhost:8080/restprimer/rs/time")
    }
}
