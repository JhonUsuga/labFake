package com.udea.labfaker;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LabfakerApplicationTests {

	@Autowired
	DataController dataController;

	@Test
	void health(){
		assertEquals("HEALTH CHECK OK", dataController.healthCheck());
	}

	@Test
	void version(){
		assertEquals("VERSION IS 1.0.0", dataController.version());
	}

	@Test
	void nationLength(){
		Integer nationsLength = dataController.getRandomNations().size();
		assertEquals(10, nationsLength);
	}

	@Test
	void currenciesLength(){
		Integer currenciesLength = dataController.getRandomCurrencies().size();
		assertEquals(20, currenciesLength);
	}

	@Test
	void testRandomCurrenciesCodeFormat(){
		DataController controller = new DataController();
		JsonNode response = controller.getRandomCurrencies();
		for (int i=0; i<response.size(); i++){
			JsonNode currency = response.get(i);
			String code = currency.get("code").asText();
			assertTrue(code.matches("[A-Z]{3}"));
		}
	}

	@Test
	public void testRandomNationsPerformance(){
		DataController controller = new DataController();
		long starTime = System.currentTimeMillis();

		controller.getRandomNations();
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - starTime;
		System.out.println(executionTime);
		assertTrue(executionTime<2000);
	}

	@Test
	void aviationsLength(){
		Integer aviationsLength = dataController.getRandomAviation().size();
		assertEquals(20, aviationsLength);
	}

	@Test
	void personaClassCoverageWithRandomData() {
		Faker faker = new Faker();

		int id = faker.number().numberBetween(1, 9999);
		String nombre = faker.name().firstName();
		String apellido = faker.name().lastName();
		String correo = faker.internet().emailAddress();
		int edad = faker.number().numberBetween(18, 90);

		// Prueba del constructor completo
		Persona p = new Persona(id, nombre, apellido, correo, edad);
		assertEquals(id, p.getId());
		assertEquals(nombre, p.getNombre());
		assertEquals(apellido, p.getApellido());
		assertEquals(correo, p.getCorreo());
		assertEquals(edad, p.getEdad());

		// Prueba del constructor vacío y setters
		Persona p2 = new Persona();
		p2.setId(id);
		p2.setNombre(nombre);
		p2.setApellido(apellido);
		p2.setCorreo(correo);
		p2.setEdad(edad);

		assertEquals(id, p2.getId());
		assertEquals(nombre, p2.getNombre());
		assertEquals(apellido, p2.getApellido());
		assertEquals(correo, p2.getCorreo());
		assertEquals(edad, p2.getEdad());
	}

}
