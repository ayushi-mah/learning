
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/hell")
public class mypage {
@GET
@Produces(MediaType.TEXT_HTML)
public String sayHtmlHello() {
return "Hello from Jersey";
}
}