package  ${package};

import javax.ejb.Stateless;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import ${package}.model.ModelEntity;

@Stateless
@Path("${projectName}")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RestEndpoint {

    @PersistenceContext
    private EntityManager em;
    @Resource
    private EJBContext ejbContext;

    @GET
    public Response helloWorldResponse() {
        return Response.ok().entity("Hello World").build();
    }

    @POST
    public Response createEntity(ModelEntity modelEntity) {
        try {
            em.persist(modelEntity);
            return Response.ok().entity("entity created").build();
        } catch (Exception e) {
            ejbContext.setRollbackOnly();
        }

        return Response.ok().entity("test").build();
    }
}