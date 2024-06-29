package sn.dev.houserentapp.entities;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Contrat {
    private int id;
    private Date debut;
    private Date fin;
    private String statut;
    private String document;
    private String message;
}
