package sn.dev.houserentapp.entities;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Immeuble {
    private int id;
    private String nom;
    private String description;
    private String ville;
    private String adresse;
    private String statut;
    private List<String> photos;
}
