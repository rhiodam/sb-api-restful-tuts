package com.rhiodamuthie.sbapirestful;

import com.rhiodamuthie.sbapirestful.model.Quote;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class SbApiRestfulApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(SbApiRestfulApplication.class, args);
//    }

    private static final Logger log = LoggerFactory.getLogger(SbApiRestfulApplication.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }

}
