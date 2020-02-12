package com.example.codeclan.SpringFilesFoldersUsers.controllers;

import com.example.codeclan.SpringFilesFoldersUsers.models.File;
import com.example.codeclan.SpringFilesFoldersUsers.respository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FileController {

    @Autowired
    private FileRepository fileRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles(){
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK );
    }

    @GetMapping(value = "/files/{id}")
    public Optional<File> getFile(@PathVariable Long id){
        return fileRepository.findById(id);
    }


    @PostMapping(value = "/files")
    public ResponseEntity<File> createPirate(@RequestBody File file){
        fileRepository.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }


    @PatchMapping(value = "/files/{id}")
    public ResponseEntity<File> updatePirate(@RequestBody File file,
                                               @PathVariable Long id){
        fileRepository.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }


}
