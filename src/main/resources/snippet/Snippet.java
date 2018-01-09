package snippet;

public class Snippet {
	<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
	  http://maven.apache.org/maven-v4_0_0.xsd">
		<modelVersion>4.0.0</modelVersion>
	
		<groupId>com.suji</groupId>
		<artifactId>File-Upload-Using-Spring-Boot</artifactId>
		<packaging>jar</packaging>
		<version>1.0</version>
	
		<parent>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-parent</artifactId>
			<version>1.4.3.RELEASE</version>
		</parent>
	
		<properties>
			<java.version>1.8</java.version>
		</properties>
	
		<dependencies>
	
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-web</artifactId>
			</dependency>
	
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-devtools</artifactId>
				<optional>true</optional>
			</dependency>
	
			<dependency>
				<groupId>org.webjars</groupId>
				<artifactId>jquery</artifactId>
				<version>2.2.4</version>
			</dependency>
	
			<dependency>
				<groupId>mysql</groupId>
				<artifactId>mysql-connector-java</artifactId>
			</dependency>
	
			<!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
			<dependency>
				<groupId>org.springframework</groupId>
				<artifactId>spring-jdbc</artifactId>
			</dependency>
	
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-test</artifactId>
				<scope>test</scope>
			</dependency>
	
		</dependencies>
	
		<build>
			<plugins>
				<!-- Package as an executable jar/war -->
				<plugin>
					<groupId>org.springframework.boot</groupId>
					<artifactId>spring-boot-maven-plugin</artifactId>
				</plugin>
			</plugins>
		</build>
	
	</project>
	
}

