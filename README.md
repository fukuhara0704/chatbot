## mapperの作成方法

> java -jar ./mybatis-generator-core-1.4.2.jar -configfile ./generatorConfig.xml -overwrite


## テストユーザ

username hoge
password 12345


## HEROKUのMysql情報
CLEARDB_DATABASE_URL: mysql://b32174237975d3:01324992@us-cluster-east-01.k8s.cleardb.net/heroku_b3b82d8e4f1ebfc?reconnect=true
DATABASE_URL:         mysql2://b32174237975d3:01324992@us-cluster-east-01.k8s.cleardb.net/heroku_b3b82d8e4f1ebfc?reconnect=true
DB_HOSTNAME:          us-cluster-east-01.k8s.cleardb.net
DB_NAME:              heroku_b3b82d8e4f1ebfc
DB_PASSWORD:          01324992
DB_PORT:              3306
DB_USERNAME:          b32174237975d3


## Herokuで良く使うコマンド
heroku login
heroku --version
heroku logs --tail
heroku config 
heroku open

git push heroku main