#HSLIDE
# Java
lecture 1
## Basics

#HSLIDE
## Отметьтесь на портале
https://atom.mail.ru/

#HSLIDE
# About me
<img src="lecture01/presentation/assets/img/me.jpg" alt="me" style="width: 220px; float: left;"/>  

  alpieex@gmail.com  
  [https://github.com/Al-p-i](https://github.com/Al-p-i)  

  Java 5+ years

- Former software developer in Allods Team (Skyforge)
- Currently lead developer at hh.ru

**Люблю смотреть, как другие пишут тесты**  

#HSLIDE
# Agenda
1. Course structure  
2. Language architecture  
3. Basic syntax  
4. Gradle  
5. Git  
6. Homework 1  

#HSLIDE  
# 1. Course structure
1. **[Course structure]**  
2. Language architecture  
3. Basic syntax  
4. Gradle  
5. Git  
6. Homework 1  

#HSLIDE
#Цель курса
Практическое введение в разработку серверных web приложений на Java  
**Мы научимся:**
- разрабатывать
- тестировать
- деплоить  
  
##Ключевые технологии
**Java SE 8.0**  
**Jersey** - web framework + **jetty** webserver  
**Hibernate** - общение с базами данных  
**WebSocket** - сетевой взаимодействие  
**Инструменты:** Git, Gradle, Docker

#HSLIDE
## References

**Course page**  
[http://gojava.ru](http://gojava.ru) (currently redirects on github)  
[https://github.com/rybalkinsd/atom](https://github.com/rybalkinsd/atom)
  
**technoatom blog**  
[https://atom.mail.ru/blog/view/99/](https://atom.mail.ru/blog/view/99/)
  
**!Telegram chat!**  
[https://t.me/joinchat/AAAAAEF63F9PvqE4JDzYdQ](https://t.me/joinchat/AAAAAEF63F9PvqE4JDzYdQ)  

**JDK8**  
[http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)  
  
**Official documentation**  
[http://docs.oracle.com/javase/8/docs/api/](http://docs.oracle.com/javase/8/docs/api/)

#HSLIDE
# Course plan
1. Intro
2. Java WEB
3. Persisnence
4. Client-server interaction
5. Game mechanics
6. Final project

#HSLIDE
# Оценка
### Структура оценки:
- 3 Рубежных контроля = 16 + 12 + 12  
- Домашние работы и тесты на занятиях = 30  
- Сдача итогового проекта = 30  
- \+ есть возможность получать дополнительные баллы за задания, которые мы даем прямо на семинарах  

**Сертификат:**  
набрать 50 баллов и защитить проект

**Оценки:**  
**3**: 50-69  
**4**: 70-90  
**5**: 90+  

#HSLIDE
# Проект
На протяжении всего курса мы будем разрабатывать **проект** - сервер для клона **bomberman**  

Мы подготовили для вас готовый клиент на javascript  
Группы будут сформированы после первого рубежного контроля  

**Защита проекта - обязательный критерий получения сертификата**

#HSLIDE 
# 2. Language architecture 
1. Course structure  
2. **[Language architecture]**  
3. Basic syntax  
4. Gradle  
5. Git  
6. Homework 1  

#HSLIDE
## Where to use Java?
### Java dominates areas:
- Back-end for enterprise-scale solutions
- Android (specific area)  
  
### Where Java mostly does not work?
- Low level high performance software
- soft for specific hardware
- scripting

#HSLIDE
## Why Java?
### About java
- Java is **mature** (20+ years) => stable and conservative
- Java has active community (in Russia too)
- Java has rich choice of libraries and frameworks
- *Java is fast*  

### Technical side
- Java is crossplatform - 'Write Once, Run Anywhere' **(WORA)**
- Java is **object-oriented**, **class-based**
- Java is compiled to **Byte Code** (not to machine codes), which is executed by **Java Virtual Machine (JVM)**
- static strong safe typisation
- automatic memory management (GC)
- concurrent

#HSLIDE
## JDK/JRE/JVM
**JDK** - Java Development Kit  
**JRE** - Java Runtime Environment  
**JVM** - Java Virtual Machine 
<img src="lecture01/presentation/assets/img/jdk-jre2.png" alt="me" style="width: 900px; float: left;"/>  

#HSLIDE
**JDK** - Java Development Kit  
**JRE** - Java Runtime Environment  
**JVM** - Java Virtual Machine   
<img src="lecture01/presentation/assets/img/jdk-jre.png" alt="me" style="width: 750px; float: left;"/>  
  
**JDK** =  
JRE + Tools  
  
**JRE** =  
JVM + Lang + Libs

#HSLIDE 
## From source to running program
<img src="lecture01/presentation/assets/img/codeflow.png" alt="me" style="width: 750px; float: left;"/>  

#HSLIDE 
## Basic setup
1. Download [**JDK8**](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)  

2. set **path** and **JAVA_HOME** environment variables
**Linux:**
```bash
> echo "PATH='/path/to/jdk8/bin:$PATH'" >> ~/.bashrc
> echo "JAVA_HOME='/path/to/jdk8/'" >> ~/.bashrc
> source ~/.bashrc
> echo $PATH
```
**macOS:** (possibly sudo)
```bash
> echo "PATH='/path/to/jdk8/bin:$PATH'" >> /etc/profile
> echo "JAVA_HOME='/path/to/jdk8/'" >> /etc/profile
> source /etc/profile
> echo $PATH
```

Windows (только через настройки системы) :(
1) https://docs.oracle.com/javase/tutorial/essential/environment/paths.html
2) Перезапустить консоль


#HSLIDE 
# Hello, World!
HelloWorld.java
(file name must match public class inside file)
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

#HSLIDE 
# compile and run
**javac** - java compiler

Compile program
```bash
> javac HelloWorld.java
```

Run program
```bash
> java HelloWorld
Hello, World!
```

#HSLIDE 
# 3. Basic syntax 
1. Course structure  
2. Language architecture  
3. **[Basic syntax]**  
4. Gradle  
5. Git  
6. Homework 1  

#HSLIDE 
# Basic types
| Type          | Size          | Range  			|
| ------------- |:-------------:| -----------------:|
| boolean       | undefined 	| true/false 		|
| byte        	| 1 byte      	| -128-127 			|
| char 			| 2 bytes      	| \u0000-\uffff 	|
| short 		| 2 bytes      	| -32768 - 32767	|
| int 			| 4 bytes      	| -2^31 - (2^31)-1	|
| long 			| 8 bytes     	| -2^63 - (2^63)-1	|
| float 		| 4 bytes      	| IEEE 754			|
| double 		| 8 bytes      	| IEEE 754 			|
| **reference** | system bitness|					|

#HSLIDE 
# Operators
|Operator type 	|Operator 			    	|
|---------------|---------------------------|
|Assignment 	| =, +=, *= …^=				|
|Arithmetical 	| +, -, *, /, %				|
|Relational 	| <, >, <=, >=, ==, !=		|
|Logical 		| &&, &#124;&#124;			|
|Bitwise 		| &, &#124;, ^, >>, <<, >>>	|
|Unary 			| ++, --, +, -, !			|
|Relational2 	| instanceof				|


#HSLIDE
#Expressions

```java
int value = 0;

int[] array = new int[10];
array[0] = 100;

System.out.println("Hello, world!");

if (value1 == value2)
	System.out.println("value1 == value2");

int commonVariable = 0;
if (commonVarialbe > -42) { // ← начало блока
    int innerVariable = commonVariable + 1;
    System.out.println(String.format(“Inner variable is %d“, innerVariable));
} // ← конец блока
/*
    а здесь innerVariable уже нет
*/
```
#HSLIDE
#if else
As in c
```java
if (18 == yourAge) {
    // у вас всё хорошо
} else if (yourAge > 18
           && yourAge <= 25) {
    // бывало и лучше
} else {
    // ¯\_(ツ)_/¯
}
```
#HSLIDE
## switch case
```java
switch (countOfApple) {
    case 1: // у нас есть 1 яблоко
        break;
    case 2: // у нас есть 2 яблока
        break;
    …
    default: 
        // прочие случаи
        break;
}

```

#HSLIDE
## loops
```
while (expression) statement

do { statement } while (expression)

for (initialization; termination; increment)
	statement
```
**Examples:**
```java
for (int i = 0; i < numberOfObjects; i++) {
    // iterates numberOfObjects times,
    // if numberOfObjects >= 0
}

int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
for (int i : digits ) {
    System.out.println(“Digit: “ + digit);
}

//Для хипстеров
IntStream.range(0, 10).forEach(digit -> System.out.println(digit));

IntStream.range(0, 10).forEach(System.out::println);

```

#HSLIDE 
# Methods
```java
public int getCountOfApples(List<Integer> boxes, Integer[] numberOfBoxes) 
        throws Throwable {

    Integer sumOfApples = 0;
    for (Integer i : numberOfBoxes) {
        sumOfApples += boxes.get(i);
    }
    return sumOfApples;
}
```
Access modifier ```		public```  
Return type ```			int```  
Method name ```			getCountOfApples```  
Parameter list ```		( … )```  
Exception list ```		throws Throwable```  
Method body ```			{ … }```  

#HSLIDE 
# 4. Gradle 
1. Course structure  
2. Language architecture  
3. Basic syntax  
4. **[Gradle]**  
5. Git  
6. Homework 1  

#HSLIDE
# Gradle
https://gradle.org/
build automation system  
like maven but more powerful  
do not need installation
just use
```bash
> gradlew.bat
```
#HSLIDE
# Gradle workflow
https://guides.gradle.org/creating-java-applications/
gradle assemble
gradle check

#HSLIDE 
# 5. Git 
1. Course structure  
2. Language architecture  
3. Basic syntax  
4. Gradle  
5. **[Git]**  
6. Homework 1  

#HSLIDE 
# Git
1. Install git
https://git-scm.com/

#HSLIDE
## Fork repository and set upstream
1. Форкните репозиторий - в вашем github появится копия репозитория
```bash
> git clone https://github.com/YOUR_USERNAME/YOUR_FORK.git
```
2. Настроим синхронизацию репозитория, чтобы вы работали со свежей версией кода
```bash
> cd atom
> git remote add upstream https://github.com/rybalkinsd/atom.git
```
3. Проверим, что синхронизация включена (интересны 2 последние строки)
```bash
> git remote -v
origin  https://github.com/YOUR_USERNAME/YOUR_FORK.git (fetch)
origin  https://github.com/YOUR_USERNAME/YOUR_FORK.git (push)
upstream https://github.com/rybalkinsd/atom.git (fetch)
upstream https://github.com/rybalkinsd/atom.git (push)
```

#HSLIDE
## Basic git
Посмотреть текущую ветку
```bash
> git branch
master
```
выбрать ветку lecture1
```bash
> git checkout lecture1
```
добавить файл к будущему коммиту
```bash
> git add changed_file
```
зафиксировать изменения в локальном репозитории
```bash
> git commit -m 'Сообщение с пояснением коммита'
```
послать изменения в удаленный (публичный) репозиторий
```bash
> git push
```

#HSLIDE
# Travis  
Continuous Integration Tool  
[https://travis-ci.org/](https://travis-ci.org/)  
When you push to repository - travis automatically runs on his server
```bash
> ./gradlew assemble
> ./gradlew check
```
So it does for all branches and pull requests
[https://travis-ci.org/rybalkinsd/atom/pull_requests](https://travis-ci.org/rybalkinsd/atom/pull_requests)

#HSLIDE
Branch

#HSLIDE 
# 6. Homework 1 
1. Course structure  
2. Language architecture  
3. Basic syntax  
4. Gradle  
5. Git  
6. **[Homework 1]**  

#HSLIDE
# Homework 1
4 balls

#HSLIDE
## Оставьте обратную связь в анкете для обратной связи. Это важно!