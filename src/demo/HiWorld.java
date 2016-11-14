package demo;

/**
 * Created by 153770C on 11/14/2016.
 */

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/hi")
public class HiWorld {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return "Hi world!";
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    public String getXMLMessage() {
        return "<hi>Hi World!</hi>";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHTMLMessage() {
        return "<b>Hi World!</b>";
    }

}
