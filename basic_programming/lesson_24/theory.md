## Массивы

### Что такое двумерный массив Java?
Двумерный массив в Java — это массив массивов, то есть в каждой его ячейке находится ссылка на некий массив. Но гораздо проще его представить в виде таблицы, у которой задано количество строк (первое измерение) и количество столбцов (второе измерение). Двумерный массив, у которого все строки имеют равное количество элементов, называется прямоугольным.  
Объявление, создание и инициализация двумерных массивов
````
Процедура объявления и создания двумерного массива практически такая же, как и в случае одномерного:

int[][] twoDimArray = new int[3][4];

Этот массив имеет 3 строки и 4 столбца. 
Размер прямоугольного двумерного массива (они могут и не быть прямоугольными, об этом — чуть ниже),
то есть общее количество элементов можно определить, перемножив количество строк на количество столбцов. 
Сейчас он проинициализирован (заполнен) значениями по умолчанию. То есть — нулями. 
Давайте заполним его нужными нам значениями.

twoDimArray[0][0] = 5;//записали значение 5 в ячейку на пересечении нулевой строки и нулевого столбца
twoDimArray[0][1] = 7; //записали значение 7 в ячейку на пересечении нулевой строки и первого столбца
twoDimArray[0][2]  = 3;
twoDimArray[0][3] = 17;
twoDimArray[1][0] = 7;
twoDimArray[1][1] = 0;
twoDimArray[1][2] = 1;
twoDimArray[1][3] = 12;
twoDimArray[2][0] = 8;
twoDimArray[2][1] = 1;
twoDimArray[2][2] = 2;
twoDimArray[2][3] = 3;

Как и в случае с одномерными массивами, можно провести процедуру инициализации быстрее:

int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};

И в том, и в другом случае мы получим двумерный массив с тремя строками и четырьмя столбцами, заполненный целыми числами.
````  