package com.edmartins.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.edmartins.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
