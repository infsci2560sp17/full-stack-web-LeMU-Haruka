package edu.infsci2560;

import edu.infsci2560.models.Kancolle;
import edu.infsci2560.models.enemy;
import edu.infsci2560.models.enemyFleet;
import edu.infsci2560.models.Kancolle.CommentType;
import edu.infsci2560.models.enemy.ShipType;
import edu.infsci2560.models.mapdata;
import edu.infsci2560.repositories.KancolleRepository;
import edu.infsci2560.repositories.enemyRepository;
import edu.infsci2560.repositories.mapdataRepository;
import edu.infsci2560.repositories.enemyFleetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);

        KancolleRepository repositoryk = ctx.getBean(KancolleRepository.class);
        repositoryk.save(new Kancolle(1L,"LeMU_Haruka","Greeting ! Here is LeMU-Haruka. ", CommentType.Bump));
    
    
        enemyRepository repositorye = ctx.getBean(enemyRepository.class);
        repositorye.save(new enemy(1L, "驱逐イ级",20,6,5,15,6,14,ShipType.Destroyer));
        repositorye.save(new enemy(1L,"驱逐ロ级",22,7,6,16,7,15,ShipType.Destroyer));
        //repository.save(new Kancolle(2L, "Insanity", CommentType.Help));
        //repository.save(new Kancolle(3L, "Body Beast", WorkoutType.Strength));
        mapdataRepository repositorym = ctx.getBean(mapdataRepository.class);
        repositorym.save(new mapdata(1L,"1-1" ,"镇守府海域", "镇守府正面海域", 0,0,3));
        repositorym.save(new mapdata(1L,"1-2","镇守府海域", "西南诸岛海域", 0,0,5));
        enemyFleetRepository repositoryef= ctx.getBean(enemyFleetRepository.class);
        repositoryef.save(new enemyFleet(1L,"1-1", "A","驱逐イ级","-","-","-","-","-"));
        
    }


//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }
//    @Bean
//    public CommandLineRunner databaseDemo(CustomerRepository repository) {
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new Customer("Jack", "Bauer"));
//            repository.save(new Customer("Chloe", "O'Brian"));
//            repository.save(new Customer("Kim", "Bauer"));
//            repository.save(new Customer("David", "Palmer"));
//            repository.save(new Customer("Michelle", "Dessler"));
//            repository.save(new Customer("Billy", "Bean"));
//
//            // fetch all customers
//            log.info("[Database Demo] Customers found with findAll():");
//            log.info("[Database Demo] -------------------------------");
//            for (Customer customer : repository.findAll()) {
//                log.info("[Database Demo] " + customer.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            Customer customer = repository.findOne(1L);
//            log.info("[Database Demo] Customer found with findOne(1L):");
//            log.info("[Database Demo] --------------------------------");
//            log.info("[Database Demo] " + customer.toString());
//
//            // fetch customers by last name
//            log.info("[Database Demo] Customer found with findByLastName('Bauer'):");
//            log.info("[Database Demo] --------------------------------------------");
//            for (Customer bauer : repository.findByLastName("Bauer")) {
//                log.info("[Database Demo] " + bauer.toString());
//            }
//        };
//    }
}
