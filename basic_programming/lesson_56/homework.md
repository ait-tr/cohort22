##  Homework

### Задание 1  

Создайте класс пост Post - с полями:
- количество лайков likesNumber
- текст поста text
- количество репостов repostsNumber
- id - индивидуальное поле (не статическое)
- totalNumberOfPosts - всего постов - это статическое поле для расчета id
  totalNumberOfPost - можно увеличивать в конструкторе.

Создайте два TreeSet:
- первый при помощи интерфейса Comparable - по id
- второй при помощи интерфейса Comparator - по количеству лайков
  со звездочкой:
- создайте еще один TreeSet - сортированный по длине поста

