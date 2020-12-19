# Go2ItBootCamp_Week5

Solutions to the tasks of Go2IT Boot Camp - Week 5

# Task5_1 Desription:

Create a class structure that will reflect different types of shoes.
▪ Remember that a child extends parent
▪ Try to distinguish some unique properties of each particular type of shoes
▪ Methods are not required

# Task5_2 Description: 

Create an hierarchy of Java classes to represent figure below:
▪ Triangle
▪ Circle
▪ Square
▪ Rectangle
▪ Trapezium
You need to extract common properties only (methods not required).

# Task5_3 Description: 

Create hierarchy/hierarchies of Java classes to represent different animal species:
▪ Dolphin
▪ Cat
▪ Snail
▪ Human
▪ Sparrow
Hierarchy can be complex – Animal -> Bird -> Sparrow (even though Bird will have only one children).
Create classes that will:
1. Have corresponding common properties (i.e. brain, parts of body, etc).
2. Have methods that will be inherited from the parent class based on hierarchy (i.e. Bird.fly() -> Sparrow.fly(), etc).
3. Create methods that will be overridden in the children classes (i.e. Mammal -> Dolphin.drinkMilk(), dolphin will drink milk underwater etc).
4. Create instances of each Animal.

# Task5_4__5_5 Description: 

Create hierarchy/hierarchies of Java classes to represent different persons:
▪ Customer
▪ Cashier
▪ Client advisor
▪ Branch manager
▪ Janitor
▪ CEO

Create classes that will:
1. Have corresponding common properties (ie salary, DoB, name, position etc).
2. Have methods that will be inherited from the parent class based on hierarchy (i.e. sleep, eat, etc).
3. Create methods that will be overridden in children classes (i.e. work, take a lunch, etc).
4. Create instances of each class and call parent’s and children’s methods (i.e. janitor will work differently from CEO).

Create a set of constructors in difference classes of bank users hierarchy that will be explicitly chained. I.e., creating an instance of Janitor will invoke a constructor of a parent class Staff and pass corresponding parameters there. Same will happen in Staff constructor that will invoke User constructor and pass basic params there.
Remember: each class has its own attributes that are unique to the level of the hierarchy. I.e., CEO will have budgetToOperate property. It must be set when new CEO() is called. The rest of params – name, DoB, position, etc must be passed to the parent constructors.
