
## HashSet

Класс Java HashSet используется для создания коллекции, которая использует хеш-таблицу для хранения информации. Он наследует класс AbstractSet и реализует интерфейс Set.

### Важными моментами в классе Java HashSet являются:

- HashSet хранит элементы с помощью механизма, называемого хэшированием.
- HashSet содержит только уникальные элементы.
- HashSet допускает null значение.
- Класс HashSet не синхронизирован.
- HashSet не сохраняет порядок вставки. Здесь элементы располагаются на основе их хэш-кода.
- HashSet — лучший подход для операций поиска.
- Начальная емкость HashSet по умолчанию — 16, а коэффициент загрузки — 0,75.

### Разница между list и set
Список(list) может содержать повторяющиеся элементы, тогда как множество(set) содержит только уникальные элементы.

### Иерархия класса HashSet  

Класс HashSet расширяет класс AbstractSet, реализующий интерфейс Set. Интерфейс Set наследует интерфейсы Collection и Iterable в иерархическом порядке.