package edu.miu.WAALab3.service.implmantations;

import edu.miu.WAALab3.domain.Logger;
import edu.miu.WAALab3.repository.LoggerRepo;
import edu.miu.WAALab3.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;

public class LoggerServiceImpl implements LoggerService {
    @Autowired
    private LoggerRepo loggerRepo;
    @Override
    public void saveLogger(Logger logger) {
        loggerRepo.save(logger);
    }
}
