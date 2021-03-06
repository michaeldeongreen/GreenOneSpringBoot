# GreenOneSpringBoot (Note: To open in IntelliJ, open the sample.project folder)
Basic HelloWorld Spring Boot application that exposes a simple GET end point and a entry point class for Spring Boot.


# Tools Used:
* Bash
* Chocolatey - https://chocolatey.org/install
* Gradle - https://gradle.org/install/#with-a-package-manager
* Java SDK 11 (Don't forget to set your PATH: https://www.oracle.com/technetwork/java/javase/install-windows-139179.html )
* Spring Boot


# Tutorials Used:
* https://www.jetbrains.com/help/idea/getting-started-with-gradle.html (Used this create base project)
* https://spring.io/guides/gs/spring-boot/#_what_you_ll_need (Used this for Spring Boot)
* https://spring.io/guides/gs/spring-boot-docker/ (Used this to dockerize Spring Boot)
* https://docs.microsoft.com/en-us/azure/container-registry/container-registry-get-started-docker-cli (Used this for ACR)
* https://docs.microsoft.com/en-us/azure/container-instances/container-instances-tutorial-deploy-app (Used this for ACI)


# IntelliJ base .gitignore file:
https://github.com/github/gitignore/blob/master/Global/JetBrains.gitignore


# Observations:
* Put build.grade along side src folder
* Had compile issues surrounding Packages: https://www.youtube.com/watch?v=EBWmlcMXxXc)
* Had to modify build.grade (https://stackoverflow.com/questions/24924932/gradle-could-not-find-or-load-main-class)
* 2 Terminals open to execute commands in Spring Boot Tutorial:
	* 1st to build and run the application
	* 2nd to exucute curl command to test 
* For Maven
	* Had issues with mvn -version, turned out to be a corrupt zip file
	* Used Java JDK binaries instead of installer so there are no spaces in location (ie Program Files)
	* Created M2_HOME, MAVEN_HOME and JAVA_HOME and pointed them to the root directions (not the bin)
	* In PATH, %M2_HOME%\bin etc etc
	
# Burning Questions:
* How to Debug a Spring Boot App (not straightforward) - https://stackoverflow.com/questions/36583947/how-to-debug-a-spring-boot-application-in-spring-tool-suite (First bulleted option in Right Answer)