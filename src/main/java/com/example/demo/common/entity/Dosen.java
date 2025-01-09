package com.example.demo.common.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "dosen", schema = "public")
public class Dosen {
    @Id
    @Column(name = "id_user")
    private UUID idUser;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_user")
    private User user;

    @OneToMany(mappedBy = "dosenSkripsiTa")
    private List<Bimbingan> listBimbingan;

    @OneToMany(mappedBy = "dosenPembimbingSkripsiTA")
    private List<Mahasiswa> listMahasiswa;

}
