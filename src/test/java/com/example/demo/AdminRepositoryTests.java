package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.example.demo.entity.Admin;
import com.example.demo.repository.AdminRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class AdminRepositoryTests {
	
	@Autowired
	private AdminRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateAdmin() {
		Admin admin = new Admin();
		admin.setUsername("sanae_ia");
		admin.setPassword("Test123");
		
		Admin savedAdmin = repo.save(admin);
		
		Admin existsAdmin = entityManager.find(Admin.class, savedAdmin.getId_admin());
		
		
		assertThat(existsAdmin.getUsername()).isEqualTo(admin.getUsername());
	}

}
