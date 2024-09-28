package io.github.ixico.devpulse.api.dto;

import lombok.Builder;
import lombok.Value;

import java.time.Instant;
import java.util.UUID;

@Value
@Builder
public class ProjectDto {

    UUID id;
    String name;
    String prefix;
    Instant created;

}
