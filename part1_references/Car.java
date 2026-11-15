package part1_references;

// Простой класс, используемый для демонстрации передачи объекта в качестве аргумента метода (часть 1.2)..
public class Car {
    // Свойства объекта (могут быть изменены внутри метода, который получает ссылку)
    String model;
    int mileage;

    // Конструктор создает начальное состояние
    public Car(String model, int mileage) {
        this.model = model;
        this.mileage = mileage;
    }
// Переопределяем метод toString() из класса Object
    @Override
    public String toString() {
        // Возвращаем текстовое описание объекта: Car{model='Audi', mileage=1000}
        // Вызывается автоматически при System.out.println(car)
        return "Car{model='" + model + "', mileage=" + mileage + "}";
    }
}