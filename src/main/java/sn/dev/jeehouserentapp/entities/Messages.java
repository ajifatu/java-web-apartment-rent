package sn.dev.houserentapp.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Messages {
    private int id;
    private String sender;
    private String receiver;
    private String content;
    private String object;
}
