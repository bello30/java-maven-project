<<<<<<< HEAD
package com.example;

=======

package com.example;
>>>>>>> 4a076336e09569c25b250ebf5bae8951e7337f30
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {
<<<<<<< HEAD

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void init()
    {
        Logger log = LoggerFactory.getLogger(Application.class);
        log.info("Java app started");
    }

    public String getStatus() {
        return "OK";
    }
=======
	
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}
	
	@PostConstruct
	public void init()
	{
		Logger log = LoggerFactory.getLogger(Application.class);
		log.info("Java app started");
	}
	
	public String getStatus() {
		return "OK";
	}
>>>>>>> 4a076336e09569c25b250ebf5bae8951e7337f30
}
