package io.github.ixico.devpulse.service

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class ContextTest extends Specification {

    def "context loads"() {
        expect:
            true
    }

}
