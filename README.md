# Belenov_AIS
## Как запустить:
1. Скачать OpenJFX 12 ([example](https://github.com/Devorlon/OpenJFX-Installation-Linux))
2. Распокавать библитеку в удобной вам дирриктории
3. Подключить библиотеку к среде разработки
```
IDEA -> File -> Project Structure -> Lib && Global Lib -> '+' -> Java -> 'path' -> add
```

## Описание
Создать десктопное приложение по теме "АИС учета продаж тарифных планов операторов сотовой связи"
- Подключение и работа с БД
- Интерфейс
- Доп. логика по теме

## БД - PostgreSQL
1. скачать PostgreSQL
```
sudo apt install postgresql postgresql-contrib
sudo -i -u postgres
``` 
Установим также графический интерфейс ([example](https://github.com/Devorlon/OpenJFX-Installation-Linux))
Создадим нашу БД "Учет продаж тарифных планов" - УПТП
3. установить подключение к IDEA
