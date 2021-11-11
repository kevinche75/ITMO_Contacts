package se.ifmo.refactoring.contacts.api;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.List;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/api/contacts")
public interface ContactService {

  @GET
  @Produces(APPLICATION_JSON)
  List<Contact> getAllContacts(final @BeanParam ContactFilter contactFilter);

  @POST
  @Produces(APPLICATION_JSON)
  @Consumes(APPLICATION_JSON)
  Contact saveContact(final Contact contact);
}
