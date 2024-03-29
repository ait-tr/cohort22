
## Iterator


Дословно «Iterator» можно перевести как «переборщик». То есть это некая сущность, способная перебрать все элементы в коллекции. При этом она позволяет это сделать без вникания во внутреннюю структуру и устройство коллекций.  

Методы итератора
- boolean hasNext() — если в итерируемом объекте (пока что это Collection) остались еще значение — метод вернет true, если значения кончились false.

- E next() — возвращает следующий элемент коллекции (объекта). Если элементов больше нет (не было проверки hasNext(), а мы вызвали next(), достигнув конца коллекции), метод бросит NoSuchElementException.

- void remove() — удалит элемент, который был в последний раз получен методом next().  
    
 Метод может бросить:
- UnsupportedOperationException, если данный итератор не поддерживает метод remove() (в случае с read-only коллекциями, например)
- IllegalStateException, если метод next() еще не был вызван, или если remove() уже был вызван после последнего вызова next().