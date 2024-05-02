package com.example.core.entity;


import com.example.core.dto.request.AccountRequestDto;
import com.example.core.enums.AccountEnum;
import com.example.core.enums.CommonEnum;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Document("accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account {
    @Id
    private String id;

    @Indexed(unique = true)
    private String username;

    private String password;

    @Indexed(unique = true)
    @NotEmpty(message = "account.validation.email.required")
    private String email;

    private String name;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfBirth;

    private AccountEnum.Role role;

    // Delete flag
    private CommonEnum.DeleteFlg deleteFlg;
}
