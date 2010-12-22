//package com.sitepk.core;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Type;
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.Produces;
//import javax.ws.rs.WebApplicationException;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.MultivaluedMap;
//import javax.ws.rs.ext.MessageBodyReader;
//import javax.ws.rs.ext.MessageBodyWriter;
//import javax.ws.rs.ext.Provider;
//
//
//@Provider
//@Produces("application/json")
//@Consumes("application/json")
//public class GsonProvider implements MessageBodyWriter<Object>, MessageBodyReader<Object> {
//
//    private final Gson gson;
//
//    public GsonProvider() {
//        gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setDateFormat(
//                "yyyy-MM-dd").create();
//    }
//
//    public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations,
//            MediaType mediaType) {
//        return true;
//    }
//
//    public Object readFrom(Class<Object> type, Type genericType,
//            Annotation[] annotations, MediaType mediaType,
//            MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
//            throws IOException, WebApplicationException {
//        return gson.fromJson(new InputStreamReader(entityStream, "UTF-8"), type);
//    }
//
//    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations,
//            MediaType mediaType) {
//        return true;
//    }
//
//    public long getSize(Object obj, Class<?> type, Type genericType,
//            Annotation[] annotations, MediaType mediaType) {
//        return -1;
//    }
//
//    public void writeTo(Object obj, Class<?> type, Type genericType,
//            Annotation[] annotations, MediaType mediaType,
//            MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
//            throws IOException, WebApplicationException {
//        entityStream.write(gson.toJson(obj, type).getBytes("UTF-8"));
//    }
//
//}
