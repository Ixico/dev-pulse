package io.github.ixico.devpulse.service

import io.github.ixico.devpulse.service.db.repository.ProjectRepository
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Component

@Component
@RequiredArgsConstructor
class DbInitializer {

    private final ProjectRepository projectRepository;

    def clear() {
        projectRepository.deleteAll()
    }

}
