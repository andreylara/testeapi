- Utilizado postmam
- Cadastro de cliente, fornecedor, produto, pedido:
{
	"name": "Cliente",
	"phone": 98765432,
	"email": "cliente@hotmail.com"
} 
{
	"name": "Fornecedor"
} 
{
	"name": "Produto1",
	"description": "Produto1 cor preta tamanho 10",
	"barCode": 456321987159,
	"manufacturer": {
		"id": 1,
		"name": "Fornecedor"
	},
	"unitPrice": 45.50,
} 
{
	"name": "Produto2",
	"description": "Produto2 cor laranja tamanho 25",
	"barCode": 456321987159,
	"manufacturer": {
		"id": 1,
		"name": "Fornecedor"
	},
	"unitPrice": 104.50,
} 
{
	"status": "Pendente",
	"consumer": {
		"id" : 1
	},
	"product": [
		{"id" : 1 },
		{"id" : 2}
	],
	"payment": {
		"mode": "Crédito",
		"amount": 150.00,
		"installments": 3,
		"installmentValue": 50.00
	},
	"Delivery": "entrega",
} 
--------------------------------------------------------------
- Listando todos clientes, fornecedores, produtos e pedidos:
http://localhost:8080/apiteste/consumer
http://localhost:8080/apiteste/manufacturer
http://localhost:8080/apiteste/product
http://localhost:8080/apiteste/request
--------------------------------------------------------------
- Listando apenas um registro pelo id do cliente, fornecedor, produto e pedido:
http://localhost:8080/apiteste/consumer/1
http://localhost:8080/apiteste/manufacturer/1
http://localhost:8080/apiteste/product/1
http://localhost:8080/apiteste/request/1
--------------------------------------------------------------
- Deletando registros de cliente, fornecedor, produto e pedido:
{
	"id": 1
	"name": "Cliente",
	"phone": 98765432,
	"email": "cliente@hotmail.com"
} 
{
	"id": 1
	"name": "Fornecedor"
} 
{
	"id": 1
	"name": "Produto",
	"description": "Produto cor preta tamanho 10",
	"barCode": 456321987159,
	"manufacturer": "Fornecedor",
	"unitPrice": 25.50,
} 
