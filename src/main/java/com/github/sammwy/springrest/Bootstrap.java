package com.github.sammwy.springrest;

import com.github.sammwy.springrest.providers.MovieProvider;
import com.github.sammwy.springrest.structure.Movie;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Bootstrap {

    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(MovieProvider provider) {
        return args -> {
            provider.save(new Movie("The Godfather",
                    "An organized crime dynasty's aging patriarch transfers control of his clandestine empire to his reluctant son.",
                    "Crime,Drama", 1972, 9.2));

            provider.save(new Movie("The Shawshank Redemption",
                    "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
                    "Drama", 1994, 9.3));

            provider.save(new Movie("Schindler's List",
                    "In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.",
                    "Biography,Drama,History", 1993, 8.9));

            provider.save(new Movie("Raging Bull",
                    "The life of boxer Jake LaMotta, whose violence and temper that led him to the top in the ring destroyed his life outside of it.",
                    "Biography,Drama,Sport", 1980, 8.2));

            provider.save(new Movie("Casablanca",
                    "A cynical expatriate American cafe owner struggles to decide whether or not to help his former lover and her fugitive husband escape the Nazis in French Morocco.",
                    "Drama,Romance,War", 1942, 8.5));

            provider.save(new Movie("Citizen Kane",
                    "Following the death of publishing tycoon Charles Foster Kane, reporters scramble to uncover the meaning of his final utterance; 'Rosebud'.",
                    "Drama,Mistery", 1941, 8.3));

            provider.save(new Movie("Gone with the wind",
                    "A manipulative woman and a roguish man conduct a turbulent romance during the American Civil War and Reconstruction periods.",
                    "Drama,History,Romance", 1939, 8.1));

            provider.save(new Movie("Wizard of Oz",
                    "Dorothy Gale is swept away from a farm in Kansas to a magical land of Oz in a tornado and embarks on a quest with her new friends to see the Wizard who can help her return home to Kansas and help her friends as well.",
                    "Adventure,Family,Fantasy", 1939, 8));
        };
    }
}
