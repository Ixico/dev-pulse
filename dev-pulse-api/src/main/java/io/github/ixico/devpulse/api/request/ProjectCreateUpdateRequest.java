package io.github.ixico.devpulse.api.request;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ProjectCreateUpdateRequest {

    @NotNull String name;
    @NotNull String prefix;

}
