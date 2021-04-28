

#LoginPage
##Test case 1 "Valid username & password"
|step | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Open LoginPage | --- | LoginPage is open  |
| 2 | Enter valid username | --- | The username field displays the entered value  |
| 3 | Enter valid password | --- | The password field displays the entered value  |
| 4 | Click button **LOGIN** | --- | User go InventoryPage. Display label "Products"  |

##Test case 2 "Invalid login"
|step | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Open LoginPage | --- | LoginPage open  |
| 2 | Enter invalid username | see data table incorrect login | The username field displays the entered value  |
| 3 | Enter valid password | --- | The password field displays the entered value. Error msg is displaying. |

#Header container
##Test case 2 "Open Menu Sidebar"
|step | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage open. Display label "Products"  |
| 2 | Click button **burger-menu** | --- | Menu Sidebar open |

##Test case 3 "Empty shopping_cart_badge counter after clean cookies"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". Shopping_cart_badge isn't display |

##Test case 3 "Change on value+1 of shopping_cart_badge counter after click button **Add to cart**"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage open. Display label "Products"  |
| 2 | Check that shopping_cart_badge count | --- | Return count shopping_cart_badge |
| 3 | Check that shopping_cart_badge count=сщгте+1 | --- | Return count shopping_cart_badge |

#Inventory Page
##Inventory_item

##Test case 4 "Corresponding of inventory_item_name with expected"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products".|
| 2 | Get inventory_item_name | --- | actual inventory_item_name get|
| 3 | Compare actual and expected inventory_item_name  | --- | Actual result is as expected|

##Test case 5 "Corresponding of inventory_item_name and inventory_item_desc"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products".|
| 2 | Get inventory_item_decs | --- | actual inventory_item_decs get|
| 3 | Compare inventory_item_name and inventory_item_decs  | --- | Inventory_item_name and inventory_item_decs is as expected|

##Test case 6 "Corresponding of inventory_item_name and inventory_item_img"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products".|
| 2 | Get inventory_item_img | --- | actual inventory_item_img get|
| 3 | Compare inventory_item_name and inventory_item_img  | --- | Inventory_item_name and inventory_item_img is as expected|

##Test case 7 "Corresponding of inventory_item_name and inventory_item_price"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products".|
| 2 | Get inventory_item_price | --- | actual inventory_item_price get|
| 3 | Compare inventory_item_name and inventory_item_price  | --- | Inventory_item_name and inventory_item_price is as expected|

##Test case 8 "Change name of btn_inventory after click"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products".|
| 2 | Get btn_inventory name | --- | Name of btn_inventory got |
| 3 | Click btn_inventory | --- | btn_inventory change name|

## header_secondary_container
##Test case 9 "Sorting products on a page by name (A-Z)"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products".|
| 2 | Click product_sort_container | --- | Dropdown product_sort_list is open|
| 3 | Click **Name (A-Z)**  | --- | Products on the page are sorted by name (A-Z)|

##Test case 10 "Sorting products on a page by name (Z-A)"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products".|
| 2 | Click product_sort_container | --- | Dropdown product_sort_list is open|
| 3 | Click **Name (Z-A)**  | --- | Products on the page are sorted by name (Z-A)|

##Test case 11 "Sorting products on a page by Price (low to high)"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products".|
| 2 | Click product_sort_container | --- | Dropdown product_sort_list is open|
| 3 | Click **Price (low to high)**  | --- | Products on the page are sorted by Price (low to high)|

##Test case 12 "Sorting products on a page by Price (high to low)"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products".|
| 2 | Click product_sort_container | --- | Dropdown product_sort_list is open|
| 3 | Click **Price (high to low)**  | --- | Products on the page are sorted by Price (high to low)|

#CartPage
##Test case 13 "Open CartPage after click shopping_cart"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click shopping_cart | --- | CartPage is open |

##Test case 14 "Check name of subheader of CartPage"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click shopping_cart | --- | CartPage is open |
| 3 | Get subheader text | --- | Subheader text correspond \"Your Cart\"|

##Test case 15 "Check add product to cart"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Get count in shopping_cart_badge | --- | Shopping_cart_badge isn't display |
| 3 | Click button **ADD TO CART** | --- | Shopping_cart_badge contains "1" |
| 4 | Get name of product | --- | Name of product fixed|
| 5 | Get price of product | --- | Price is fixed |
| 6 | Click shopping_cart | --- | CartPage is open |
| 7 | Get name of product in cart | --- | Name of product in cart match name of product in step 4|
| 8 | Get price of product in cart | --- | Price of product in cart match price of product in step 4|

##Test case 16 "Remove product from the cart"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Get count in shopping_cart_badge | --- | Shopping_cart_badge isn't display |
| 3 | Click button **ADD TO CART** | --- | Shopping_cart_badge contains "1" |
| 4 | Get name of product | --- | Name of product fixed|
| 5 | Get price of product | --- | Price is fixed |
| 6 | Click shopping_cart | --- | CartPage is open |
| 7 | Click button **REMOVE** | --- | List of cart_item is empty|

