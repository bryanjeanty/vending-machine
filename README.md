# Vending Machine Project

1. Identify 3-4 or more as needed use cases
## Use Cases
1. Customer chooses an item
2. Customer enters payment
3. Customer receives item and remaining balance

## Details Regarding each use case
* **Use Case 1**:
	1. Initiating Actor = Customer
	2. Actor's Goal = To choose an item
	3. Supporting Actor(s) = Vending Machine
	4. Preconditions =
		a. Customer balance set to default
		b. Vending machine inventory set to default
	5. Postconditions =
		a. Customer balance unchanged
		b. Vending machine inventory unchanged
		c. message printed to screen
	6. Flow of events for main success scenario
		Customer chooses item => Choice logged to system => success message printed to screen
	7. Flow of events for extensions (alternate scenarios)
		Customer chooses item => item not found => error message printed to screen

* **Use Case 2**: 
        1. Initiating Actor = Customer
        2. Actor's Goal = Enter payment
        3. Supporting Actor(s) = Vending Machine
        4. Preconditions =
                a. Customer balance set to default
                b. Vending machine inventory set to default
        5. Postconditions =
                a. Customer balance reduced by price of item
                b. Vending machine inventory unchanged
                c. message printed to screen
        6. Flow of events for main success scenario
                Customer enters payment => System checks if payment was received => success message printed to screen
        7. Flow of events for extensions (alternate scenarios)
                Customer enters payment => system could not log payment => error message printed to screen

* **Use Case 3**: 
        1. Initiating Actor = Customer
        2. Actor's Goal = receive items
        3. Supporting Actor(s) = Vending Machine
        4. Preconditions =
                a. Customer balance set to default
                b. Vending machine inventory set to default
        5. Postconditions =
                a. Customer balance unchanged
                b. Vending machine inventory depreciated by number of items requested
                c. message printed to screen
        6. Flow of events for main success scenario
                Customer requests items => System finds that balance is sufficient => success message printed to screen
        7. Flow of events for extensions (alternate scenarios)
                Customer requests items => item not found => error message printed to screen
		Customer requests items => System finds balance insufficient => error message printed to screen

## Identify Domain Model
* **Classes**: Customer, VendingMachine and Main Class
* **Interfaces**: None
* **Inheritance**: No
* **Relationships between them**: None
* **Activity Diagram / Processflow**: [View Email]
* **Sequence Diagrams**: [View Email]
* **Junit Test Cases**: None

## 2 examples of usage of following concepts in your design(Explain in 1-2 sentences)	

* **Encapsulation**: 
	1. Encapsultion was used in the Customer class created for this project. It was used to contain all the fields (state) relevant to the customer class and methods that would act on those fields.
	2. Encapsulation was also used in the Vending Machine class. This was done in order to encapsulate the state and methods relevant to a vending machine from the rest of the program.
	<br>
* **Polymorphism**: Polymorphism was not involved in my design. There was one instance of a method of the same name.
	<br>
* **Inheritance**: There was no inheritance involved in my design. This is because, naturally, there is no is-a relationship between a customer and a vending machine. As a customer is not a type of vending machine and a vending machine is not a type of customer.
	<br>
* **Abstract Class**: There were no abstract classes involved in my design. This is because there was no need for the creation of some generic class that could be inherited from since there was no is-a relationship present.
	<br>
* **Interface**: There were no interfaces involved in my design. This is because all the necessary methods could be implemented directly within the interface without employing a middle data structure to contain similar abstract methods needed for both.
	<br>
* **Constructor**: 
	1. The constructor was used in the Customer class to initialize the networth of a customer object.
	2. The constructor was used in the Vending Machine class to set the prices for each item in the vending machine within a hashmap.
	<br>
* **Any Collections possible**: There were no collections involved in my design. It was not necessary as I was only working with 2 distinct classes and 1 main class.
	<br>
* **Any Generics possible**: There were no generic classes involved in my design.
	<br>
* **Main Design Patterns used**: The main design pattern I implemented was 
	<br>
* **Any Static Classes possible**: There were no static classes involved in my design.
	<br>
* **Any Multiple Threading possible**: There was no multi-threading involved in my design. The assignment did not require delving into this aspect of object-oriented design
