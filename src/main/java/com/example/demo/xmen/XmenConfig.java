package com.example.demo.xmen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class XmenConfig {

    @Bean
    CommandLineRunner commandLineRunner(XmenRepository repository) {
        return args -> {
            Xmen cyclops = new Xmen(
                    "Scott Summers",
                    "Cyclops",
                    "Eye Energy Beams",
                    "https://cdn.glitch.com/6137de19-12c5-43e0-9704-2252d809dcfb%2FCyclops.png"
            );
            Xmen wolverine = new Xmen(
                    "Logan",
                    "Wolverine",
                    "Healing Factor",
                    "https://cdn.glitch.com/6137de19-12c5-43e0-9704-2252d809dcfb%2Fwolverine.png"
            );
            Xmen professorx = new Xmen(
                    "Charles Xavier",
                    "Professor X",
                    "Telepathy",
                    "https://cdn.glitch.com/6137de19-12c5-43e0-9704-2252d809dcfb%2FProfessor_X.png"
            );
            Xmen storm = new Xmen(
                    "Ororo Munroe",
                    "Storm",
                    "Weather Manipulation",
                    "https://cdn.glitch.com/6137de19-12c5-43e0-9704-2252d809dcfb%2FStorm.png"
            );
            Xmen jeangrey = new Xmen(
                    "Jean Grey",
                    "Jean Grey",
                    "Telekinesis",
                    "https://cdn.glitch.com/6137de19-12c5-43e0-9704-2252d809dcfb%2FJean_Grey.png"
            );
            Xmen beast = new Xmen(
                    "Dr. Hank McCoy",
                    "Beast",
                    "Extraordinary Agility",
                    "https://cdn.glitch.com/6137de19-12c5-43e0-9704-2252d809dcfb%2FBeast1.png"
            );
            Xmen rogue = new Xmen(
                    "Anna Marie",
                    "Rogue",
                    "Power Absorption",
                    "https://cdn.glitch.com/6137de19-12c5-43e0-9704-2252d809dcfb%2FRogue.png"
            );
            Xmen magneto = new Xmen(
                    "Erik Lehnsherr",
                    "Magneto",
                    "Generate and Manipulate Magnetic Fields",
                    "https://cdn.glitch.com/6137de19-12c5-43e0-9704-2252d809dcfb%2FMagneto.png"
            );
            Xmen mystique = new Xmen(
                    "Raven Darkholme",
                    "Mystique",
                    "Shapeshifting",
                    "https://cdn.glitch.com/6137de19-12c5-43e0-9704-2252d809dcfb%2FMystique.png"
            );

            repository.saveAll(
                    List.of(cyclops, wolverine, professorx, storm, jeangrey, beast, rogue, magneto, mystique)
            );

        };
    }
}
