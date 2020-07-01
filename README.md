# eportal-ws


## Oracle JDBC Driver

Maintain `ojdbc` in your local `Maven` repository. The jar file is in the `lib` folder. 

> mvn install:install-file -Dfile={Path/to/your/ojdbc8-12.2.0.1.0.jar} -DgroupId=com.oracle -DartifactId=ojdbc8 -Dversion=12.2.0.1.0 -Dpackaging=jar

Example (**when you are in the project root**):

> mvn install:install-file -Dfile=lib/ojdbc8-12.2.0.1.0.jar -DgroupId=com.oracle -DartifactId=ojdbc8 -Dversion=12.2.0.1.0 -Dpackaging=jar


## Deployment (Installing Spring Boot Applications)

### Profiles

This project has the following profiles

| Profile | Description | Usage |
| --- | --- | --- |
| `postgres` | For PostgreSQL database connection | Not to be used with profile `oracle` |
| `oracle` | For Oracle database connection | Not to be used with profile `postgres` |
| `eureka` | Enable Eureka discovery |  |

### Basics

Refer to [Spring Boot (2.1.6) Reference Doc](https://docs.spring.io/spring-boot/docs/2.1.6.RELEASE/reference/htmlsingle/#deployment-install)

### First-Time Deployment

These are the steps for first-time deployment. It envolves the fundamental setup process. For regular deployment, refer to the next section.

- Goto the project root directory

  > cd Work/GIT/eportal-ws

- Install `ojdbc`

  > mvn install:install-file -Dfile=lib/ojdbc8-12.2.0.1.0.jar -DgroupId=com.oracle -DartifactId=ojdbc8 -Dversion=12.2.0.1.0 -Dpackaging=jar

- Pull the latest changes (*or a specific released tag*)

  > git pull

- Build the project

  > mvn clean && mvn package -Dmaven.test.skip=true

- Goto the `target` directory

  > cd target

- Rename jar file

		mv eportal-ws-*.jar eportal-ws.jar

- Create new spring boot application

  > sudo mkdir /var/eportal-ws

  > sudo cp eportal-ws.jar /var/eportal-ws/eportal-ws.jar

  > sudo ln -s /var/eportal-ws/eportal-ws.jar /etc/init.d/eportal-ws

  > sudo update-rc.d eportal-ws defaults

- Application config

  * Use the proper port as your need, here using `9801` as an example.

  * Use the proper datasource url, username and password as your need.
  
  * Error `java.sql.SQLException: ORA-00604: error occurred at recursive SQL level 1 ORA-01882: timezone region not found`. If you meet this error, it's because the Oracle DB version is too low (before 10g). To work around this error, add `-Doracle.jdbc.timezoneAsRegion=false` in the config file.

  Example:

		echo JAVA_OPTS=\"-Xmx256M -Dspring.profiles.active=oracle,eureka -Dserver.port=9801 -Dspring.datasource.url=jdbc:oracle:thin:epbsh/epbsh@//192.168.1.11:1521/orcl -Dspring.datasource.username=epbsh -Dspring.datasource.password=epbsh\" > eportal-ws.conf

		sudo mv eportal-ws.conf /var/eportal-ws/eportal-ws.conf

- Start service

  > systemctl daemon-reload

  > service eportal-ws start

### Regular Deployment

These are the steps for the regular deployment. If you are deploying the project for the first time, refer to the previous section.

- Goto the project root directory

  > cd Work/GIT/eportal-ws

- Pull the latest changes

  > git pull

- Clean and build the project

  > mvn clean && mvn package -Dmaven.test.skip=true

- Goto the `target` directory

  > cd target

- Rename jar file

		mv eportal-ws-*.jar eportal-ws.jar

- Stop service

  > service eportal-ws stop

- Overwrite existing application

  > sudo cp eportal-ws.jar /var/eportal-ws/eportal-ws.jar

- Start service

  > service eportal-ws start

- Reload service unit

  > systemctl daemon-reload
  


## AppController

```Java

@RequestMapping("/api")
public class AppController

	@GetMapping("/categories")
	public ResponseEntity<List<EccatList>> getFlatCategories(
			@RequestParam(defaultValue = "true") final boolean flat)
	
	@GetMapping("/stocks")
	public ResponseEntity<Page<Ecsku>> getStocks(
			@RequestBody final Map<String, String> requestBody,
			final Pageable pageable)

	@GetMapping("/stocks/{recKey}")
	public ResponseEntity<EcskuExtended> getStock(
			@RequestParam(defaultValue = "false") final boolean extended,
			@PathVariable final BigDecimal recKey)
	
	@GetMapping("/stocks/{recKey}/specs")
	public ResponseEntity<List<EcskuSpecPicture>> getStockSpecs(
			@PathVariable final BigDecimal recKey)

	@GetMapping("/stocks/{recKey}/overviews")
	public ResponseEntity<List<EcskuOverviewPicture>> getStockOverviews(
			@PathVariable final BigDecimal recKey)
								
```
