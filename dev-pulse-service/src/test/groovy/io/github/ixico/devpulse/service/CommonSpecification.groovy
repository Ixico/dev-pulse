package io.github.ixico.devpulse.service

import lombok.RequiredArgsConstructor
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

@SpringBootTest
@ActiveProfiles("test")
@RequiredArgsConstructor
abstract class CommonSpecification extends Specification {

    private DbInitializer dbInitializer

    def setup() {
        dbInitializer.clear()
    }

}
