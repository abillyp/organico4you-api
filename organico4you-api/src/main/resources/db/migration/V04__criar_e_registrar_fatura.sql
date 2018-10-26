create table fatura (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    data_compra DATE NOT NULL,
    valor_entrega DECIMAL(10,2) NOT NULL,
    valor_total DECIMAL(10,2) NOT NULL,
    forma_pagamento VARCHAR(20) NOT NULL,
    codigo_cliente BIGINT(20) NOT NULL,
    FOREIGN KEY (codigo_cliente) REFERENCES cliente(codigo),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("1", "tai-0001", "XIANG SHA LIU JUN WAN", 79.90, 77.50);
