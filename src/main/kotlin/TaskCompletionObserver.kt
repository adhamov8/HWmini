class TaskCompletionObserver : TaskObserver {
    override fun update(task: Task) {
        println("Задача '${task.title}' завершена")
    }
}