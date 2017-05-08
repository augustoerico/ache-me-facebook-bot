package com.potatobots.facebook.health

import com.potatobots.facebook.health.handlers.GetHealthHandler
import io.vertx.core.http.HttpMethod
import io.vertx.ext.web.Router

class HealthRouter {

    Router router

    HealthRouter(Router router) {
        this.router = router
    }

    def route() {
        router.route(HttpMethod.GET, '/health').handler GetHealthHandler.handler
    }

    static create(Router router) {
        new HealthRouter(router)
    }

}