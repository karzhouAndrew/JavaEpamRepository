package lab5;
/**
 *Создать иерархию классов, описывающих бытовую технику.
 *Создать несколько объектов описанных классов, часть из них включить в розетку.
 Иерархия должна иметь хотя бы три уровня.
 */
public class Hometask5 {
    public static void main(String[] args) {

        WhiteGoods array[] = {
            new Computers ("Компьютер 1", "HP", 550, 10000 , "Intel Xeon", "Windows 7"),
            new Computers ("Компьютер 2", "Lenovo", 850, 4000 , "Intel Core I5", "Windows 8.1"),
            new VacuumCleaners ("Пылесос 1", "Samsung", 1100, 6000, true, "dry"),
            new VacuumCleaners ("Пылесос 2", "LG", 1600, 7500, false, "wet")
        };
        System.out.println("В розетку включены приборы:\n");
        ConnectionService connectionService = new ConnectionService();
        for (int i=0; i < array.length; i+=2) {
            //array[i].connect();
            //array[i].connected = true;
            connectionService.connect(array[i]);
            System.out.println(array[i].name + "\n");
        }
    }
}
