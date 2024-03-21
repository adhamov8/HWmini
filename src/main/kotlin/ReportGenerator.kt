// Паттерн Адаптер
interface ReportGenerator {
    fun generateReport(tasks: Map<Task, Employee>): String
}

class ExcelReportGenerator : ReportGenerator {
    override fun generateRepappendlnort(tasks: Map<Task, Employee>): String {
        val report = StringBuilder()
        report.appendln("Отчет:")
        tasks.forEach { (task, employee) ->
            report.("Задача: ${task.title}, Ответственный: ${employee.name}")
        }
        return report.toString()
    }
}