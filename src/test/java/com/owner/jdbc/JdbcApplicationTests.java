package com.owner.jdbc;

import com.owner.jdbc.learn.Dtl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.*;

@SpringBootTest
class JdbcApplicationTests {
	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() {

		try {
			System.out.println(dataSource.getClass());
			System.out.println(dataSource.getConnection());

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	//	List list = new ArrayList<>();
		Dtl d = new Dtl();


	}


}
