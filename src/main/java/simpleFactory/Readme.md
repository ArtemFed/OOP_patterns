Шаблон: Фабрика (Factory Method) <br>
======================================================================================================= <br>
Цель:

Создание интерфейса, который создаёт объект. При этом, выбор того, экземпляр какого класса создавать
остаётся за классами, которые имплементируют данный интерфейс.<br>
=======================================================================================================<br>

Для чего используется:

Для делигирования создания экземпляров, другому классу.

======================================================================================================= <br>
Пример использования:

- заранее неизвестно, экземпляры, какого класса нужно будет создавать;
- класс спроектирован таким образом, что создаваемые им объекты имеют свойства определённого класса.

================================================================================ <br>
Схема: <br>
![img.png](img.png)