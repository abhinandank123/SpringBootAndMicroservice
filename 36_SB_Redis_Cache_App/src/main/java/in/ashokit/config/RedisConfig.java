package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {

	@Bean
	public JedisConnectionFactory jedisConnFectory() {

		JedisConnectionFactory jcf = new JedisConnectionFactory();
		return jcf;
	}
	@Bean
	public RedisTemplate<String, Integer> redisTemplate(){
		RedisTemplate<String, Integer> redisTemplate=new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnFectory());
		return redisTemplate;
	}

}
