class TaskTracker {
    private val assignedTasks = mutableMapOf<Task, Employee>()

    fun trackTask(task: Task, employee: Employee) {
        assignedTasks[task] = employee
        println("Задача '${task.title}' отслеживается для ${employee.name}")
    }

    fun getAssignedTasks(): Map<Task, Employee> {
        return assignedTasks.toMap()
    }
}