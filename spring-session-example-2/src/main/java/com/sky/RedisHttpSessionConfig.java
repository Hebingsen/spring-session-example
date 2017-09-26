package com.sky;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 配置类开启Redis Http Session
 * 基本是0配置，只需要让主配置扫描到@EnableRedisHttpSession即可
 * @作者 乐此不彼
 * @时间 2017年9月25日
 * @公司 sky工作室
 */
@Configuration
@EnableRedisHttpSession
public class RedisHttpSessionConfig {

}
