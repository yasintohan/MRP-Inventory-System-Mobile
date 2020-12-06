

#  MRP Inventory System Mobile <img src="http://img.shields.io/badge/-Java-F89820?style=flat&logo=java&logoColor=white">

<img src = "https://github.com/yasintohan/MRP-Inventory-System-Mobile/blob/master/images/banner.jpg">
<br/>

I developed a mobile app that takes bill of material and the gross requirements of the end item along with the stock, scheduled receipt, arrival on week, lead time and lot sizing rule information of the subcomponents to create MRP records for all parts and components of the snow shovel.

## Product Structure
Consider the product structure that belongs to a snow shovel. The demand and the inventory data provided below:

<br/><img src = "https://github.com/yasintohan/MRP-Inventory-System-Mobile/blob/master/images/graphic.JPG">
<br/><img src = "https://github.com/yasintohan/MRP-Inventory-System-Mobile/blob/master/images/table.JPG">


## System Operation

  
There are 3 buttons in the application. These are "Order Item", "Reset Order" and "Update Inventory" buttons.

<br/><img src = "https://github.com/yasintohan/MRP-Inventory-System-Mobile/blob/master/images/2.jpg">

### "Order Item" button
1. User enters the id of the item he wants to order in the "Item id" section.
2. The user writes down how many pieces he wants for the weeks he wants to order.
3. The user presses the "order item" button.
4. If the selected item exists in the system, the item entered as input is assigned as the current item. If there are no items in the system, the 1st stage will be returned.
5. Calculations for the entered item are returned.
6. Calculations are printed on the screen in tabular form.
7. Sub-item test is made for the current item, if there are subitems, calculations are made for the subitems and printed on the screen.

<br/><img src = "https://github.com/yasintohan/MRP-Inventory-System-Mobile/blob/master/images/3.jpg">

### "Reset Order" button
After ordering the item, it deletes the tables printed on the screen.

### "Update Inventory" button
When the button is pressed, you can see the current inventory status.
>Since the application is not connected to any database, the inventory is reset when the application is closed and opened.

<br/><img src = "https://github.com/yasintohan/MRP-Inventory-System-Mobile/blob/master/images/1.jpg">



by [Yasin Tohan](https://github.com/yasintohan)
