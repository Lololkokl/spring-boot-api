package com.example.demo.common.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "bimbingan", schema = "public")
public class Bimbingan {
    @Id
    private String id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_mahasiswa")
    private Mahasiswa mahasiswa;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dosen_skripsi_ta")
    private Dosen dosenSkripsiTa;

    private String materi;




}
