package org.example

fun main(){

    var numberOfPermanentEmployees = 50
    var numberOfTemporaryEmployees = 30
    var salaryOfPermanentEmployee = 30000
    var salaryOfTemporaryEmployee = 20000

    var totalSalaryOfPermanentEmployees: Int = numberOfPermanentEmployees * salaryOfPermanentEmployee
    var totalSalary: Int = (numberOfPermanentEmployees * salaryOfPermanentEmployee) + (numberOfTemporaryEmployees + salaryOfTemporaryEmployee)
    var averageSalary: Int = totalSalary / (numberOfTemporaryEmployees + numberOfPermanentEmployees)

}