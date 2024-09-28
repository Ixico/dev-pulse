package io.github.ixico.devpulse.api.http;

import io.github.ixico.devpulse.api.dto.ProjectDto;
import io.github.ixico.devpulse.api.request.ProjectCreateUpdateRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public interface ProjectApi {

    String BASE_PATH = "/project";

    @GetMapping
    List<ProjectDto> list();

    @PostMapping
    ProjectDto create(@NotNull @Valid @RequestBody ProjectCreateUpdateRequest request);

    @PutMapping("/{id}")
    ProjectDto update(@PathVariable UUID id, @NotNull @Valid @RequestBody ProjectCreateUpdateRequest request);

}
