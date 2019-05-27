package com.rhiodamuthie.sbapirestful;

import com.rhiodamuthie.sbapirestful.model.Product;
import com.rhiodamuthie.sbapirestful.model.Quote;
import com.rhiodamuthie.sbapirestful.service.ProductService;
import com.rhiodamuthie.sbapirestful.service.ProductServiceImpl;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class SbApiRestfulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbApiRestfulApplication.class, args);
    }

    private static final Logger log = LoggerFactory.getLogger(SbApiRestfulApplication.class);

//    public static void main(String args[]) {
//        RestTemplate restTemplate = new RestTemplate();
//        Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//        log.info(quote.toString());
//    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Quote quote = restTemplate.getForObject(
                    "https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
            log.info(quote.toString());
        };
    }

    @Bean
    CommandLineRunner runner(ProductServiceImpl productService) {
        return args -> {
            Product p = new Product();
            p.setName("A");
//            productService.save(p);
            // more products
        };
    }


}
