package com.example.demo.bimbingan;

import com.example.demo.common.dto.BimbinganWhereInputDto;
import com.example.demo.common.entity.Bimbingan;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BimbinganController {
    private final BimbinganService bimbinganService;

    @GetMapping("/bimbingan")
    public ResponseEntity<List<Bimbingan>> getBimbingan(@ModelAttribute @Valid BimbinganWhereInputDto bimbinganWhereInputDto) {
        return new ResponseEntity<>(bimbinganService.findAll(bimbinganWhereInputDto), HttpStatus.OK);
    }
}
