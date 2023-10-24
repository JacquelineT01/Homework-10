GET METHOD

| N | Check name                                                       | Status |
|---|------------------------------------------------------------------|--------|
| 1 | Verify that any valid order ID can be retrieved                  |        |
| 2 | Check that the response status code is 200 (OK)                  |        |
| 3 | Verify that the response structure includes all necessary fields |        |
| 4 | Check that invalid ID enter does not permit order retrieval      |        |

POST METHOD

| N | Check name                                                                          | Status |
|---|-------------------------------------------------------------------------------------|--------|
| 1 | Create a new order with valid data                                                  |        |
| 2 | Check if a new order is successfully created                                        |        |
| 3 | Verify that the response for the newly created order is 200                         |        |
| 4 | Create new order with missing or incomplete data                                    |        |
| 5 | Verify that invalid requests result in appropriate error response (400 Bad Request) |        |
| 6 | Verify if duplicate orders can be created                                           |        |

