package dao;

import org.springframework.stereotype.Service;

@Service
public class TestDaoImpl implements TestDao {
	@Override
	public void sayHello() {
		System.out.println("Hello, Study hard! 李扬！Day Day Up!");
		System.out.println("新的一天，加油，努力！");
	}
}
