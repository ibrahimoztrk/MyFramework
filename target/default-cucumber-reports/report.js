$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/api01.feature");
formatter.feature({
  "name": "Gmi Bank All Customer Info",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@butunmusteriler"
    }
  ]
});
formatter.scenario({
  "name": "All customer data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@butunmusteriler"
    },
    {
      "name": "@apicustomer"
    }
  ]
});
formatter.step({
  "name": "kullaniciii tum musteri bilgilerini okur sayfasina giderek \"https://www.gmibank.com/api/tp-account-registrations\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "kullaniciii \"291-34-8312\"  kayitli musteriyi bulur",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "kullaniciii adrese gider \"https://www.gmibank.com/api/tp-account-registrations\" ssn \"ssn\" numarasi  \"291-34-8312\" ile  assert yapar",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Country",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@butunmusteriler"
    },
    {
      "name": "@apicountry"
    }
  ]
});
formatter.step({
  "name": "kullaniciii tum countr bilgilerini okur sayfasina giderek \"https://www.gmibank.com/api/tp-countries\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "kullaniciii country assert \"Japan\" eder",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "State",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@butunmusteriler"
    },
    {
      "name": "@apistate"
    }
  ]
});
formatter.step({
  "name": "kullaniciii tum state bilgilerini okur sayfasina giderek \"https://www.gmibank.com/api/tp-states\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "kullaniciii state \"ohio\" aseert eder",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "US24_post",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@butunmusteriler"
    },
    {
      "name": "@us24_post"
    }
  ]
});
formatter.step({
  "name": "kullaniciii state bilgilerini okur sayfasina giderek \"https://www.gmibank.com/api/tp-states\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "kullaniciii yeni  bir  state olusturur \"Baye\" ve assert eder",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "delete state",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@butunmusteriler"
    },
    {
      "name": "@us_27"
    }
  ]
});
formatter.step({
  "name": "kullaniciii tum state bilgilerini okur sayfasina giderek \"https://www.gmibank.com/api/tp-states\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "country guncelleme",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@butunmusteriler"
    },
    {
      "name": "@us_26"
    }
  ]
});
formatter.step({
  "name": "kullaniciii tum countr bilgilerini okur sayfasina giderek \"https://www.gmibank.com/api/tp-countries\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "kullaniciii country gunceller ve assert eder",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "US25_post_country",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@butunmusteriler"
    },
    {
      "name": "@us25_post"
    }
  ]
});
formatter.step({
  "name": "kullaniciii tum countr bilgilerini okur sayfasina giderek \"https://www.gmibank.com/api/tp-countries\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "kullaniciii yeni  bir  country olusturur \"Yeni Bayram\" ve assert eder",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});