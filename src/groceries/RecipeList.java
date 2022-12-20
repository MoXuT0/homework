package groceries;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class RecipeList {

    private final Set<Recipe> recipeList = new HashSet<>();

    public void addRecipe(Recipe recipe) {
        if (recipeList.contains(recipe)) {
            throw new RuntimeException("В списке уже есть рецепт " + recipe.getName());
        } else {
            recipeList.add(recipe);
        }
    }

    public void removeRecipe(Recipe recipe) {
        recipeList.remove(recipe);
    }

    public Set<Recipe> getRecipeList() {
        return recipeList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        RecipeList that = (RecipeList) o;
        return Objects.equals(recipeList, that.recipeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeList);
    }

    @Override
    public String toString() {
        return "RecipeList{" +
                "recipeList=" + recipeList +
                '}';
    }

}
