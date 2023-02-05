import java.util.Objects;

enum Unit {G, ML};

public class RecipeIngredient extends Recipe {
    private String ingredientName;
    private int portion;
    private Unit unit;

    public RecipeIngredient(String ingredientName, int portion, Unit unit) {
        this.ingredientName = ingredientName;
        this.portion = portion;
        this.unit = unit;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public int getPortion() {
        return portion;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return this.getIngredientName() + " " + this.getPortion() + "" + this.getUnit();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecipeIngredient that = (RecipeIngredient) o;

        if (portion != that.portion) return false;
        if (!Objects.equals(ingredientName, that.ingredientName))
            return false;
        return unit == that.unit;
    }

    @Override
    public int hashCode() {
        int result = ingredientName != null ? ingredientName.hashCode() : 0;
        result = 31 * result + portion;
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }
}
