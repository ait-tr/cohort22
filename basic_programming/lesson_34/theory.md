
### Наследование

Наследование является неотъемлемой частью Java. При использовании наследования вы говорите: Этот новый класс похож на тот старый класс. В коде это пишется как extends, после которого указываете имя базового класса. Тем самым вы получаете доступ ко всем полям и методам базового класса. Используя наследование, можно создать общий класс, которые определяет характеристики, общие для набора связанных элементов. Затем вы можете наследоваться от него и создать новый класс, который будет иметь свои уникальные характеристики. Главный наследуемый класс в Java называют суперклассом. Наследующий класс называют подклассом. Получается, что подкласс - это специализированная версия суперкласса, которая наследует все члены суперкласса и добавляет свои собственные уникальные элементы.

### Ключевое слово super
В Java существует ключевое слово super, которое обозначает суперкласс, т.е. класс, производным от которого является текущий класс. В данном случае, супер не означает превосходство, скорее даже наоборот, дочерний класс имеет больше методов, чем родительский. Само слово пошло из теории множеств, где используется термин супермножество.

### Абстрактный класс 
- Похож на обычный класс.
- В абстрактном классе также можно определить поля и методы, но в то же время нельзя создать объект или экземпляр абстрактного класса. 
- Абстрактные классы призваны предоставлять базовый функционал для классов-наследников. А производные классы уже реализуют этот функционал.