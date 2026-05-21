package com.publictransport.transport.route.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.publictransport.transport.route.domain.Route;

public interface RouteRepository extends JpaRepository<Route, Long> {

}