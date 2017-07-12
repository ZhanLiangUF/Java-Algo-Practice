function isIncreasingSequence(sequence) {

    if (sequence.length == 2) return true

    var error = 0

    for(var i = 0; i < sequence.length-1; i++) {
        // if current is greater than next
        if (sequence[i] >= sequence[i+1]) {
            // if can step back or forward can bridge
            var back = sequence[i-1] >= sequence[i+1]
            var forward = sequence[i+2] && sequence[i] >= sequence[i+2]

            if (i > 0 && back && forward) {
                error += 2
            } else {
                error ++
            }
        }

        if (error > 1) return false
    }
    return true
}
