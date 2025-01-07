Esse repositório faz parte dos estudos de paradigmas de programação: 
https://github.com/yudi-azvd/pp.

# Estudos em Sistemas Multi Agentes

Experimentos em concorrência Java, JADE e SMA.

## Dependências

- Java
- Maven

## Executar

```sh
mvn exec:java -Dexec.mainClass=jade.Boot -Dexec.args="-gui -local-host 127.0.0.1 -local-port 1099 jade.Boot;customAgent:pp.Main"
```

## Coisas

### Produtor-Consumidor

- https://en.wikipedia.org/wiki/Producer%E2%80%93consumer_problem
