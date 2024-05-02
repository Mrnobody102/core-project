package com.example.core.dto.request;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountRequestDto {

    @NotNull
    private String id;

    private String password;

    @Email
    @NotEmpty(message = "account.validation.email.required")
    private String email;

    private String name;
    private LocalDate dateOfBirth;
}
