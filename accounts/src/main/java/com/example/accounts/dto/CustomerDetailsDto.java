package com.example.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(
        name = "CustomerDetails",
        description = "Schema to hold Customer,Accounts,Loans,Cards information"
)
public class CustomerDetailsDto {

    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
    @Schema(
            description = "Name of the customer", example = "Adam"
    )
    private String name;

    @NotEmpty(message = "Email address can not be a null or empty")
    @Email(message = "Email address should be a valid value")
    @Schema(
            description = "Email address of the customer", example = "adam1998@gmail.com"
    )
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    @Schema(
            description = "Mobile Number of the customer", example = "9345432123"
    )
    private String mobileNumber;

    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDto accountsDto;

    @Schema(
            description = "Loans details of the Customer"
    )
    private LoansDto loansDto;

    @Schema(
            description = "Cards details of the Customer"
    )
    private CardsDto cardsDto;




}
