package com.example.colorpsy.sample;

import com.example.colorpsy.model.DataItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleDataProvider {

    public static List<DataItem> dataItemList;
    public static Map<String,DataItem> dataItemMap;

    static
    {
        dataItemList = new ArrayList<>();
        dataItemMap = new HashMap<>();

        addItem(new DataItem(null, "Beautiful Car", "S",
                "Our quinoa salad is served with quinoa, tomatoes, cucumber, scallions, and smoked salmon. Served with your choice of dressing.",
                1, 12, "stephan_min.jpg"));

        addItem(new DataItem(null, "Let's play", "Salads",
                "The chef’s salad has cucumber, tomatoes, red onions, mushrooms, hard-boiled eggs, cheese, and hot grilled chicken on a bed of romaine lettuce. Served with croutons and your choice of dressing.",
                2, 9, "baby_chair."));

        addItem(new DataItem(null, "Rocky", "Salads",
                "Our house salad is made with romaine lettuce and spinach, topped with tomatoes, cucumbers, red onions and carrots. Served with a dressing of your choice.",
                3, 7, "bulldog.jpg"));

        addItem(new DataItem(null, "I love Flowers", "Salads",
                "Choose from our fresh local, organically grown ingredients to make a custom salad.",
                4, 10, "flower.jpg"));

        addItem(new DataItem(null, "We have a Mission", "Starters",
                "These mini cheeseburgers are served on a fresh baked pretzel bun with lettuce, tomato, avocado, and your choice of cheese.",
                1, 8, "minions.jpg"));

        addItem(new DataItem(null, "Let's go for a walk", "Starters",
                "Large mushroom caps are filled a savory cream cheese, bacon and panko breadcrumb stuffing, topped with cheddar cheese.",
                2, 7, "puppy.jpg"));

        addItem(new DataItem(null, "Human BestFriend", "Starters",
                "Caramelized onions slow cooked in a savory broth, topped with sourdough and a provolone cheese blend. Served with sourdough bread.",
                3, 7, "puppy_smile.jpg"));

        addItem(new DataItem(null, "I love Jokes", "Starters",
                "Our artichokes are brushed with an olive oil and rosemary blend and then broiled to perfection. Served with a side of creamy garlic aioli.",
                4, 9, "short_joke.jpg"));

        addItem(new DataItem(null, "Paisaje Verano", "Starters",
                "SOME SAY OUR EGGS ARE DEVILISHLY GOOD. I HAVE TO AGREE.\n" +
                        "These delectable little bites are made with organic eggs, fresh Parmesan, and chopped pine nuts.\"",
                5, 8, "javier_min.jpg"));

        addItem(new DataItem(null, "We love Babies", "Entrees",
                "Our classic burger is made with 100% pure angus beef, served with lettuce, tomatoes, onions, pickles, and cheese of your choice. Veggie burger available upon request. Served with French fries, fresh fruit, or a side salad.",
                1, 10, "baby1_min.jpg"));

        addItem(new DataItem(null, "Baby", "Entrees",
                "This classic cheese tortellini is cooked in a sundried tomato sauce. Served with bruschetta topped with a tomato and basil marinara.",
                2, 14, "baby3_min.jpg"));

        addItem(new DataItem(null, "Smiling Horse", "Entrees",
                "Our thin crust pizzas are made fresh daily and topped with your choices of fresh meats, veggies, cheese, and sauce.  Price includes two toppings. Add $1 for each additional topping.",
                3, 10, "horses_min.jpg"));

        addItem(new DataItem(null, "Mystery Butterfly", "Entrees",
                "Our barbecued skewers include tofu, cherry tomatoes, bell peppers, and zucchini marinated in a ginger sesame sauce and charbroiled. Served with steamed rice.",
                4, 10, "annie2_min.jpg"));

        addItem(new DataItem(null, "Blue Butterfly", "Entrees",
                "This platter is perfect for sharing! Enjoy our spicy buffalo wings, traditional nachos, and cheese quesadillas served with freshly made guacamole dip.",
                5, 16, "karina_min.jpg"));

        addItem(new DataItem(null, "The Wall", "Desserts",
                "Elegantly crafted creamy vanilla custard with a caramelized crunchy layer on top. Served with seasonal fruit.",
                1, 9, "wall_min.jpg"));

        addItem(new DataItem(null, "Art", "Desserts",
                "Our New York Style Cheesecake is rich, smooth, and creamy. Available in various flavors, and with seasonal fruit toppings.",
                2, 9, "hector.jpg"));

        addItem(new DataItem(null, "Blue Mountains ", "Desserts",
                "A warm chocolate chip brownie served with chocolate or vanilla ice cream and rich chocolate sauce.",
                3, 6, "john_min.jpg"));

        addItem(new DataItem(null, "HOOOF", "Desserts",
                "Made with local granny smith apples to bring you the freshest classic apple pie available.",
                4, 5, "richard_min.jpg"));

        addItem(new DataItem(null, "I love Colors", "Desserts",
                "Raspberries, blueberries, and strawberries on top of a creamy filling served in a crispy tart.",
                5, 7, "senjuti_min.jpg"));

        addItem(new DataItem(null, "Blue Ocean", "Drinks",
                "This blueberry mint-based smoothie is refreshing and perfect for any celebration.",
                1, 6, "stefan_min.jpg"));

        addItem(new DataItem(null, "You and I", "Drinks",
                "Our unique blend of pomegranate juice, black Rubio, and mint tea creates this light fusion of flavors.  ",
                2, 4, "toa_min.jpg"));

        addItem(new DataItem(null, "Blue Flowers", "Drinks",
                "Our house blend of espresso and foamed milk. Can be served with flavored syrups and over ice.  Non-dairy substitutions available upon request.",
                3, 6, "veronika_min.jpg"));

    }

    private static void addItem(DataItem item)
    {
        dataItemList.add(item);
        dataItemMap.put(item.getItemName(),item);


    }
}
