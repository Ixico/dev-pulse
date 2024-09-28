package io.github.ixico.devpulse.service.controller;

import io.github.ixico.devpulse.api.dto.ProjectDto;
import io.github.ixico.devpulse.api.http.ProjectApi;
import io.github.ixico.devpulse.api.request.ProjectCreateUpdateRequest;
import io.github.ixico.devpulse.service.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(ProjectApi.BASE_PATH)
@CrossOrigin(origins = "*") // todo: find another way
public class ProjectController implements ProjectApi {

    private final ProjectService service;

    @Override
    public List<ProjectDto> list() {
        return service.list();
    }

    @Override
    public ProjectDto create(ProjectCreateUpdateRequest request) {
        return service.create(request);
    }

    @Override
    public ProjectDto update(UUID id, ProjectCreateUpdateRequest request) {
        return service.update(id, request);
    }

}
