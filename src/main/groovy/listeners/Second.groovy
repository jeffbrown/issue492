package listeners

import groovy.util.logging.Slf4j
import io.micronaut.context.event.ApplicationEventListener
import io.micronaut.context.event.StartupEvent
import io.micronaut.aop.Adapter
import javax.inject.Singleton

@Slf4j
@Singleton
class Second {

    @Adapter(ApplicationEventListener)
    void onStartup(StartupEvent event) {
        log.debug 'From @Adapter(ApplicationEventListener)'
    }
}