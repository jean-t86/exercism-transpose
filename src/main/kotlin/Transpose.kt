object Transpose {

    fun transpose(input: List<String>): List<String> {
        val result = mutableListOf<String>()

        for (word in input) {
            word.forEachIndexed { index, char ->
                val current = result.elementAtOrNull(index)
                if (current != null) {
                    result[index] = current + char.toString()
                } else {
                    result.add(char.toString())
                }
            }
        }

        return result
    }
}
