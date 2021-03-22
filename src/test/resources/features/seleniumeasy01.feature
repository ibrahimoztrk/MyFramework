@seleniumeasy01
Feature: Seleniumeasy test page


  @TC001
  Scenario: user is on the home page
    Given The user is on the page of "https://www.seleniumeasy.com/test/"
    Given The user clicks on the Start Practicing
    And The user clicks on the Simple Form Demo

  @TC002
  Scenario: Kullanici Single Input Field alanina mesaj yazar
    Given Kullanici "https://www.seleniumeasy.com/test/basic-first-form-demo.html" sayfasi uzerindedir
    Given Kullanici, Single Input Field basligi altindaki Enter message box'ina "Salut tout le Monde" yazar
    Then Kullanici Show Message butonuna tikladiginda Your Message: kisminda mesaj box'ina yazmis oldugu "Salut tout le Monde" gormeli ve dogrulamalidir

  @TC003
  Scenario: Kullanici Two Input Fields alaninda toplama islemi yapabilir
    Given Kullanici "https://www.seleniumeasy.com/test/basic-first-form-demo.html" sayfasi uzerindedir
    Given Kullanici a kutusuna sayisal deger girer
    And Kullanici b kutusuna saysal deger girer
    And kullanici a ve b kutusuna girdigi degerlerin toplamini get total butonuna basinca gorebilir
    And Kullanici a kutusuna sayisal deger disinda bir deger girer
    And Kullanici b kutusuna sayisal deger disinda bir deger girer
    Then kullanici a ve b kutusuna girdigi degerlerin toplamini get total butonuna basinca "Total a + b = NaN" olarak gorur