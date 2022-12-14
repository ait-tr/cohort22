public class Main {
    public static void main(String[] args) {
        Glass wineBottle = new Glass("Whine bottle", 150, 0.7, "green");
        Organic bananasPeels = new Organic("Bananas peels", 15, 0.02, 30);
        Plastic shampooBottle = new Plastic("HDPE", "Head and shoulders", 0.2, 0.7);
        wineBottle.use();
        bananasPeels.use();
        shampooBottle.use();
//        Waste[] wastesArray = {wineBottle, bananasPeels, shampooBottle};
//        for(Waste element: wastesArray) {
//            element.use();
//        }
        /*
                                    Waste
                              abstract   мусор
                             /      \          \
                            /        \          \
                       Plastic      Glass     Organic

        мусор:   вес weight, объем volume, title
                метод void use() - пустой
        plastic: маркировка marking String
                --> "Пластик %s с маркировкой %s - отправляем на переработку пластика"
        glass:   цвет color
                --> "Стекло%s %s цвета - отправляем на переработку стекла"
        organic:  int decompositionTime - количество дней за которое разлагается
                --> "%s отправляем в компостную кучу".
                --> "Sending to the compost bin"
         */
    }

}