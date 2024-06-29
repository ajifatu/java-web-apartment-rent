package sn.dev.houserentapp.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Services {
    private int id;
    private boolean nettoyage;
    private boolean accesInternet;
    private boolean blanchisserie;
    private boolean gardiennage;
}
