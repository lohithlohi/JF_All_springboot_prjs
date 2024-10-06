package com.ust.reciepie_project.repository;

import com.ust.reciepie_project.pojo.Reciepie;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

public class ReciepieRepoImpl implements ReciepieRepo{

    ArrayList<Reciepie> ReciepieDatabase = new ArrayList<>();

    @Override
    public void createReciepie(Reciepie res) {
        ReciepieDatabase.add(res);
    }

    @Override
    public Optional<Reciepie> findReciepiebyId(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Reciepie> findReciepiebyName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<Reciepie> updateReciepie(int id, Reciepie res) {
        return Optional.empty();
    }

    @Override
    public void deleteReciepiebyId(int id) {

    }
}
