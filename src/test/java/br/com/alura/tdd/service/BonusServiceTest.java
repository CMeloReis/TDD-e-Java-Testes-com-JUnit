package br.com.alura.tdd.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroFuncionariosSalariosMuitoAltos() {
		BonusService service = new BonusService();
		
		assertThrows(IllegalArgumentException.class,
				() -> service.calcularBonus(new Funcionario("Carla", LocalDate.now(), new BigDecimal("25000"))));
		
//		try {
//			service.calcularBonus(new Funcionario("Carla", LocalDate.now(), new BigDecimal("25000")));
//			fail("Nao deu a exception!");
//		} catch (Exception e) {
//			assertEquals("Funcionario com salario maior que R$10000 nao pode receber bonus!", e.getMessage());
//		}
		
	}
	
	@Test
	void bonusDeveriaSe10PorcentoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Carla", LocalDate.now(), new BigDecimal("2500")));
		
		assertEquals(new BigDecimal("250.00"), bonus);
		
	}
	
	@Test
	void bonusDeveriaSer10PorcentoSalarioExatos1000Reais() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Carla", LocalDate.now(), new BigDecimal("10000")));
		
		assertEquals(new BigDecimal("1000.00"), bonus);
		
	}

}
