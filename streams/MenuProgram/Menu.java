package Java8.streams.MenuProgram;

public class Menu {
    private String name;
    private boolean isVegetarian;
    private int calories;
    private Type type;

    enum Type{
        VEGAN,
        MEAT,
        FISH,
        OTHERS
    }

    public Menu(String name, boolean isVegetarian, int calories, Type type){
        this.name = name;
        this.isVegetarian=isVegetarian;
        this.calories=calories;
        this.type=type;
    }

    public String getName(){
        return this.name;
    }

    public boolean isVegetarian(){
        return this.isVegetarian;
    }

    public int getCalories(){
        return this.calories;
    }

    public Type getType(){
        return this.type;
    }
    
}