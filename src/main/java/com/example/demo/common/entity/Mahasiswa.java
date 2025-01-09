package com.example.demo.common.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "mahasiswa", schema = "public")
public class Mahasiswa {
    @Id
    @Column(name = "id_user")
    private UUID idUser;
    private String nama;
    private String nim;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_dosen_skripsi_ta")
    private Dosen dosenPembimbingSkripsiTA;

    @OneToMany(mappedBy = "mahasiswa")
    private List<Bimbingan> listBimbingan;

}
