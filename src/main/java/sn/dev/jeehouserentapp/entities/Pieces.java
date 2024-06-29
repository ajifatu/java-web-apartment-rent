package sn.dev.houserentapp.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pieces {
    private int id;
    private int chambres;
    private int chambresAvecSalleDeBain;
    private int cuisine;
    private int salon;
    private int toilettes;
    private int buanderie;
    private int salleAManger;
}
