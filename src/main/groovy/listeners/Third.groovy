package listeners

import groovy.util.logging.Slf4j
import io.micronaut.context.event.StartupEvent
import io.micronaut.runtime.event.annotation.EventListener

import javax.inject.Singleton

@Slf4j
@Singleton
class Third {

    @EventListener
    void onStartup(StartupEvent se) {
        log.debug 'From @EventListener'
    }
}