# Домашнее задание к занятию «Testability. Введение в ООП»

## Цель задания

1. Написать свои сервисные классы.
2. Научиться писать многофайловую программу.

------

## Инструкция к заданию

1. Скачайте и установите профессиональный редактор кода [Intellij Idea Community Version](https://www.jetbrains.com/idea/download/).
1. Откройте IDEA и [создайте новый Java-проект](QA_Java_Idea_Create.md). Под каждую задачу следует создавать отдельный проект, если обратное не сказано в условии.
2. Создайте пустой репозиторий на GitHub и свяжите его с папкой вашего проекта, а не с какой-либо другой.
3. Правильно настройте репозиторий в плане `.gitignore`. Проигнорируйте папки `.idea` и `out` и `.iml`-файл — их в репозитории быть не должно.
4. Выполните в IDEA требуемую задачу согласно условию.
5. Проверьте соблюдение [правил форматирования кода](QA_Java_Idea_Format.md).
6. Закоммитьте и отправьте в репозиторий содержимое папки проекта.

------

## Материалы, которые пригодятся для выполнения задания

1. [Как создать Java-проект в IDEA?](QA_Java_Idea_Create.md)
1. [Как отформатировать код в Java?](QA_Java_Idea_Format.md)

------

## Задание 2 — обязательное

В этой задаче мы считаем, что пользователь вводит корректные значения входных данных.

Вы решили написать сервис, который рассчитывает индекс массы тела (body mass index).

Формулу расчёта bmi-индекса вам предстоит найти самостоятельно.
Сервисный метод должен возвращать целое число. Чтобы дробное превратить в целое, можете использовать приведение типов: `(int) index`, где `index` имеет дробный тип.
Пример для самопроверки: для роста 1.87 метра и веса 98 кг он будет 28.

Создайте класс `BmiService` с методом `calculate`:
* который принимает все нужные данные в параметрах;
* в названии параметров указаны единицы измерения, например, в метрах ли вы принимаете рост;
* метод возвращает посчитанный bmi-индекс в виде целого числа.

Продемонстрировать в `Main` по аналогии с первой задачей:
* создание объекта;
* вызов метода `calculate`;
* печать в консоль результата, проверьте, что ваша программа считает правильно, сравнив его со своими примерами.

------
