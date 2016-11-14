package demo;

import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * Created by 153770C on 11/14/2016.
 */
@Path("/book")

public class Book {
    String title;
    String description;
    String author;
    int year;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getResource(){
        Gson gson = new Gson();
        return gson.toJson(new Book());
    }
    public Book() {
        this.title = "Java Made Easy";
        this.description = "A book about how to learn Java in a painless manner";
        this.author = "Java Duke";
        this.year = 2016;
    }

}
