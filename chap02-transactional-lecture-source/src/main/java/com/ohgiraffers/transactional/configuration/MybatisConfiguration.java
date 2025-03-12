package com.ohgiraffers.transactional.configuration;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.ohgiraffers.transactional",annotationClass = Mapper.class) /*범위내에 @Mapper를 등록하겠음*/
public class MybatisConfiguration {

}
