# ktor_starter
"Ktor" Starter Kit with Deploying Heroku.

## Run Locally

```sh
$ ./gradlew app:run
$ curl http://localhost:8080
```

## Deploy Heroku

1. Install Heroku CLI.
    - `$ brew tap heroku/brew && brew install heroku`
1. Login account.
    - `$ heroku login`

```sh
$ heroku git:remote --app APPNAME
$ git push heroku master
```
