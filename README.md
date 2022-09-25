## Запуск mysql базы данных с помощь образа docker, производится следующей командой:
`docker run -v /mysql_data:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=mysql -p 3306:3306  mysql`

### Имя пользователя по умолчанию:  root
### Пароль мы передали при вводе команды: mysql (MYSQL_ROOT_PASSWORD=mysql )

#### Проверяем методом-обработчиком GET-метода запроса с маппингом на endpoint /products/fetch-product.В query params запроса приходит строковый параметр name, который передается дальше в репозиторий. То есть, метод обрабатывает звапрос типа:  localhost:8080/products/fetch-product?name=yuri. Контроллер должен будет возвращать название продукта, который он получит от репозитория.(для имени "Yuri")

##### Для запуска без миграций с созданием новый базы, меняем параметры в application.properties на:
`spring.sql.init.mode=always`
`spring.liquibase.enabled=false`