$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Features/login.feature");
formatter.feature({
  "name": "feature to test login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "When "
});
formatter.step({
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "test",
        "12345"
      ]
    },
    {
      "cells": [
        "joa",
        "12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDefinitions.LoginSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters test and 12345",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.LoginSteps.user_enters_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.SearchContext.findElement(org.openqa.selenium.By)\" because \"this.searchContext\" is null\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\n\tat jdk.proxy2/jdk.proxy2.$Proxy18.sendKeys(Unknown Source)\n\tat PageFactory.LoginPage_PF.enterUsername(LoginPage_PF.java:29)\n\tat StepsDefinitions.LoginSteps.user_enters_username_and_password(LoginSteps.java:33)\n\tat ✽.user enters test and 12345(file:///Users/arthur/IdeaProjects/TestingFrameworkJava/src/test/Features/login.feature:10)\n",
  "status": "failed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepsDefinitions.LoginSteps.clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefinitions.LoginSteps.user_is_navigated_to_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDefinitions.LoginSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters joa and 12345",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitions.LoginSteps.user_enters_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.SearchContext.findElement(org.openqa.selenium.By)\" because \"this.searchContext\" is null\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\n\tat jdk.proxy2/jdk.proxy2.$Proxy18.sendKeys(Unknown Source)\n\tat PageFactory.LoginPage_PF.enterUsername(LoginPage_PF.java:29)\n\tat StepsDefinitions.LoginSteps.user_enters_username_and_password(LoginSteps.java:33)\n\tat ✽.user enters joa and 12345(file:///Users/arthur/IdeaProjects/TestingFrameworkJava/src/test/Features/login.feature:10)\n",
  "status": "failed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepsDefinitions.LoginSteps.clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefinitions.LoginSteps.user_is_navigated_to_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
});