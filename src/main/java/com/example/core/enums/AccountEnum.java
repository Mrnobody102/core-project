package com.example.core.enums;

public class AccountEnum {
    public enum Role {
        USER("USER"),
        ADMIN("ADMIN");
        private final String displayValue;
        Role(String displayValue) {
            this.displayValue = displayValue;
        }
        public String getDisplayValue() {
            return displayValue;
        }
    }
}
