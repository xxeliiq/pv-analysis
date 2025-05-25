package com.example.demo.controller;

import com.example.demo.service.ReportService;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/report")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    // Завантаження PDF-звіту
    @GetMapping("/{projectId}/pdf")
    public ResponseEntity<Resource> downloadPdfReport(
            @AuthenticationPrincipal UserDetails userDetails,
            @PathVariable Long projectId) {

        Resource pdf = reportService.generatePdfReport(userDetails.getUsername(), projectId);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"pv-report.pdf\"")
                .contentType(MediaType.APPLICATION_PDF)
                .body(pdf);
    }

    // Завантаження Excel-звіту
    @GetMapping("/{projectId}/excel")
    public ResponseEntity<Resource> downloadExcelReport(
            @AuthenticationPrincipal UserDetails userDetails,
            @PathVariable Long projectId) {

        Resource excel = reportService.generateExcelReport(userDetails.getUsername(), projectId);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"pv-report.xlsx\"")
                .contentType(MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
                .body(excel);
    }
}
