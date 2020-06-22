package Java8.streams.MenuProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    static List<Menu> menu = Arrays.asList(new Menu("Dal Ka Dulha", true, 500, Menu.Type.VEGAN),
            new Menu("Butter Chicken", false, 800, Menu.Type.MEAT), new Menu("Dal Makhni", true, 200, Menu.Type.VEGAN),
            new Menu("Fish Fry", false, 400, Menu.Type.FISH), new Menu("Idli Dosa", true, 100, Menu.Type.OTHERS));

    public static void main(String[] args) {
        threeHighCaloriesDishes(menu);
        onlyVegetarianDishesName(menu);
        totalCaloriesInMenu(menu);
    }

    public static void onlyVegetarianDishesName(List<Menu> dishes) {
        List<String> onlyVegetarianDishesName = dishes.stream().filter(Menu::isVegetarian).map(Menu::getName)
                .collect(Collectors.toList());
        System.out.println(onlyVegetarianDishesName);
    }

    public static void totalCaloriesInMenu(List<Menu> dishes) {
        int totalCalories = dishes.stream().map(Menu::getCalories).mapToInt(Integer::intValue).sum();
        System.out.println(totalCalories);
    }

    public static void threeHighCaloriesDishes(List<Menu> dishes) {
        List<String> threeHighCaloriesDishes = dishes.stream().filter(d -> d.getCalories() >= 200).map(m -> m.getName())
                .limit(3).collect(Collectors.toList());
        System.out.println(threeHighCaloriesDishes);

    }

}