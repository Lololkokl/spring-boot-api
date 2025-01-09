package com.example.demo.bimbingan;

import com.example.demo.common.dto.BimbinganWhereInputDto;
import com.example.demo.common.entity.Bimbingan;
import com.example.demo.common.repository.BimbinganRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BimbinganService {
    private final BimbinganRepository bimbinganRepository;

    public List<Bimbingan> findAll(BimbinganWhereInputDto bimbinganWhereInputDto) {
        System.out.println(bimbinganWhereInputDto);



        return bimbinganRepository.findAll();
    }
}
