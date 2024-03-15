package org.example.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LikeDto {
    private Long user;
    private Long Userpost;
}
