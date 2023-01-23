package edu.miu.WAALab3.repository;

import edu.miu.WAALab3.domain.Logger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggerRepo extends JpaRepository<Logger, Long> {
}
