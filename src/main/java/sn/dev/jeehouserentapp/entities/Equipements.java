package sn.dev.houserentapp.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Equipements {
    private int id;
    private boolean ascenceurs;
    private boolean camera;
    private boolean salleDeSport;
    private boolean parking;
    private boolean terrasse;
}
