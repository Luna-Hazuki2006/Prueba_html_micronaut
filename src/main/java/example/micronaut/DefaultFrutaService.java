package example.micronaut;

import java.util.List;
import java.util.Optional;

import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;

@Singleton // <1>
class DefaultFrutaService implements FrutaService {

    private final FrutaRepository frutaRepository;

    public DefaultFrutaService(FrutaRepository frutaRepository) {
        this.frutaRepository = frutaRepository;
    }

    @Override
    public Iterable<Fruta> list() {
        return frutaRepository.findAll();
    }

    @Override
    public Fruta save(Fruta fruta) {
        if (fruta.getId() == null) {
            return frutaRepository.save(fruta);
        } else {
            return frutaRepository.update(fruta);
        }
    }

    @Override
    public Optional<Fruta> find(@NonNull String id) {
        return frutaRepository.findById(id);
    }

    @Override
    public Iterable<Fruta> findByNombreInList(List<String> nombre) {
        return frutaRepository.findByNombreInList(nombre);
    }
}