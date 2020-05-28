package com.example.custostaxista;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nome;
    private String email;
    private int alvara;

    public Usuario(String nome, String email, int alvara) {
        this.nome = nome;
        this.email = email;
        this.alvara = alvara;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAlvara() {
        return alvara;
    }

    public void setAlvara(int alvara) {
        this.alvara = alvara;
    }
}
