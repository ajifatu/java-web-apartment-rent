package sn.dev.jeehouserentapp.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Utilisateurs {
    private int id;
    private String username;
    private String name;
    private String email;
    private String password;
    private String photo;
    private String phoneNumber;
    private String sexe;
    private String role;
    private String idCard;
    private String proofOfIncome;
    private String proprietyProof;
    private String statut;
}