##Test case 17 "Return to InventoryPage from the cart"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click shopping_cart | --- | CartPage is open |
| 3 | Click button **CONTINUE SHOPPING** | --- | InventoryPage is open|

#CheckoutStepOnePage
##Test case 18 "Go to CheckoutStepOnePage"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click shopping_cart | --- | CartPage is open |
| 3 | Click button **CHECKOUT** | --- | CheckoutStepOnePage is open. Subheader text correspond \"Checkout: Your Information\"|

##Test case 19 "Return to CartPage"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click shopping_cart | --- | CartPage is open |
| 3 | Click button **CHECKOUT** | --- | CheckoutStepOnePage is open. Subheader text correspond \"Checkout: Your Information\"|
| 4 | Click button **CANCEL** | --- | CartPage is open. |

##Test case 20 "Enter correct First Name on CheckoutStepOnePage"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click shopping_cart | --- | CartPage is open |
| 3 | Click button **CONTINUE SHOPPING** | --- | InventoryPage is open|
| 4 | Click button **CHECKOUT** | --- | CheckoutStepOnePage is open. Subheader text correspond \"Checkout: Your Information\"|
| 5 | Enter correct **First Name**| --- | Field First Name contains value. |

##Test case 21 "Enter correct Last Name on CheckoutStepOnePage"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click shopping_cart | --- | CartPage is open |
| 3 | Click button **CHECKOUT** | --- | CheckoutStepOnePage is open. Subheader text correspond \"Checkout: Your Information\"|
| 4 | Enter correct **Last Name**| --- | Field Last Name contains value. |

##Test case 22 "Enter correct Zip/Postal Code on CheckoutStepOnePage"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click shopping_cart | --- | CartPage is open |
| 3 | Click button **CHECKOUT** | --- | CheckoutStepOnePage is open. Subheader text correspond \"Checkout: Your Information\"|
| 4 | Enter correct **Zip/Postal Code**| --- | Field Zip/Postal Code contains value. |

##Test case 23 "Go to CheckoutStepTwoPage"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click shopping_cart | --- | CartPage is open |
| 3 | Click button **CHECKOUT** | --- | CheckoutStepOnePage is open. Subheader text correspond \"Checkout: Your Information\"|
| 4 | Enter correct **First Name**| --- | Field First Name contains value. |
| 5 | Enter correct **Last Name**| --- | Field Last Name contains value. |
| 6 | Enter correct **Zip/Postal Code**| --- | Field Zip/Postal Code contains value. |
| 7 | Click **CONTINUE**| --- | CheckoutStepTwoPage is open |

##Test case 24 "Validation First Name not entered"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click shopping_cart | --- | CartPage is open |
| 3 | Click button **CHECKOUT** | --- | CheckoutStepOnePage is open. Subheader text correspond \"Checkout: Your Information\"|
| 4 | Enter correct **Last Name**| --- | Field Last Name contains value. |
| 5 | Enter correct **Zip/Postal Code**| --- | Field Zip/Postal Code contains value. |
| 6 | Click **CONTINUE**| --- | Error message: "Error: First Name is required" |

##Test case 25 "Validation Last Name not entered"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click shopping_cart | --- | CartPage is open |
| 3 | Click button **CHECKOUT** | --- | CheckoutStepOnePage is open. Subheader text correspond \"Checkout: Your Information\"|
| 4 | Enter correct **First Name**| --- | Field First Name contains value. |
| 5 | Enter correct **Zip/Postal Code**| --- | Field Zip/Postal Code contains value. |
| 6 | Click **CONTINUE**| --- | Error message: "Error: Last Name is required"  |

##Test case 26 "Validation Zip/Postal Code not entered"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click shopping_cart | --- | CartPage is open |
| 3 | Click button **CHECKOUT** | --- | CheckoutStepOnePage is open. Subheader text correspond \"Checkout: Your Information\"|
| 4 | Enter correct **First Name**| --- | Field First Name contains value. |
| 5 | Enter correct **Last Name**| --- | Field Last Name contains value. |
| 6 | Click **CONTINUE**| --- | Error message: "Error: Postal Code is required"  |

#CheckoutStepTwoPage
##Test case 27 "Conformity of the Shipping information"
|step | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click shopping_cart | --- | CartPage is open |
| 3 | Click button **CHECKOUT** | --- | CheckoutStepOnePage is open. Subheader text correspond \"Checkout: Your Information\"|
| 4 | Enter correct **First Name**| --- | Field First Name contains value. |
| 5 | Enter correct **Last Name**| --- | Field Last Name contains value. |
| 6 | Enter correct **Zip/Postal Code**| --- | Field Zip/Postal Code contains value. |
| 7 | Click **CONTINUE**| --- | CheckoutStepTwoPage is open |
| 8 | Get text from Shipping Information| --- | Text is: "FREE PONY EXPRESS DELIVERY!" |

