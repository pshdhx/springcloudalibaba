package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Authtor pshdhx
 * @Date 2021/7/4 16:59
 * @Version 1.0
 */
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        /**
         * 发现了一个问题：path：是后边uri的一个补充拼装；【访问的是国内，国际，军事】
         * 可以重复，比如第二个
         * 但是不能没有，比如第四个，拼装起来没有 .../junshi这样的url，所有找不到网页 HTTP ERROR 500
         */
        routes.route("path_route_atguigu",a->a.path("/guonei").uri("http://news.baidu.com")).build();
        routes.route("path_route_atguigu2",a->a.path("/guoji").uri("http://news.baidu.com/guoji")).build();
        routes.route("path_route_atguigu2",a->a.path("/mil").uri("http://news.baidu.com")).build();
        routes.route("path_route_atguigu2",a->a.path("/junshi").uri("http://news.baidu.com")).build();
        return routes.build();
    }
}
