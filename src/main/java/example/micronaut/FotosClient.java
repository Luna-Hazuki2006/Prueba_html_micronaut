package example.micronaut;

import io.micronaut.core.annotation.Blocking;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;

@Client(id = "fotos") 
public interface FotosClient {

    @Get("/fotos/{id}")
    @Blocking
    Foto findById(@PathVariable Long id);
    @Get("/fotos")
    @Blocking
    Iterable<Fruta> buscar();
}