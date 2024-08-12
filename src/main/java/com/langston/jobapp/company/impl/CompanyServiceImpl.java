package com.langston.jobapp.company.impl;

import com.langston.jobapp.company.Company;
import com.langston.jobapp.company.CompanyRepository;
import com.langston.jobapp.company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}
