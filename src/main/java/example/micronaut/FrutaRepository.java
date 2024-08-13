package example.micronaut;


import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@MongoRepository // <1>
public interface FrutaRepository extends CrudRepository<Fruta, String> {

    // @NonNull
    // Iterable<Fruta> findByNombreInList(@NonNull List<String> nombres); // <2>
}