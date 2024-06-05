package org.acme;

import com.launchdarkly.sdk.LDContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import com.launchdarkly.sdk.*;
import com.launchdarkly.sdk.server.*;

@Path("/hello")
public class GreetingResource {

    LDClient client = new LDClient("sdk-key-123abc");
    /* LDContext context = LDContext.builder("context-key-123abc")
            .name("Sandy")
            .build();

    String stringFlagValue = client.stringVariation("flag-key-123abc", context, "disabled");

*/


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "disabled";
    }
}
