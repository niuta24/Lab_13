package com.example.task3;

public class CompanyEnricher {
    public CompanyData enrich(String domain) {
        return CompanyData.builder()
                .domain(domain)
                .description("description")
                .logo("logo")
                .address("address")
                .build();
    }
}
