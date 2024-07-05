Project Overview
This project implements a simple task list application in Java. It allows users to manage a list of tasks by adding, removing, and listing tasks via a command-line interface.

Features
Add Task:
Users can add new tasks to the task list.
Remove Task:
Users can remove tasks from the task list by specifying the task number.
List Tasks:
Users can view all tasks currently in the task list.
Quit Application:
Users can quit the application.
Classes and Methods
TaskListApp.java
TaskListApp: The main class containing the application logic and user interaction.
main(String[] args): The entry point of the application.
displayMenu(): Displays the main menu options.
getUserChoice(Scanner scanner): Gets the user's menu choice.
getTaskName(Scanner scanner): Prompts the user to enter the task name.
getUserInput(Scanner scanner, String prompt): Prompts the user for input with a custom message.
TaskList.java
TaskList: Manages the list of tasks.
addTask(String name): Adds a task to the list.
removeTask(int taskNumber): Removes a task from the list by its number.
listTasks(): Lists all tasks in the task list.
isEmpty(): Checks if the task list is empty.
isValidTaskNumber(int taskNumber): Checks if a task number is valid.
Dependencies
Java Development Kit (JDK) 8 or higher