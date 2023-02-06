package flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = developers.get(speciality);

        if (developer == null) {
            switch (speciality) {
                case "java" -> {
                    System.out.println("Hiring Java developer");
                    developer = new JavaDeveloper();
                }
                case "cpp" -> {
                    System.out.println("Hiring Cpp developer");
                    developer = new CppDeveloper();
                }
            }
            developers.put(speciality, developer);
        }
        return developer;
    }
}
