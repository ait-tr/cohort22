## Техника тесирования методом черного ящика — диаграммы перехода состояний

Тестирование переходов между состояниями определяется как методика тестирования ПО, когда изменения условий ввода вызывают изменения состояния в тестируемом приложении.
При этом тестировщик анализирует поведение тестируемого приложения для различных входных условий в последовательности, применяя как положительные, так и отрицательные входные значения теста и записывая поведение системы.
Техника полезна, когда вам необходимо протестировать различные системные переходы
#### Два вида визуального представления техники:

- Диаграмма переходов состояний (State-Transition Diagram)

- Таблица переходов состояний (State-Transition Table)

#### Составляющие диаграммы перехода состояний

- States(Состояния) - возможные условия существования системы в данный момент

- Transitions(Переходы) - возможные изменения объекта, приводящие к изменению состояния

- Events(События) - внешние события, которые могут произойти и вызывают изменение состояния

## Метод тестирования WHITE-BOX

Как правило, он используется на уровне тестирования компонентов(т.н. модульного тестирования), но его также можно применять на любом другом уровне, используя различные модели ПО «белого ящика»

- Покрытие операторов(statement coverage) включает выполнение всех операторов хотя бы один раз в исходном коде. Оно требует, чтобы каждый исполняемый оператор выполнялся хотя бы один раз по крайней мере в одном тесте

- Покрытие ветвей(branch coverage) также известно как покрытие решений(decision coverage) или покрытие всех границ(all-edges coverage). Оно охватывает как истинные, так и ложные условия, маловероятные для покрытия операторов 