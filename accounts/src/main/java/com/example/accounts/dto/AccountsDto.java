package com.example.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	@NotEmpty(message = "AccountNumber can not be a null or empty")
	@Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
	 @Schema(
	            description = "Account Number of ING Bank account", example = "3454433243"
	    )
	private Long accountNumber;

	@NotEmpty(message = "AccountType can not be a null or empty")
	  @Schema(
	            description = "Account type of ING Bank account", example = "Savings"
	    )
	private String accountType;

	@NotEmpty(message = "BranchAddress can not be a null or empty")
	@Schema(
            description = "ING Bank branch address", example = "200 Sydney"
    )
	private String branchAddress;

}
