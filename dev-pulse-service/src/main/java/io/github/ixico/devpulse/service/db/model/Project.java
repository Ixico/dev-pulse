package io.github.ixico.devpulse.service.db.model;

import io.github.ixico.devpulse.api.dto.ProjectDto;
import io.github.ixico.devpulse.api.request.ProjectCreateUpdateRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    @GeneratedValue
    private UUID id;

    @NotNull
    private String name;

    @NotNull
    private String prefix;

    @NotNull
    private Instant created;

    public ProjectDto toDto() {
        return ProjectDto.builder()
                .id(id)
                .name(name)
                .prefix(prefix)
                .created(created)
                .build();
    }

    public static Project of(@NotNull ProjectCreateUpdateRequest request) {
        return Project.builder()
                .name(request.getName())
                .prefix(request.getPrefix())
                .created(Instant.now())
                .build();
    }

    public void updateWith(@NotNull ProjectCreateUpdateRequest request) {
        name = request.getName();
        prefix = request.getPrefix();
    }

}
