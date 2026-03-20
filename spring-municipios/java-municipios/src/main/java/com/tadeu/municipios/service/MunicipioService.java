package com.tadeu.municipios.service;

import com.tadeu.municipios.model.Municipio;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class MunicipioService {

    private final String URL = "https://servicodados.ibge.gov.br/api/v1/localidades/municipios";

    public List<Municipio> buscarMunicipios(String filtro) {
        RestTemplate restTemplate = new RestTemplate();

        List<Map<String, Object>> response =
                restTemplate.getForObject(URL, List.class);

        List<Municipio> municipios = new ArrayList<>();

        for (Map<String, Object> item : response) {

            String nome = (String) item.get("nome");

            String estado = "N/A";

            try {
                Map<String, Object> microrregiao =
                        (Map<String, Object>) item.get("microrregiao");

                Map<String, Object> mesorregiao =
                        (Map<String, Object>) microrregiao.get("mesorregiao");

                Map<String, Object> uf =
                        (Map<String, Object>) mesorregiao.get("UF");

                estado = (String) uf.get("sigla");

            } catch (Exception e) {
                // evita quebrar caso algo venha diferente
            }

            if (filtro == null || nome.toLowerCase().contains(filtro.toLowerCase())) {
                municipios.add(new Municipio(
                        Long.valueOf(item.get("id").toString()),
                        nome,
                        estado
                ));
            }
        }

        return municipios;
    }
}