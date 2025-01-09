package com.example.demo.bimbingan.dto;

import jakarta.validation.constraints.NotEmpty;

import java.util.Date;

public class CreateBimbinganDto {
    @NotEmpty
    private String materi;

    @NotEmpty
    private String idMahasiswa;

    @NotEmpty
    private String idDosenSkripsiTA;

    @NotEmpty
    private Date tanggalBimbingan;
}
