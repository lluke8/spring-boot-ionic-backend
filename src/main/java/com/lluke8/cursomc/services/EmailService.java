package com.lluke8.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.lluke8.cursomc.domain.Pedido;

public interface EmailService {
	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
}
