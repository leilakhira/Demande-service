package com.example.gestion_demende.Repository;

import com.example.gestion_demende.Entite.Demande;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RepositoryRestResource
@Produces(MediaType.APPLICATION_JSON)
public interface DemandeRepository extends JpaRepository<Demande,Long> {
    Page<Demande> findByNameContaining(@RequestParam("keyword") String keyword, Pageable pageRequest);
}
