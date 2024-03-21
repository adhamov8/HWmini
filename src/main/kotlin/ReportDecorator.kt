//Паттерн Декоратор
class ReportDecorator(private val reportGenerator: ReportGenerator) : ReportGenerator {
    override fun generateReport(tasks: Map<Task, Employee>): String {
        val report = reportGenerator.generateReport(tasks)
        return "$report\n\nОтчет ${java.time.LocalDate.now()}"
    }
}