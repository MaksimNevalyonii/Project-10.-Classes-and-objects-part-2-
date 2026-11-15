package clworkk11; 

// Интерфейс - "договор": любой, кто его подписал, обязан уметь play()
interface Playable {
    void play(); // только название метода, без кода внутри
}

// Гитара подписала договор Playable, значит обязана написать play()
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Strumming the guitar"); // "Бренчу на гитаре"
    }
}

// Пианино тоже подписало договор, но играет по-своему
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano"); // "Играю на пианино"
    }
}

public class Task2 {
    public static void main(String[] args) { // отсюда старт программы

        // Переменная типа Playable: в неё можно положить любой играбельный объект
        Playable p;

        p = new Guitar(); // теперь p - это гитара
        p.play();         // Выведет: Strumming the guitar

        p = new Piano();  // теперь p - это пианино
        p.play();         // Выведет: Playing the piano
    }
}