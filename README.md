[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23108692)
# AnnDroidInAlgotihmLand

Harrison Tinley, Rito Murillo, Parminder Singh
Last Commit Date: 3/30/2026

This project is a game where you have to click a white rabbit in time to get points. There is a leaderboard with player stats to see as well.

Project setup completed successfully.

## Part 2: Code Exploration

Step 1 questions:

1. What types of files are located in the src folder?:

	The src folder contains .java files with all the code and classes for the project.

2. What appears to be stored in the content folder?:

	The content folder seems to store all the assets for the game, like the sounds and sprites.

3. What is the purpose of the uml folder?:

	The uml folder gives an overview of what the scripts do in the project. It is more visual so people can understand
	the project at a first glance.

4. Why do software projects often separate code from content/assets?:

	Software projects separate the content/assets from the code because it makes things a lot more organized. Finding
	a certain script or asset is infinitely easier when it's set up in this way and it saves a lot of time.

Step 2 questions:

1. Which class contains the main() method?:

	The Main.java class contains the main() method.

2. What does the program do when it first starts running?

	When the program first starts running it sets up the window with the title screen for the user to see.

3. What objects or classes are created when the program begins?

	When the program begins it creates the AppRouter and JFrame objects.
	
Step 3 questions:

1. Which class appears responsible for drawing graphics?:

	The AppRouter class seems responsible for drawing graphics for the game.

2. Which class appears responsible for loading files or content?:

	The Assets class appears responsible for the loading of files or content in the game.

3. How does the game update what appears on the screen?:

	For changing screens it uses cards and the show() method to update. For the rabbits and other things it creates a
	object that seems to load an asset which updates what appears on screen.
	
Step 4 questions: 

1. What does the UML diagram help you understand about the program?:

	The UML diagram helps me understand what all the AppRouter class does. It's a big class that does a lot of things
	and it would've taken a long time to realize that without the diagram.

2. Which class appears to be the central class in the system?

	The AppRouter class seems to be central to the systems in the game.

3. Which classes depend on or interact with other classes?

	All classes depend on the AppRouter which controls them. The rabbit and menu panels interact/depend on the assets
	class. Finally the LeaderboardPanel interacts/depends on the ScoreEntry and other leaderboard classes.
	
Step 5 questions:

1. Where in the code are scores stored?:

	The scores are stored in a file called leaderboard.csv.

2. What data type is used to store scores?:

	The data type for the stored scores is a ScoreEntry object for each score. There are many variables in the class
	and score specifically would be an int for the game.

3. Where would it make sense to implement sorting of scores?:

	It would make the most sense to implement sorting of scores within the LeaderboardAlgorithms.java class. This
	class is where algorithms for the leaderboard should be and the sorting is a great algorithm to fit in here.
	
## Sorting, Part 3 questions:

Step 1 questions:

1. In which class did you add the sorting code?:

	I decided to add the sorting code in the LeaderboardAlgorithms.java class.

2. Why did you choose that location?

	I chose this location because it keeps sorting and searching algorithms in a class specifically
	designed for algorithms.

3. What data structure is being sorted?:

	The data structure being sorted is an ArrayList with ScoreEntry objects.
	
Step 4 questions:

1. Which sorting algorithm did you choose?

	I chose to use selection sort for sorting scores highest to lowest.

2. How does your algorithm work in your own words?

	My algorithm works by selecting a value in the ArrayList and then comparing all remaining values to find
	the largest score. Once the largest score is found, then it is swapped with the value at the current position.
	The algorithm then moves to the next position and repeats the process until the entire list is sorted.

3. How did you verify that your sort was correct?

	I verified the sorting by checking the game screen where the top 20 scores appeared in the correct order.
	I also printed the scores to the terminal and confirmed the entire list list was sorted from highest to
	lowest.The highest score I found was 300 and the lowest score was -60.
	
## Searching questions

1. How does binary search work in your own words?

	The binary search create low and high bounds for the beginning and end of the list. It finds the middle of these bounds
	and checks whether the target is greater than or less than the middle value. Then it searches either left or right
	and repeats this process until it finds the target value or determines it is not in the list.

2. Why must the data be sorted before binary search can be used?
	
	The data must be sorted because binary search relies on the numbers being in order. This allows the algorithm to
	determine whether to search the left or ride side of the list.

3. What variables did you use for low, high, and mid?

	I used int variables for low, high, and mid.

4. What happens when the score is not found?

	When the score is not found, the function binarySearchByScore() returns -1. The program then displays a message
	on the bottom left of the menu saying that the score was not found.