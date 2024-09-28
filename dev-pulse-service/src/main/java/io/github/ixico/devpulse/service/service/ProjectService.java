package io.github.ixico.devpulse.service.service;

import io.github.ixico.devpulse.api.dto.ProjectDto;
import io.github.ixico.devpulse.api.request.ProjectCreateUpdateRequest;
import io.github.ixico.devpulse.service.db.model.Project;
import io.github.ixico.devpulse.service.db.repository.ProjectRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class ProjectService {

    private final ProjectRepository repository;

    public List<ProjectDto> list() {
        return repository.findAll().stream().map(Project::toDto).toList();
    }

    public ProjectDto create(@NotNull @Valid ProjectCreateUpdateRequest request) {
        return repository.save(Project.of(request)).toDto();
    }

    public ProjectDto update(@NotNull UUID id, @NotNull @Valid ProjectCreateUpdateRequest request) {
        var project = repository.getById(id);
        project.updateWith(request);
        return repository.save(project).toDto();
    }

}
