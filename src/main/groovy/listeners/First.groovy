package listeners

import groovy.util.logging.Slf4j
import io.micronaut.context.event.ApplicationEventListener
import io.micronaut.runtime.server.event.ServerStartupEvent

import javax.inject.Singleton

@Slf4j
@Singleton
class First implements ApplicationEventListener<ServerStartupEvent> {

    @Override
    void onApplicationEvent(ServerStartupEvent event) {
        log.debug 'From First implements ApplicationEventListener<ServerStartupEvent>'
    }
}