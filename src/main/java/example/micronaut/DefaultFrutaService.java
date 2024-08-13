package example.micronaut;

import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.Optional;

@Singleton // <1>
class DefaultFrutaService implements FrutaService {

    private final FrutaRepository frutaRepository;

    public DefaultFrutaService(FrutaRepository frutaRepository) {
        this.frutaRepository = frutaRepository;
    }

    public Iterable<Fruta> list() {
        return frutaRepository.findAll();
    }

    public Fruta save(Fruta fruta) {
        if (fruta.getId() == null) {
            return frutaRepository.save(fruta);
        } else {
            return frutaRepository.update(fruta);
        }
    }

    public Optional<Fruta> find(@NonNull String id) {
        return frutaRepository.findById(id);
    }

    // public Iterable<Fruta> findByNombreInList(List<String> nombre) {
    //     return frutaRepository.findByNombreInList(nombre);
    // }
}