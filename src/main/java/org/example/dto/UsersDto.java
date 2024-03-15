package org.example.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsersDto {
        private Long id;

        private String gmail;

        private String firstname;

        private String lastname;

        private String avatar;

        private boolean gender;

        private String date;
        private String password;
}
