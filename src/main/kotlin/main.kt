fun main() {
    val type = "MasterCard"
    val totalPreviousTransfers = 75000_00
    val transferAmount = 1000_00

    val commission = calculateCommission(
        cardType = type,
        previousTransfers = totalPreviousTransfers,
        currentTransfer = transferAmount
    )

    println("Комиссия составит: $commission руб.")
}
