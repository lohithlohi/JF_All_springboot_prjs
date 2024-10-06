package com.ust.reciepie_project.repository;

import com.ust.reciepie_project.pojo.Reciepie;

import java.util.Optional;

public interface ReciepieRepo {

    // create reciepie
    void createReciepie(Reciepie res);

    // Find reciepie by ID
    Optional<Reciepie> findReciepiebyId(int id);

    // Find reciepie by name
    Optional<Reciepie> findReciepiebyName(String name);

    // Edit the reciepie
    Optional<Reciepie> updateReciepie(int id, Reciepie res);

    // delete reciepie by Id
    void deleteReciepiebyId(int id);
}
