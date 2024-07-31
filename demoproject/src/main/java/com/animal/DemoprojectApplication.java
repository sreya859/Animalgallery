package com.animal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SpringBootApplication
public class DemoprojectApplication {
	 @Controller
	    public static class AnimalController {
	        
	        @GetMapping("/project")
	        public String showGallery() {
	            return "gallery";
	        }

	        @GetMapping("/animalDetail/{animal}")
	        public String showAnimalDetail(@PathVariable("animal") String animal, Model model) {
	            String animalName;
	            String animalDescription;
	            String animalImage;

	            switch (animal) {
	                case "rhino":
	                    animalName = "Rhino";
	                    animalDescription = "Rhinoceroses are large, herbivorous mammals.";
	                    animalImage = "rhino.jpg";
	                    break;
	                case "bear":
	                    animalName = "Bear";
	                    animalDescription = "Bears are large mammals found in North America, Europe, and Asia.";
	                    animalImage = "bear.jpg";
	                    break;
	                case "lion":
	                    animalName = "Lion";
	                    animalDescription = "Lions are large carnivorous felines.";
	                    animalImage = "lion.jpg";
	                    break;
	                case "tiger":
	                    animalName = "Tiger";
	                    animalDescription = "Tigers are the largest wild cats.";
	                    animalImage = "tiger.jpg";
	                    break;
	                case "elephant":
	                    animalName = "Elephant";
	                    animalDescription = "Elephants are large herbivores known for their trunks.";
	                    animalImage = "elephant.jpg";
	                    break;
	                case "giraffe":
	                    animalName = "Giraffe";
	                    animalDescription = "Giraffes are the tallest land animals.";
	                    animalImage = "giraffe.jpg";
	                    break;
	                case "zebra":
	                    animalName = "Zebra";
	                    animalDescription = "Zebras are African equines with distinctive black-and-white stripes.";
	                    animalImage = "zebra.jpg";
	                    break;
	                case "panda":
	                    animalName = "Panda";
	                    animalDescription = "Pandas are bear-like mammals native to China.";
	                    animalImage = "panda.jpg";
	                    break;
	                case "kangaroo":
	                    animalName = "Kangaroo";
	                    animalDescription = "Kangaroos are marsupials native to Australia.";
	                    animalImage = "kangaroo.jpg";
	                    break;
	                default:
	                    animalName = "Unknown Animal";
	                    animalDescription = "No description available.";
	                    animalImage = "default.jpg";
	                    break;
	            }

	            model.addAttribute("animalName", animalName);
	            model.addAttribute("animalDescription", animalDescription);
	            model.addAttribute("animalImage", animalImage);

	            return "animalDetail";
	        }
	    }

	public static void main(String[] args) {
		SpringApplication.run(DemoprojectApplication.class, args);
	}

}
