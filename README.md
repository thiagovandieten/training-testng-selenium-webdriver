# WebDriver TestNG Project

This project is generated from an archetype. It exists out of TestNG, Selenium WebDriver, WebDriver Manager, Allure and
OWNER as the main dependendies.

The following browsers can be used:
`CHROME`, `FIREFOX`, `EDGE`, `OPERA`, `INTERNET_EXPLORER` and `CHROME_HEADLESS`

## Run tests

The following Maven profiles can be used:

### Prestashop

`mvn clean test -P prestashop-exercises`

`mvn clean test -P prestashop-answers`

By default, Chrome will be used. To override the default browser, you can use the following command (and choose one of
the supporting browsers):

`mvn clean test -P prestashop-exercises -DseleniumBrowser=firefox`

### Parabank

`mvn clean test -P parabank-exercises`

`mvn clean test -P parabank-answers`

By default, Chrome will be used. To override the default browser, you can use the following command (and choose one of
the supporting browsers):

`mvn clean test -P parabank-exercises -DseleniumBrowser=firefox`

### Prestashop (using docker)

`mvn clean test -P prestashop-exercises-docker`

`mvn clean test -P prestashop-answers-docker`

By default, Chrome will be used.

### Parabank (using docker)

`mvn clean test -P parabank-exercises-docker`

`mvn clean test -P parabank-answers-docker`

By default, Chrome will be used.

## Generate report

`mvn allure:report`

`mvn allure:serve`

## Check for dependecy updates

`mvn versions:display-dependency-updates`

## Update to latest release version

`versions:update-properties`