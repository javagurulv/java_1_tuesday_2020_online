package student_valerija_ionova.lesson_11.level_3.task_15_22_not_approve;

/*Task15
Для представления сложных критериев поиска книг в базе данных создайте
интерфейс SearchCriteria со следующим методом:
*/


interface SearchCriteria {

    boolean match(Book book);

}