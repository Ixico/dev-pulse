package io.github.ixico.devpulse.service.db.repository;

import io.github.ixico.devpulse.service.db.model.Project;
import io.github.ixico.devpulse.service.db.repository.common.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CommonRepository<Project> {

}
