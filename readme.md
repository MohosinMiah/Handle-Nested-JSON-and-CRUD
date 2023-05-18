<h1>Nested JSON Handle, Validation and Validated using Spring Boot</h1>

## API Request URL: http://localhost:8088/processorder

## What we can learn from this project
<p> 1) Project Architecture </p>
<p> 2) Handle Nested JSON Data </p>
<p> 3) Validated Nested Data </p>
<p> 4) Save Nested JSON </p>
<p> 5) CRUD on specific JSON object from Nested JSON data </p>
<p> 6) How to use ModelMapper dependencies for map between Entity to DTO </p>
<p> 7) Coding best practice interms of method, class and variable naming<p>

## How to test in Postman
<p> Please click the link and download postmap API resource and test <a href="https://github.com/MohosinMiah/Handle-Nested-JSON-and-CRUD/blob/main/bk_postman_data/Nested%20JSON%20And%20CRUD%20Handling.postman_collection.json" target="_blank"> Postman API Resource </a></p>

<strong> Please create a database and configure it application.properties </strong>
</hr>
Happy Coding ...

## JSON Structure
<code>
{
  "companyName" : "QAAutomation",
  "companyEmailId" : "qaautomation@org.com",
  "companyNumber" : "+353891234121",
  "companyAddress" : "12, HeneryStreet, Dublin, D12PW20",
  "supportedSalaryBanks" : [ "AIB", "BOI", "PSB" ],
  "employee" : [ {
    "firstName" : "Vibha",
    "lastName" : "Singh",
    "age" : 30,
    "salary" : 75000.0,
    "designation" : "Manager",
    "contactNumber" : "+919999988822",
    "emailId" : "abc@test.com"
  }, {
    "firstName" : "Neha",
    "lastName" : "Verms",
    "age" : 35,
    "salary" : 60000.0,
    "designation" : "Lead",
    "contactNumber" : "+914442266221",
    "emailId" : "xyz@test.com"
  }, {
    "firstName" : "Rajesh",
    "lastName" : "Gupta",
    "age" : 20,
    "salary" : 40000.0,
    "designation" : "Intern",
    "contactNumber" : "+919933384422",
    "emailId" : "pqr@test.com"
  } ],
  "contractors" : [ {
    "firstName" : "John",
    "lastName" : "Mathew",
    "contractFrom" : "Jan-2018",
    "contractTo" : "Aug-2022",
    "contactNumber" : "+919631384422"
  }, {
    "firstName" : "Seema",
    "lastName" : "Mathew",
    "contractFrom" : "Jun-2019",
    "contractTo" : "Jun-2023",
    "contactNumber" : "+919688881422"
  } ],
  "companyPFDetails" : {
    "pfName" : "XYZ",
    "pfYear" : 2020,
    "noOfEmployees" : 100
  }
}
</code>
