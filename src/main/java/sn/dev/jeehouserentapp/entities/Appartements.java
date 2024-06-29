package sn.dev.houserentapp.entities;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Appartements {
    private int id;
    private String nom;
    private String description;
    private String statut;
    private double superficie;
    private double loyer;
    private int caution;
    private boolean meuble;
    private boolean chargesIncluses;
    private List<String> photos;
}
