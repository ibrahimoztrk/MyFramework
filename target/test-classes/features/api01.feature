@butunmusteriler
Feature: Gmi Bank All Customer Info
  @apicustomer
  Scenario: All customer data
    Given kullaniciii tum musteri bilgilerini okur sayfasina giderek "https://www.gmibank.com/api/tp-account-registrations"
    And kullaniciii "291-34-8312"  kayitli musteriyi bulur
    Then kullaniciii adrese gider "https://www.gmibank.com/api/tp-account-registrations" ssn "ssn" numarasi  "291-34-8312" ile  assert yapar
  @apicountry
  Scenario: Country
    Given kullaniciii tum countr bilgilerini okur sayfasina giderek "https://www.gmibank.com/api/tp-countries"
    Then kullaniciii country assert "Malta" eder
  @apistate
  Scenario: State
    Given kullaniciii tum state bilgilerini okur sayfasina giderek "https://www.gmibank.com/api/tp-states"
    Then kullaniciii state "Virginia" aseert eder
  @us24_post
  Scenario: US24_post
    Given kullaniciii state bilgilerini okur sayfasina giderek "https://www.gmibank.com/api/tp-states"
    And kullaniciii yeni  bir  state olusturur "Baye" ve assert eder
  @us_27
  Scenario: delete state
    Given kullaniciii tum state bilgilerini okur sayfasina giderek "https://www.gmibank.com/api/tp-states"
  @us_26
  Scenario: country guncelleme
    Given kullaniciii tum countr bilgilerini okur sayfasina giderek "https://www.gmibank.com/api/tp-countries"
    And kullaniciii country gunceller ve assert eder
  @us25_post
  Scenario: US25_post_country
    Given kullaniciii tum countr bilgilerini okur sayfasina giderek "https://www.gmibank.com/api/tp-countries"
    And kullaniciii yeni  bir  country olusturur "Yeni Bayram" ve assert eder