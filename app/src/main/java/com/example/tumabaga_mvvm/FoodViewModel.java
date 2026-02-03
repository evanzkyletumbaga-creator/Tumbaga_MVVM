package com.example.tumabaga_mvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class FoodViewModel extends ViewModel {

    private MutableLiveData<List<FoodModel>> foodList = new MutableLiveData<>();

    public LiveData<List<FoodModel>> getFoodList() {
        loadFoods();
        return foodList;
    }

    private void loadFoods() {
        ArrayList<FoodModel> foods = new ArrayList<>();

        foods.add(new FoodModel("Burger", "Juicy beef burger", R.drawable.food1));
        foods.add(new FoodModel("Pizza", "Cheesy pepperoni pizza", R.drawable.food2));
        foods.add(new FoodModel("Fried Chicken", "Crispy fried chicken", R.drawable.food3));
        foods.add(new FoodModel("Spaghetti", "Sweet style spaghetti", R.drawable.food4));
        foods.add(new FoodModel("Hotdog", "Grilled hotdog", R.drawable.food5));
        foods.add(new FoodModel("BBQ", "Pork barbecue", R.drawable.food6));
        foods.add(new FoodModel("Fries", "Crispy french fries", R.drawable.food7));
        foods.add(new FoodModel("Ice Cream", "Cold and creamy", R.drawable.food8));

        foodList.setValue(foods);
    }
}
