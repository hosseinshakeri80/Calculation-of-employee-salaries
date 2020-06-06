package extras;

public interface CalculationSalary {
    double calculateMoneyForHolidayWorks( double baseSalary );
    double calculateMoneyForOverTimeWork(double hours , double baseSalary);
    double calculateMoneyForNightWork(double hours , double baseSalary);
    double calculateMoneyForVacationHour(double hours , double baseSalary);
    double calculateMoneyForTax(double finalSalary ); //مالیات
    double calculateInsurance(double finalSalary); // بیمه
    double calculateYears(int years , double baseSalary);
    double calculatePrimarySalary( double overTimeWork , double nightWork , double vacationHour , double yearsSalary , int years , double baseSalary  );
    double calculateFinalSalary(double overTimeWork, double nightWork, double vacationHour, double yearsSalary , int years , double baseSalary  );
    double calculateBaseSalary(int score ,String level  ,String workTime );

}
