package org.example.dto;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class UsersPostDto {
        private String title;
        private String content;
        private String image;
        private Long category;
        private Long user;
}
