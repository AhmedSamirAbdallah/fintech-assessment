package com.fintech.utilty;

public class Constants {
    public static class ErrorMessage {
        public static final String FIRST_NAME_REQUIRED = "First name is required";
        public static final String LAST_NAME_REQUIRED = "Last name is required";
        public static final String EMAIL_INVALID = "Email should be valid";
        public static final String SSN_REQUIRED = "SSN is required";
        public static final String PHONE_NUMBER_INVALID = "Phone number must be valid according to international formats";
        public static final String BIRTH_DATE_FUTURE = "Birth date cannot be in the future";
        public static final String USER_NOT_FOUND = "User with ID %d not found";
        public static final String EMAIL_ALREADY_EXISTS = "An account with this email already exists";
        public static final String SSN_ALREADY_EXISTS = "An account with this SSN already exists";
        public static final String ACCOUNT_NUMBER_REQUIRED = "Account number is required";
        public static final String ACCOUNT_NUMBER_UNIQUE = "Account number must be unique";
        public static final String BALANCE_POSITIVE = "Balance must be a positive number";
        public static final String CURRENCY_REQUIRED = "Currency is required";
        public static final String USER_ID_REQUIRED = "User ID is required";
        public static final String ACCOUNT_NOT_FOUND = "Account not found with ID: %d";
        public static final String AMOUNT_MUST_BE_POSITIVE = "Amount must be greater than zero";
        public static final String ACCOUNT_ID_REQUIRED = "Account ID is required";
        public static final String INSUFFICIENT_FUNDS = "Insufficient funds for withdrawal from account ID: %d";
        public static final String CURRENCY_MISMATCH = "Currency mismatch: account currency is different from the transaction currency.";

    }

    public static class SuccessMessage {

        public static final String USER_CREATED_SUCCESSFULLY = "User created successfully";
        public static final String USER_RETRIEVED_SUCCESSFULLY = "User retrieved successfully";
        public static final String ACCOUNT_CREATED = "Account created successfully.";
        public static final String BALANCE_RETRIEVED = "Balance retrieved successfully.";
        public static final String TRANSACTION_SUCCESSFUL = "Transaction completed successfully.";


    }
}