##Test case 28 "Compare text from Item total and sum prices of products"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click button **ADD TO CART** | --- | Shopping_cart_badge contains "1" |
| 3 | Click button **ADD TO CART** | --- | Shopping_cart_badge contains "2" |
| 4 | Click shopping_cart | --- | CartPage is open |
| 5 | Click button **CHECKOUT** | --- | CheckoutStepOnePage is open. Subheader text correspond \"Checkout: Your Information\"|
| 6 | Enter correct **First Name**| --- | Field First Name contains value. |
| 7 | Enter correct **Last Name**| --- | Field Last Name contains value. |
| 8 | Enter correct **Zip/Postal Code**| --- | Field Zip/Postal Code contains value. |
| 9 | Click **CONTINUE**| --- | CheckoutStepTwoPage is open |
| 10 | Get text from Item price product one| --- | Text fixed |
| 11 | Get text from Item price product two| --- | Text fixed |
| 12 | Get text from Item total| --- | Text fixed |
| 13 | Compare text from Item total and sum prices of products | --- | Text from Item total matches sum prices of products |

##Test case 29 "Check tax"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click button **ADD TO CART** | --- | Shopping_cart_badge contains "1" |
| 3 | Click shopping_cart | --- | CartPage is open |
| 4 | Click button **CHECKOUT** | --- | CheckoutStepOnePage is open. Subheader text correspond \"Checkout: Your Information\"|
| 5 | Enter correct **First Name**| --- | Field First Name contains value. |
| 6| Enter correct **Last Name**| --- | Field Last Name contains value. |
| 7 | Enter correct **Zip/Postal Code**| --- | Field Zip/Postal Code contains value. |
| 8 | Click **CONTINUE**| --- | CheckoutStepTwoPage is open |
| 9 | Get text from Item total| --- | Text fixed |
| 10 | Get text from Tax | --- | Text fixed |
| 11 | Compare text from Item total and tax | --- | Tax = round (0.08 from Item total) |

##Test case 30 "Check total"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click button **ADD TO CART** | --- | Shopping_cart_badge contains "1" |
| 3 | Click shopping_cart | --- | CartPage is open |
| 4 | Click button **CHECKOUT** | --- | CheckoutStepOnePage is open. Subheader text correspond \"Checkout: Your Information\"|
| 5 | Enter correct **First Name**| --- | Field First Name contains value. |
| 6 | Enter correct **Last Name**| --- | Field Last Name contains value. |
| 7| Enter correct **Zip/Postal Code**| --- | Field Zip/Postal Code contains value. |
| 8 | Click **CONTINUE**| --- | CheckoutStepTwoPage is open |
| 9 | Get text from Item total| --- | Text fixed |
| 10 | Get text from Tax | --- | Text fixed |
| 11 | Get text from Total | --- | Text fixed |
| 12 | Compare sum Item total + Tax and Total | --- | Total = Item total + Tax |

##Test case 31 "Return InventoryPage after click **CANCEL**"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click shopping_cart | --- | CartPage is open |
| 3 | Click button **CONTINUE SHOPPING** | --- | InventoryPage is open|
| 4 | Click button **CHECKOUT** | --- | CheckoutStepOnePage is open. Subheader text correspond \"Checkout: Your Information\"|
| 5 | Enter correct **First Name**| --- | Field First Name contains value. |
| 6 | Enter correct **Last Name**| --- | Field Last Name contains value. |
| 7 | Enter correct **Zip/Postal Code**| --- | Field Zip/Postal Code contains value. |
| 8 | Click **CONTINUE**| --- | CheckoutStepTwoPage is open |
| 9 | Click **CANCEL**| --- | InventoryPage is open |

#CheckoutCompletePage
##Test case 32 "Сheckout product"
|step # | desc | test data | expected result |
| --- | --- | --- | --- |
| 1 | Valid login | --- | InventoryPage is open. Display label "Products". |
| 2 | Click button **ADD TO CART** | --- | Shopping_cart_badge contains "1" |
| 3 | Click shopping_cart | --- | CartPage is open |
| 4 | Click button **CONTINUE SHOPPING** | --- | InventoryPage is open|
| 5 | Click button **CHECKOUT** | --- | CheckoutStepOnePage is open. Subheader text correspond \"Checkout: Your Information\"|
| 6 | Enter correct **First Name**| --- | Field First Name contains value. |
| 7 | Enter correct **Last Name**| --- | Field Last Name contains value. |
| 8 | Enter correct **Zip/Postal Code**| --- | Field Zip/Postal Code contains value. |
| 9 | Click **CONTINUE**| --- | CheckoutStepTwoPage is open |
| 10 | Click **FINISH**| --- | CheckoutCompletePage is open. Text "THANK YOU FOR YOUR ORDER"|



Проверка счетчика товаров товара в корзину

1.Login
2. Добавление товара - 

CartPage
Добавление товара в корзину
Сортировка товаров на странице
Удаление товара из корзмны
