package org.example

fun main(){

    val numberOfPermanentEmployees = 50
    val numberOfTemporaryEmployees = 30
    val salaryOfPermanentEmployee = 30000
    val salaryOfTemporaryEmployee = 20000

    var totalSalaryOfPermanentEmployees: Int = numberOfPermanentEmployees * salaryOfPermanentEmployee
    var totalSalary: Int = (numberOfPermanentEmployees * salaryOfPermanentEmployee) + (numberOfTemporaryEmployees + salaryOfTemporaryEmployee)
    var averageSalary: Int = totalSalary / (numberOfTemporaryEmployees + numberOfPermanentEmployees)

}