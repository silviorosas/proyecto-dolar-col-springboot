package com.valorDolar.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)//para obviar propiedades no incluidas en el modelo
public class Dolar {
    public String valor;
    public Date vigenciadesde;
    public Date vigenciahasta;
}
