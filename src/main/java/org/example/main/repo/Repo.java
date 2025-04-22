package org.example.main.repo;

import org.springframework.stereotype.Repository;

@Repository
public class Repo {
    public Repo() {
        System.out.println("Repo Bean is Created..");
    }
}
