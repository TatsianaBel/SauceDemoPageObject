package dataExpected;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductData {

    public List<String> getExpectedListNameOfProducts() {
        return Arrays.asList(getExpectedArrayNameOfProducts());

    }
    public String[] getExpectedArrayNameOfProducts() {
        return new String[]{
                "Sauce Labs Backpack",
                "Sauce Labs Bike Light",
                "Sauce Labs Bolt T-Shirt",
                "Sauce Labs Fleece Jacket",
                "Sauce Labs Onesie",
                "Test.allTheThings() T-Shirt (Red)"
        };
    }

    public List<String> getSortFromAtoZExpectedListNameOfProducts() {
        List sortList = getExpectedListNameOfProducts();
        Collections.sort(sortList);
        return sortList;
    }
    public List<String> getSortFromZtoAExpectedListNameOfProducts() {
        List sortList = getExpectedListNameOfProducts();
        Collections.reverse(sortList);
        return sortList;
    }
    public List<String> getExpectedListDescrOfProducts() {
        List<String> strListProductName = new ArrayList<>();
        strListProductName.add("carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
        strListProductName.add("A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.");
        strListProductName.add("Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.");
        strListProductName.add("It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.");
        strListProductName.add("Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.");
        strListProductName.add("This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.");
        return strListProductName;
    }

    public List<String> getExpectedListPriceOfProducts() {
        List<String> strListProductName = new ArrayList<>();
        strListProductName.add("$29.99");
        strListProductName.add("$9.99");
        strListProductName.add("$15.99");
        strListProductName.add("$49.99");
        strListProductName.add("$7.99");
        strListProductName.add("$15.99");
        return strListProductName;
    }

}
