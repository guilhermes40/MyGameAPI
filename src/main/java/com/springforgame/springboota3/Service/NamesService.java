package com.springforgame.springboota3.Service;

import com.springforgame.springboota3.Model.Names;
import com.springforgame.springboota3.Repository.NamesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NamesService {
    private NamesRepository namesRepository;

    public NamesService(NamesRepository namesRepository) {
        this.namesRepository = namesRepository;
    }

    public List<Names> getAllNames() {
        return namesRepository.findAll();
    }

    public Names getNamesById(int id){
        return namesRepository.findById(id).get();
    }

}
