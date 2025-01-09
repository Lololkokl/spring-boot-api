package com.example.demo.common.dto;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class BimbinganWhereInputDto {
    private String materi;
    private Date tanggalBimbingan;
    private UUID idMahasiswa;
    private UUID idDosenSkripsiTA;
}
