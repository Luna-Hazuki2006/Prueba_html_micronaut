// package example.micronaut;

// import java.util.Collections;
// import java.util.Map;

// import io.micronaut.http.MediaType;
// import io.micronaut.http.annotation.Controller;
// import io.micronaut.http.annotation.Get;
// import io.micronaut.http.annotation.PathVariable;
// import io.micronaut.http.annotation.Produces;
// import io.micronaut.scheduling.TaskExecutors;
// import io.micronaut.scheduling.annotation.ExecuteOn;
// import io.micronaut.views.View;

// @Controller("/fotos") 
// public class FotosController {

//     private final FotosClient fotosClient;

//     public FotosController(FotosClient fotosClient) { 
//         this.fotosClient = fotosClient;
//     }

//     @Produces(MediaType.TEXT_HTML) 
//     @ExecuteOn(TaskExecutors.BLOCKING) 
//     @View("fotos/mostrar.html") 
//     @Get("/{id}") 
//     Map<String, Foto> findById(@PathVariable Long id) { 
//         return Collections.singletonMap("foto", fotosClient.findById(id));
//     }
// }