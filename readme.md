# Boxes application
## Описание
Приложение BoxesApp предназначено для управления погрузкой посылок в грузовики, а также анализа загруженности грузовиков.
Приложение поддерживает чтение данных о посылках и грузовиках из файлов формата JSON.

## Установка
1. Скачайте проект с [репозитория](https://github.com/KovalevNikolay/ConsoleBoxes).
2. Откройте проект в вашей IDE.
3. Убедитесь, что у вас установлен JDK 17 или выше

## Запуск приложения
Для запуска приложения выполните метод `main` в классе `BoxesApplication`.
```java
public static void main(String[] args) {
    // код для инициализации приложения
}
```
## Использование
При запуске приложения пользователю будет предложено выбрать одно из двух действий:
1. **Погрузить посылки**. Позволяет загружать посылки в грузовики.
2. **Посчитать количество посылок в грузовике**. Позволяет проанализировать грузовики и вывести количество посылок каждого типа для каждого грузовика.

## Входные данные
1. **Погрузка посылок**.
   - **Размеры кузова грузовика:**
     - Высота кузова.
     - Длина кузова.
     - Количество грузовиков, в которые будет выполняться погрузка.
   - **Путь к JSON файлу с посылками**. Введите полный путь к файлу.
   - **Выбор алгоритма погрузки**
     - **1 Для равномерной погрузки** - посылки будут равномерно распределяться по грузовикам.
     - **2 Для качественной погрузки** - каждый грузовик будет загружаться масимально плотно
#### Пример ввода:
```
Введите размеры кузова грузовика.
Введите высоту кузова: 6
Введите длину кузова: 6
Введите количество грузовиков: 3
Введите путь к JSON файлу с посылками: /path/to/boxes.json
Выберите алгоритм погрузки:
1. Равномерная погрузка
2. Качественная погрузка
(Введите цифру выбранного варианта): 2
```
#### Пример вывода:
```
+55555 +
+88881 +
+888822+
+999333+
+999666+
+999666+
++++++++

+      +
+      +
+      +
+4444  +
+777   +
+7777  +
++++++++
```
2. **Анализ количества посылок в грузовиках**.
    - **Путь к JSON файлу с грузовиками**. Введите полный путь к файлу.
#### Пример ввода:
```
Введите путь к JSON файлу с грузовиками: /path/to/trucks.json
```
#### Пример вывода:
```
Грузовик: 
+      +
+      +
+55555 +
+9991  +
+999221+
+999333+
++++++++

Количество посылок: 
Размер посылки: 1 количество: 2 шт.
Размер посылки: 2 количество: 1 шт.
Размер посылки: 3 количество: 1 шт.
Размер посылки: 5 количество: 1 шт.
Размер посылки: 9 количество: 1 шт.
```

## Ограничения
1. **Проверка входных данных:** Приложение выбросит `IllegalArgumentException`, если пользователь введет некорректные данные 
(например, отрицательные размеры кузова грузовика или неверный номер опции из меню).
2. **Формат файлов**. Файлы с посылками и грузовиками должны быть в формате JSON.
#### Пример структуры JSON файла с посылками:
```json
[
  {
    "body": [
      [1]
    ]
  },
  {
    "body": [
      [2, 2]
    ]
  },
  {
    "body": [
      [5, 5, 5, 5, 5]
    ]
  },
  {
    "body": [
      [6,6,6],
      [6,6,6]
    ]
  }
]
```
#### Пример структуры JSON файла с грузовиками:
```json
[
  {
    "body": [
      [null, null, null, null, null, null],
      [null, null, null, null, null, null],
      [5, 5, 5, 5, 5, null],
      [9, 9, 9, 1, null, null],
      [9, 9, 9, 2, 2, 1],
      [9, 9, 9, 3, 3, 3]
    ]
  }
]
```
3. **Размеры грузовиков**. Высота и длина кузова не могут быть меньше или равны нулю.
## Заключение
Приложение BoxesLoader предоставляет пользователю простой и удобный интерфейс для управления загрузкой посылок в грузовики. 
Пожалуйста, убедитесь, что все входные данные корректны и файлы формата JSON правильно структурированы перед использованием.