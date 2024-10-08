/*
 * Copyright 2017-2024 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

@Controller("/frutas") // <1>
@ExecuteOn(TaskExecutors.BLOCKING)
public class FrutasController {

    // private final FrutasClient frutasClient;
    // private final FrutaService frutaService;

    // public FrutasController(FrutaService frutaService) {
    //     this.frutaService = frutaService;
    // }

    // public FrutasController(FrutasClient frutasClient) { // <2>
    //     this.frutasClient = frutasClient;
    // }

    @Produces(MediaType.TEXT_HTML) // <3>
    @ExecuteOn(TaskExecutors.BLOCKING) // <4>
    @View("frutas/reporte.html") // <5>
    @Get("/reporte") // <6>
    Map<String, String> reportar() { // <7>
        return Collections.singletonMap("fruta", "holaaaaaaaaaaaaaaaaaaaa");
    }

    @Produces(MediaType.TEXT_HTML)
    @ExecuteOn(TaskExecutors.BLOCKING)
    @View("frutas/crear.html")
    @Get
    Map<String, String> find() { // <7>
        return Collections.singletonMap("fruta", "holaaaaaaaaaaaaaaaaaaaa");
    }

    // @Produces(MediaType.TEXT_HTML) // <3>
    // @ExecuteOn(TaskExecutors.BLOCKING) // <4>
    // @View("frutas/mostrar.html") // <5>
    // @Get // <6>
    // Map<String, Iterable<Fruta>> list() {
    //     Map<String, Iterable<Fruta>> data = Collections.singletonMap("frutas", frutasClient.);
    //     System.out.println(data);
    //     return data;
    // }

}
