package com.gfidelizz.notificacao.infraestructure;

import com.gfidelizz.notificacao.business.EmailService;

public class EmailExceptions extends RuntimeException {

  public EmailExceptions (String mensagem){
    super(mensagem);
  }

  public EmailExceptions(String mensagem, Throwable throwable){
    super(mensagem, throwable);
  }
}
