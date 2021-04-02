@seleniumeasy06
Feature: User is on the Webtables


  @TC001
  Scenario: user is on the home page
    Given The user is on the page of "https://www.seleniumeasy.com/test/"
    And The user clicks on the Start Practicing
    And The user clicks on the Table


    @TC002
    Scenario: Kullanici Table Pagination sayfasindadir
      Given The user clicks on Table Pagination
      And Kullanici # satirinin "1" ile basladigini assert eder
      And Kullanici ikinci. sayfa linkine tiklar
      And Kullanici ikinci. sayfanin  # satirinin "6" ile basladigini assert eder
      And Kullanici ucuncu.sayfanin linkine tiklar
      And Kullanici ucuncu sayfa  # satirinin "11" ile basladigini assert eder
      And Kullanici tekrar birinci sayfaya doner
      And Kullanici ileri sayfa linkine tiklar
      And Kullanici # satirinin ilk hucresinin "6" ile basladigini assert eder
      And Kullanici geri sayfa linkine tiklar
      And Kullanici # satirinin birinci hucresinin "1" ile basladigini assert eder
      Then Kullanici toplam 91 cell oldugunu assert eder

      @TC003
      Scenario: Kullanici table data search sayfasindadir
        Given Kullanici table data search linkine tiklar
        And Kullanici Tasks panelinin altinda sirasiyla Task, Assignee, Status basliklarinin oldugunu dogrular.
        And Kullanici input'ta Filter by Task,Assignee,Status textinin yer aldigini dogrular
        And Kullanici input'a "Mike" yazar
        Then Kullanici tabloda sadece bir satir oldugunu ve bu satirin "Mike" ismine ait oldugunu assert eder

        @TC004
        Scenario: Listed Users tablosunda filtreleme yapar
          Given Kullanici Listed Users panelinin aldindaki 4 tane input'un aktif olmadigini assert eder
          And Kullanici filtre butonuna basar
          And Kullanici firstname inputune "B" harfi girer
          Then Kullanici tablo'da B harfi ile baslayan iki isime ait satirlari gorur


