package edu.miu.WAALab3.service;

import edu.miu.WAALab3.domain.Logger;
import org.springframework.stereotype.Service;

@Service
public interface LoggerService {
    public void saveLogger(Logger logger);
}
