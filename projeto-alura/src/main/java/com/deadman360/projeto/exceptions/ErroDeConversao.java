package com.deadman360.projeto.exceptions;

public class ErroDeConversao extends RuntimeException{
    private String mensagem;

    
    public ErroDeConversao( String mensagem) {
        this.mensagem = mensagem;
    }


    @Override
    public String getMessage() {
        return this.mensagem;
    }
    
    
}