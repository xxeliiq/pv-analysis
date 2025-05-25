package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.service.ProjectService;
import jakarta.validation.Valid;
import org.springframework.http.*;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    // Створення нового PV-проєкту
    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(
            @AuthenticationPrincipal UserDetails userDetails,
            @Valid @RequestBody ProjectRequest request) {
        ProjectResponse created = projectService.createProject(userDetails.getUsername(), request);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    // Перелік усіх проєктів користувача
    @GetMapping
    public ResponseEntity<List<ProjectResponse>> getAllProjects(
            @AuthenticationPrincipal UserDetails userDetails) {
        List<ProjectResponse> list = projectService.getAllProjects(userDetails.getUsername());
        return ResponseEntity.ok(list);
    }

    // Деталі одного проєкту
    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse> getProjectById(
            @AuthenticationPrincipal UserDetails userDetails,
            @PathVariable Long id) {
        ProjectResponse response = projectService.getProjectById(userDetails.getUsername(), id);
        return ResponseEntity.ok(response);
    }

    // Оновлення проєкту
    @PutMapping("/{id}")
    public ResponseEntity<ProjectResponse> updateProject(
            @AuthenticationPrincipal UserDetails userDetails,
            @PathVariable Long id,
            @Valid @RequestBody ProjectRequest request) {
        ProjectResponse updated = projectService.updateProject(userDetails.getUsername(), id, request);
        return ResponseEntity.ok(updated);
    }

    // Видалення проєкту
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(
            @AuthenticationPrincipal UserDetails userDetails,
            @PathVariable Long id) {
        projectService.deleteProject(userDetails.getUsername(), id);
        return ResponseEntity.noContent().build();
    }
}
