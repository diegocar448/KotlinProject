package org.example.project.data

import org.example.project.domain.ExpenseRepository
import org.example.project.model.Expense
import org.example.project.model.ExpenseCategory
import kotlin.math.exp

class ExpenseRepoImpl: ExpenseRepository {
    override fun getAllExpenses(): List<Expense> {
        return ExpenseManager.fakeExpenseList
    }

    override fun addExpense(expense: Expense) {
        ExpenseManager.addMewExpense(expense)
    }

    override fun editExpense(expense: Expense) {
        ExpenseManager.editExpense(expense)
    }

    override fun getCategories(): List<ExpenseCategory> {
        return ExpenseManager.getCategories()
    }
}