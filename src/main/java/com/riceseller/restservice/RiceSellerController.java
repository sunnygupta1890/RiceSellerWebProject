package com.riceseller.restservice;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("/entrycontroller")
public class RiceSellerController {

	@GET
	public Response getuser() {
		return Response.status(200).entity("getUser is called").build();

	}

	@GET
	@Path("/vip")
	public Response getVipUser() {
		return Response.status(200).entity("getVIPUser is called").build();

	}

	@GET
	@Path("/{name}")
	public Response getUserByName(@PathParam("name") String name) {

		return Response.status(200)
				.entity("getUserByName is called, name : " + name).build();

	}

	@POST
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getUserById(InputStream incomingData) {

		StringBuilder crunchifyBuilder = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
            String line = null;
            while ((line = in.readLine()) != null) {
                crunchifyBuilder.append(line);
            }
        } catch (Exception e) {
            System.out.println("Error Parsing: - ");
        }
        
        System.out.println("Data Received: " + crunchifyBuilder.toString());
		
		Gson gson = new Gson();
		String response = gson.toJson(null);
		System.out.println("I am sending this response to Android"+response);
		return Response.status(200).entity(response)
				.build();

	}

	@GET
	@Path("/username/{username : [a-zA-Z][a-zA-Z_0-9]}")
	public Response getUserByUserName(@PathParam("username") String username) {

		return Response.status(200)
				.entity("getUserByUserName is called, username : " + username)
				.build();

	}

	@GET
	@Path("/books/{isbn : \\d+}")
	public Response getUserBookByISBN(@PathParam("isbn") String isbn) {

		return Response.status(200)
				.entity("getUserBookByISBN is called, isbn : " + isbn).build();

	}

	@GET
	@Path("/{year}/{month}/{day}")
	public Response getUserHistory(@PathParam("year") int year,
			@PathParam("month") int month, @PathParam("day") int day) {

		String date = year + "/" + month + "/" + day;

		return Response.status(200)
				.entity("getUserHistory is called, year/month/day : " + date)
				.build();

	}

	// using qury params

	@GET
	@Path("/getName")
	public Response getUsers(@QueryParam("from") int from,
			@QueryParam("to") int to,
			@QueryParam("orderBy") List<String> orderBy) {

		return Response
				.status(200)
				.entity("getUsers is called, from : " + from + ", to : " + to
						+ ", orderBy" + orderBy.toString()).build();

	}

	/*
	 * @GET
	 * 
	 * @Path("/query") public Response getUsers1(
	 * 
	 * @DefaultValue("1000") @QueryParam("from") int from,
	 * 
	 * @DefaultValue("999")@QueryParam("to") int to,
	 * 
	 * @DefaultValue("name") @QueryParam("orderBy") List<String> orderBy) {
	 * 
	 * return Response .status(200) .entity("getUsers is called, from : " + from
	 * + ", to : " + to + ", orderBy" + orderBy.toString()).build();
	 * 
	 * }
	 */
	/*@GET
	@Path("{year}")
	public Response getBooks(@PathParam("year") String year,
			@MatrixParam("author") String author,
			@MatrixParam("country") String country) {

		return Response
				.status(200)
				.entity("getBooks is called, year : " + year + ", author : "
						+ author + ", country : " + country).build();

	}*/
	@POST
	@Path("/add")
	public Response addUser(
		@FormParam("name") String name,
		@FormParam("age") int age) {
 
		return Response.status(200)
			.entity("addUser is called, name : " + name + ", age : " + age)
			.build();
 
	}

}
