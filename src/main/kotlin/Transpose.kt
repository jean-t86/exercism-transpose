object Transpose {

    fun transpose(input: List<String>): List<String> {
        // We need to find the length of the longest word in the input
        val longestWord = input.maxBy { arr ->
            arr.length
        }?.length

        val result = mutableListOf<String>()

        for ((wordIndex, word) in input.withIndex()) {
            word.forEachIndexed { charIndex, char ->
                val currentChar = result.elementAtOrNull(charIndex)
                if (currentChar != null) {
                    result[charIndex] = currentChar + char.toString()
                } else {
                    // The first word has been transposed, and we are now dealing with following word
                    // The assumption here is that
                    result.add(" ".repeat(wordIndex) + char.toString())
                }
            }
        }

        return result
    }
}
