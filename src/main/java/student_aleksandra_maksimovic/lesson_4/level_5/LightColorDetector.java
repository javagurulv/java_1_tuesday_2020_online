package student_aleksandra_maksimovic.lesson_4.level_5;
/*
Разработать программу,
которая работает в соответствии с требованиями, описанными ниже.

Функциональные требования:
Программа должна определять цвет в зависимости
от длины волны в соответствии со следующими правилами:

380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
Вне диапазонов - невидимый спектр ("Invisible Light")

Логика с определением цвета должна быть реализована
в отдельном классе LightColorDetector:

class LightColorDetector {
​
  public String detect(int wavelength) {
    //TODO
  }

}

Написать тестовые сценарии для класса LightColorDetector
в классе LightColorDetectorTest. Тестовые сценарии должны
покрывать все возможные варианты.
 */
public class LightColorDetector {
    public String detect(int wavelength) {
        if ((wavelength >= 380) && (wavelength <= 449)) {
            return "Violet";
        } else if ((wavelength >= 450) && (wavelength <= 494) ) {
            return "Blue";
        } else if ((wavelength >= 495) && (wavelength <= 569)) {
            return "Green";
        } else if ((wavelength >= 570) && (wavelength <= 589)) {
            return "Yellow";
        } else if ((wavelength >= 590) && (wavelength <= 619)) {
            return "Orange";
        } else if ((wavelength >= 620) && (wavelength <= 750)) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}
