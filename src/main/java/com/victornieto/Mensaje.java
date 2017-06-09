package com.victornieto;

import lombok.*;

import java.io.Serializable;

/**
 * Created by victor.nieto.castan on 09/06/2017.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Mensaje implements Serializable {

    private String texto ;
    private int prioridad ;
    private boolean secreto ;

}
