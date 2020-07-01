package com.epb.smartfittingroom.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("postgres")
public class ProcedureServicePostgres
		implements ProcedureService {

}
