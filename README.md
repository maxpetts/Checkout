# Checkout
A threaded Java implementation of a supermarket checkout.

# File explanation
The following sections detail what each file achieves.

## Customer
A simple implementation of a customer, only has a 2 variables: the customer ID, and the number of carried items. Both are stored as integers - as you'll need a big trolley to overflow an int. 
The customer class has very basic functionality:
* Contructor `public Customer(int id, int itemNo)`
* Getting amount of items `public int getItemAmount()`
* Removing an item `public void removeItem()`
* Getting customer ID `public int getID()`

## Checkout 
Contains all of the logic for simulating a checkout. Uses a linked list to achieve this, as customers are first-in-first-out(FIFO/LILO). Each checkout had an individual ID stored as an int, this probably could be byte; when will you have >127 checkouts?
This class contains the appropriate methods for: 
* Constructing a checkout `public Checkout(int id)`
* Adding customers `public void addCustomer(Customer customer)`
* Removing customers `public void removeCustomer()`
* Getting next customer `public Customer getCustomer()`
* Getting queue size `public int getQueueSize()`
* Getting each customer in queue `public Queue<Customer> getQueueList()`
* Getting checkout ID `public int getID()`

## CheckoutRunnable
An implementation of a Runnable. This is a bit of a mess and deffo needs some work..

## Shop
Creates multiple instances of Checkouts, their Runnables and some customers. Again this is a mess.. this code was writted >3 years ago now 😔.
Contains two methods, I'll let you guess what they do:
* `addCustomerToBestQueue()`
* `getRand()`

## ShopCLI
Needs work.. But this should be the control point for the shop.

## ShopTester
You guessed it; used for testing my implementation of a shop.

## ShopViewer
Intended to be a physical view of the entire program - again doesn't work.



