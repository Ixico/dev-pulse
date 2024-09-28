package io.github.ixico.devpulse.service.db.repository.common;

import io.github.ixico.devpulse.api.exception.ResourceNotFoundException;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

@NoRepositoryBean
public interface CommonRepository<T> extends JpaRepository<T, UUID> {

    /**
     * @noinspection NullableProblems
     */
    default T getById(@NotNull UUID id) {
        return findById(id).orElseThrow(ResourceNotFoundException::new);
    }

}
