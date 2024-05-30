package br.com.bank.statement

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BankStatementApplication

fun main(args: Array<String>) {
	runApplication<BankStatementApplication>(*args)
}
