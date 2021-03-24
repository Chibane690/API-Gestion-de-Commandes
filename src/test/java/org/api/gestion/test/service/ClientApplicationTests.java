package org.api.gestion.test.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.api.gestion.service.contrat.ServiceClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * la meme chose pour les autres service de test
 */
@SpringBootTest
class ClientApplicationTests {
    
	@Autowired
	private ServiceClient serviceClient;
	
	@Test
	void contextLoads() {
	}
    
	@Test
	public void testGetClient() {
		
		String attendu ="Chibane";
		String resultat = this.getServiceClient().getClient(Long.valueOf(1)).get().getNomClient();
		assertEquals(attendu, resultat);
	}

	public ServiceClient getServiceClient() {
		return serviceClient;
	}

	public void setServiceClient(ServiceClient serviceClient) {
		this.serviceClient = serviceClient;
	}
	
	
}
