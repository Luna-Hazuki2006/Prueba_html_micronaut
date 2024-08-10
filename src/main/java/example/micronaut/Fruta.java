package example.micronaut;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import jakarta.validation.constraints.NotBlank;

@MappedEntity(value = "frutas") // <1>
public class Fruta {

    @Id // <2>
    @GeneratedValue
    private String id;

    @NonNull
    @NotBlank // <3>
    private final String nombre;

    @Nullable
    private String descripcion;

    @Nullable
    private String foto;

    public Fruta(@NonNull String nombre, @Nullable String descripcion, @Nullable String foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NonNull
    public String getNombre() {
        return nombre;
    }

    @Nullable
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(@Nullable String descripcion) {
        this.descripcion = descripcion;
    }

    @Nullable
    public String getFoto() {
        return foto;
    }

    public void setFoto(@Nullable String foto) {
        this.foto = foto;
    }
}