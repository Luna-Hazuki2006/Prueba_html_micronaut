package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Produces;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import io.micronaut.views.View;

import java.util.Collections;
import java.util.Map;

@Controller("/photos") 
public class FotosController {

    private final FotosClient fotosClient;

    public FotosController(FotosClient fotosClient) { 
        this.fotosClient = fotosClient;
    }

    @Produces(MediaType.TEXT_HTML) 
    @ExecuteOn(TaskExecutors.BLOCKING) 
    @View("fotos/show.html") 
    @Get("/{id}") 
    Map<String, Foto> findById(@PathVariable Long id) { 
        return Collections.singletonMap("foto", fotosClient.findById(id));
    }
}