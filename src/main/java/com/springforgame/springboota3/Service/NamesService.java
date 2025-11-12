package com.springforgame.springboota3.Service;

import com.springforgame.springboota3.Model.Names;
import com.springforgame.springboota3.Repository.NamesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NamesService {
    private NamesRepository namesRepository;
    //constructor
    public NamesService(NamesRepository namesRepository) {
        this.namesRepository = namesRepository;
    }
    //getAllNames
    public List<Names> getAllNames() {
        return namesRepository.findAll();
    }
    //getByIdNames
    public Names getNamesById(int id){
        return namesRepository.findById(id).get();
    }
    //postNewNames
    public void addNewNames(Names names){
        namesRepository.save(names);
    }

    //putNames
    public void UpdateNames(int id,Names names){
        Names currentName = namesRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Name not fond"));
        if (names.getFirst_name() != null) {
            currentName.setFirst_name(names.getFirst_name());
        }

        if (names.getLast_name() != null) {
            currentName.setLast_name(names.getLast_name());
        }

        if (names.getFull_name() != null) {
            currentName.setFull_name(names.getFull_name());
        }
        namesRepository.save(currentName);
    }
    //deleteNames
    public void deleteNames(int id){
        namesRepository.deleteById(id);
    }

}
