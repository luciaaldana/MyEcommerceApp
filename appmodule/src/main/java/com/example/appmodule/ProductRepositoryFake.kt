package com.example.appmodule

class ProductRepositoryFake: ProductRepository {
    override fun productList(): List<Product> {
        return listOf(
            Product(id=1, name = "Hamburger", price = 3.99, description = "A classic fast food item featuring a juicy ground beef patty, often served with toppings like lettuce, tomato, onion, pickles, and various sauces such as ketchup, mustard, or mayonnaise, all nestled within a soft bun. A satisfying and convenient meal."),
            Product(id=2, name = "Pizza", price = 5.49, description = "A widely popular dish consisting of a flattened disk of bread dough topped with a variety of ingredients, most commonly tomato sauce and cheese, along with other toppings such as pepperoni, vegetables, and olives. Baked in an oven until the crust is golden and the cheese is melted and bubbly."),
            Product(id=3, name = "French fries", price = 0.89, description = "Long, thin-cut potatoes that are deep-fried until golden brown and crispy. Typically seasoned with salt and often served as a side dish with burgers, sandwiches, or fried chicken. A simple yet universally loved fast food staple, perfect for a quick snack.")
        )
    }
}