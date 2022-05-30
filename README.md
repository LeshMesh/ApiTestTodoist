# Дипломный проект по автоматизации тестирования API сайта [Todoist](http://todoist.com/ru/)
Реализован во время обучения в Школе инженеров по автоматизации тестирования [qa.guru](http://qa.guru/)

## Технологии и инструменты
<p align="left"> 
<a href="https://www.jetbrains.com/idea/" target="_blank" rel="noreferrer"> <img src="https://github.com/LeshMesh/LeshMesh/blob/main/icon/Intelij_IDEA.png" width="40" height="40"/> </a>
<a href="https://www.oracle.com/java/" target="_blank" rel="noreferrer"> <img src="https://github.com/LeshMesh/LeshMesh/blob/main/icon/Java.png" width="40" height="40"/> </a>
<a href="https://gradle.org/" target="_blank" rel="noreferrer"> <img src="https://github.com/LeshMesh/LeshMesh/blob/main/icon/Gradle.png" width="40" height="40"/> </a>
<a href="https://junit.org/junit5/" target="_blank" rel="noreferrer"> <img src="https://github.com/LeshMesh/LeshMesh/blob/main/icon/JUnit5.png" width="40" height="40"/> </a>
<a href="https://rest-assured.io/" target="_blank" rel="noreferrer"> <img src="https://github.com/LeshMesh/LeshMesh/blob/main/icon/Rest-Assured.png" width="40" height="40"/> </a>
<a href="https://selenide.org/" target="_blank" rel="noreferrer"> <img src="https://github.com/LeshMesh/LeshMesh/blob/main/icon/Selenide.png" width="40" height="40"/> </a>
<a href="https://qameta.io/allure-report/" target="_blank" rel="noreferrer"> <img src="https://github.com/LeshMesh/LeshMesh/blob/main/icon/Allure_Report.png" width="40" height="40"/> </a> 
<a href="https://www.jenkins.io/" target="_blank" rel="noreferrer"> <img src="https://github.com/LeshMesh/LeshMesh/blob/main/icon/Jenkins.png" width="40" height="40"/> </a>
<a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/daniilshat/daniilshat/2d7eafe5250314b3d422c86b35de062e0f1f5178/icons/git.svg" alt="git" width="40" height="40"/> </a>
<a href="https://telegram.org/" target="_blank" rel="noreferrer"> <img src="https://github.com/LeshMesh/LeshMesh/blob/main/icon/telegram.png" width="38" height="38"/> </a>

> *В данном проекте автотесты написаны на <code><strong>*Java*</strong></code> с использованием фреймворка <code><strong>*Rest-Assured*</strong></code> для API тестов*
>
> *Для сборки проекта используется <code><strong>*Gradle*</strong></code>.*
>
> *<code><strong>*JUnit 5*</strong></code> используется как фреймворк для модульного тестирования.*
>
> *Запуск тестов выполняется из <code><strong>*Jenkins*</strong></code>.*
>
> *<code><strong>*Allure Report, Telegram Bot*</strong></code> используются для визуализации результатов тестирования.*
  
## Реализованы проверки API

- [x] Получить все проекты пользователя
- [x] Получить конкретный проект пользователя
- [x] Создать новый проект
- [x] Создать новую задачу 
- [x] Удалить проект

## Запуск тестов из терминала

*Запуск тестов осуществляется с помощью команды:*

```bash
gradle clean test
```
  
## Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/011-LeshMesh-GraduationWork-ApiTests/)
*Для запуска сборки необходимо указать значения параметров и нажать кнопку <code><strong>*Собрать*</strong></code>.*
 
<p align="center">
  <img src="files/jenkins.png" alt="jenkins" width="1000">
</p>

*После выполнения сборки, в блоке <code><strong>*История сборок*</strong></code> напротив номера сборки появится
значок <img width="2%" title="Allure Report" src="https://github.com/LeshMesh/LeshMesh/blob/main/icon/Allure_Report.png"><code><strong>*Allure
Report*</strong></code>, кликнув по которому, откроется страница со сформированным отчетом.*

<p align="center">
  <img src="files/jenkins2.png" alt="jenkins" width="1000">
</p>

## Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/011-LeshMesh-GraduationWork-ApiTests/5/allure/#)

<p align="center">
  <img src="files/allure.png" alt="allure" width="1000">
</p>

### Список тестов c визуализацией результатов
  
<p align="center">
  <img src="files/allure3.png" alt="allure" width="1000">
</p>

### Графики запуска тестов
  
<p align="center">
  <img src="files/allure2.png" alt="allure" width="1000">
</p>
  
## Уведомления в Telegram
> После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне.

<p align="center">
  <img src="files/telegram_notification.png" alt="telegram" width="400">
</p>

