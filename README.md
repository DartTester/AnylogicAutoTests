# Smoke tests for [CLICK Company Site](https://companyclick.ru/#tabs_desc_415_6) <p align="center">

![2022-08-28_19h49_56](https://companyclick.ru/wp-content/uploads/2018/09/Logo_Click.png)
                                                              
## 🧰: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

## :boom: Реализованные проверки

- ✓ Vacancy form should appear after click the button
- ✓ Page title should have header text
- ✓ Page console log should not have errors
- ✓ Block Work Flow should not have text 'Cloud Databases'

## 🧙: Параметры сборки в Jenkins:

- Browser (браузер, по умолчанию chrome)
- Version (версия браузера, по умолчанию 100.0)
- Browser_size (размер окна браузера, по умолчанию 1920x1080)

## :japanese_ogre: Запуск тестов из терминала

Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
clean
test
-Dbrowser=${BROWSER}
-Dversion=${VERSION}
-Dsize=${BROWSER_SIZE}
-Durl=${REMOTE_URL}
```
