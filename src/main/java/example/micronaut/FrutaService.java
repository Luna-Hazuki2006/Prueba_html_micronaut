package example.micronaut;

import io.micronaut.core.annotation.NonNull;

import java.util.List;
import java.util.Optional;

interface FrutaService {

    Iterable<Fruta> list();

    Fruta save(Fruta fruta);

    Optional<Fruta> find(@NonNull String id);

    Iterable<Fruta> findByNombreInList(List<String> nombre);
}