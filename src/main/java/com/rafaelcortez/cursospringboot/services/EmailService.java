package com.rafaelcortez.cursospringboot.services;

import org.springframework.mail.SimpleMailMessage;

import com.rafaelcortez.cursospringboot.domain.Cliente;
import com.rafaelcortez.cursospringboot.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);

}
