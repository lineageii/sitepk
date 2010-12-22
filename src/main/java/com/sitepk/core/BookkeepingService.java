//package com.sitepk.core;
//
//import java.math.BigDecimal;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.PUT;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.Response;
//
//import com.sitepk.entity.Account;
//import com.sitepk.entity.Category;
//import com.sitepk.entity.Person;
//
//
//@Path("/")
//public class BookkeepingService {
//
//    private final BookkeepingManager manager;
//    private final SimpleDateFormat dateFormat;
//
//    public BookkeepingService() {
//        manager = BookkeepingManager.getManager();
//        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//    }
//
//    @Path("/person/")
//    @POST
//    @Consumes("application/json")
//    public Response createPerson(Person person) {
//        manager.createPerson(person);
//        return Response.ok().build();
//    }
//
//    @Path("/person/")
//    @PUT
//    @Consumes("application/json")
//    public Response updatePerson(Person person) {
//        manager.updatePerson(person);
//        return Response.ok().build();
//    }
//
//    @Path("/person/{id:\\d+}/")
//    @DELETE
//    public Response deletePerson(@PathParam("id")
//    int id) {
//        manager.deletePerson(id);
//        return Response.ok().build();
//    }
//
//    @Path("/person/{id:\\d+}/")
//    @GET
//    @Produces("application/json")
//    public Person readPerson(@PathParam("id")
//    int id) {
//        return manager.readPerson(id);
//    }
//
//    @Path("/persons/")
//    @GET
//    @Produces("application/json")
//    public Person[] readAllPersons() {
//        return manager.readAllPersons();
//    }
//
//    @Path("/person/{name}/")
//    @GET
//    @Produces("application/json")
//    public Person readPersonByName(@PathParam("name")
//    String name) {
//        return manager.readPersonByName(name);
//    }
//
//    @Path("/category/")
//    @POST
//    @Consumes("application/json")
//    public Response createCategory(Category category) {
//        manager.createCategory(category);
//        return Response.ok().build();
//    }
//
//    @Path("/category/")
//    @PUT
//    @Consumes("application/json")
//    public Response updateCategory(Category category) {
//        manager.updateCategory(category);
//        return Response.ok().build();
//    }
//
//    @Path("/category/{id:\\d+}/")
//    @DELETE
//    public Response deleteCategory(@PathParam("id")
//    int id) {
//        manager.deleteCategory(id);
//        return Response.ok().build();
//    }
//
//    @Path("/category/{id:\\d+}/")
//    @GET
//    @Produces("application/json")
//    public Category readCategory(@PathParam("id")
//    int id) {
//        return manager.readCategory(id);
//    }
//
//    @Path("/categories/")
//    @GET
//    @Produces("application/json")
//    public Category[] readAllCategories() {
//        return manager.readAllCategories();
//    }
//
//    @Path("/category/{name}/")
//    @GET
//    @Produces("application/json")
//    public Category readCategoryByName(@PathParam("name")
//    String name) {
//        return manager.readCategoryByName(name);
//    }
//
//    @Path("/account/")
//    @POST
//    @Consumes("application/json")
//    public Response createAccount(Account account) {
//        manager.createAccount(account);
//        return Response.ok().build();
//    }
//
//    @Path("/account/")
//    @PUT
//    @Consumes("application/json")
//    public Response updateAccount(Account account) {
//        manager.updateAccount(account);
//        return Response.ok().build();
//    }
//
//    @Path("/account/{id:\\d+}/")
//    @DELETE
//    public Response deleteAccount(@PathParam("id")
//    int id) {
//        manager.deleteAccount(id);
//        return Response.ok().build();
//    }
//
//    @Path("/account/{id:\\d+}/")
//    @GET
//    @Produces("application/json")
//    public Account readAccount(@PathParam("id")
//    int id) {
//        return manager.readAccount(id);
//    }
//
//    @Path("/accounts/")
//    @GET
//    @Produces("application/json")
//    public Account[] readAllAccounts() {
//        return manager.readAllAccounts();
//    }
//
//    @Path("/person/{id}/accounts/")
//    @GET
//    @Produces("application/json")
//    public Account[] readAccountsByPerson(@PathParam("id")
//    int id) {
//        return manager.readAccountsByPerson(id);
//    }
//
//    @Path("/category/{id}/accounts/")
//    @GET
//    @Produces("application/json")
//    public Account[] readAccountsByCategory(@PathParam("id")
//    int id) {
//        return manager.readAccountsByCategory(id);
//    }
//
//    @Path("/accounts/,{endDate:\\d{4}-\\d{2}-\\d{2}}/")
//    @GET
//    @Produces("application/json")
//    public Account[] readAccountsByDateBefore(@PathParam("endDate")
//    String endDate) throws ParseException {
//        return manager.readAccountsByDateBefore(dateFormat.parse(endDate));
//    }
//
//    @Path("/accounts/{beginDate:\\d{4}-\\d{2}-\\d{2}},{endDate:\\d{4}-\\d{2}-\\d{2}}/")
//    @GET
//    @Produces("application/json")
//    public Account[] readAccountsByDateBetween(@PathParam("beginDate")
//    String beginDate, @PathParam("endDate")
//    String endDate) throws ParseException {
//        return manager.readAccountsByDateBetween(dateFormat.parse(beginDate), dateFormat
//                .parse(endDate));
//    }
//
//    @Path("/accounts/{beginDate:\\d{4}-\\d{2}-\\d{2}},/")
//    @GET
//    @Produces("application/json")
//    public Account[] readAccountsByDateAfter(@PathParam("beginDate")
//    String beginDate) throws ParseException {
//        return manager.readAccountsByDateAfter(dateFormat.parse(beginDate));
//    }
//
//    @Path("/accounts/,{upperBound:\\d+\\.\\d{2}}/")
//    @GET
//    @Produces("application/json")
//    public Account[] readAccountsByAmountLessThan(@PathParam("upperBound")
//    BigDecimal upperBound) {
//        return manager.readAccountsByAmountLessThan(upperBound);
//    }
//
//    @Path("/accounts/{lowerBound:\\d+\\.\\d{2}},{upperBound:\\d+\\.\\d{2}}/")
//    @GET
//    @Produces("application/json")
//    public Account[] readAccountsByAmountBetween(@PathParam("lowerBound")
//    BigDecimal lowerBound, @PathParam("upperBound")
//    BigDecimal upperBound) {
//        return manager.readAccountsByAmountBetween(lowerBound, upperBound);
//    }
//
//    @Path("/accounts/{lowerBound:\\d+\\.\\d{2}},/")
//    @GET
//    @Produces("application/json")
//    public Account[] readAccountsByAmountMoreThan(@PathParam("lowerBound")
//    BigDecimal lowerBound) {
//        return manager.readAccountsByAmountMoreThan(lowerBound);
//    }
//
//}
