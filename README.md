
# Backend em Java com Spring Boot e H2 – Entrega 2

## Objetivo

Construir um serviço REST que persista leituras de sensores em banco H2 (modo arquivo) e forneça endpoints consumidos por um aplicativo frontend.

---

## Como compilar e executar

```bash
mvn spring-boot:run
```

O servidor ficará disponível em:
```
http://localhost:8080
```

---

## Localização do arquivo H2

Após rodar o projeto, o banco será criado em:

```
./data/readings.mv.db
```

Acesse o console H2 para visualizar o conteúdo:

```
http://localhost:8080/h2-console
```

**Parâmetros do console:**
- JDBC URL: `jdbc:h2:file:./data/readings`
- Username: `sa`
- Password: *(em branco)*

---

## Endpoints disponíveis

### Criar nova leitura

`POST /api/readings`

```bash
curl -X POST "http://localhost:8080/api/readings" -H "Content-Type: application/json" -d "{\"sensorId\":\"sensor-123\", \"sensorValue\":45.5}"
```

---

### Listar todas as leituras

`GET /api/readings`

```bash
curl http://localhost:8080/api/readings
```

---

### Filtrar por sensorId

`GET /api/readings/{sensorId}`

```bash
curl http://localhost:8080/api/readings/sensor-123
```

---

## Integração com o Frontend

- Base da API no app: `http://localhost:8080/api`
- Para salvar leitura: `POST /api/readings`
- Para carregar lista: `GET /api/readings`

---

## Integrantes

- Arthur Colombo Cordeiro RM 551262
- João Felipe Ballet RM 550979
- Vitor Eduardo Moura RM 98450
- Vitor Guido Kallas RM 551067
