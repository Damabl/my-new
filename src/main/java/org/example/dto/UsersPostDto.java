package org.example.dto;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class UsersPostDto {
        private Long id;
        private String title;
        private String content;
        private String image;
        private String category;
        private Long user;
        private LocalDateTime createAt;

}
