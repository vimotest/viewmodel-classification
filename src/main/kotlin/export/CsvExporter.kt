package export

class CsvExporter {
    fun tableToCsv(table: Table): String {
        val sb = StringBuilder()
        sb.append(table.headers.joinToString(","))
        sb.append("\n")
        table.rows.forEach { row ->
            sb.append(row.joinToString(","))
            sb.append("\n")
        }
        return sb.toString()
    }
}