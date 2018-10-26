create table linha (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    quantidade_item BIGINT(20) NOT NULL,
    codigo_fatura BIGINT(20) NOT NULL,
	codigo_item BIGINT(20) NOT NULL,
    FOREIGN KEY (codigo_fatura) REFERENCES fatura(codigo),
    FOREIGN KEY (codigo_item) REFERENCES item(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("1", "tai-0001", "XIANG SHA LIU JUN WAN", 79.90, 77.50);
insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("2", "tai-0002", "GUI FU DI HUANG WAN", 79.90, 77.50);
insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("3", "tai-0003", "SHEN QI WAN", 79.90, 77.50);
insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("4", "tai-0004", "GUI PI WAN", 79.90, 77.50);
insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("5", "tai-0005", "ER CHEN WAN", 79.90, 77.50);
insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("6", "tai-0006", "DU HUO JI SHENG WAN", 79.90, 77.50);
insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("7", "tai-0007", "LIU WEI DI HUANG WAN", 79.90, 77.50);
insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("8", "tai-0008", "NONG SUO DANG GUI WAN", 79.90, 77.50);
insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("9", "tai-0009", "SHI QUAN DA BU WAN", 79.90, 77.50);
insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("10", "tai-0010", "FU ZI LI ZHONG WAN", 79.90, 77.50);
insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("11", "tai-0011", "TIAN WANG BU XIN DAN", 79.90, 77.50);
insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("12", "tai-0012", "JIA WEI XIAO YAO WAN", 79.90, 77.50);
insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("13", "tai-0013", "XIAO YAO WAN", 79.90, 77.50);
insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("14", "tai-0014", "BAI ZI ZI XIN WAN", 79.90, 77.50);
insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("15", "tai-0015", "BU ZHONG YI QI WAN", 79.90, 77.50);
insert into item (codigo, sku, descricao, valor_dinheiro, valor_cartao)  values ("16", "tai-0016", "BA JI YIN YANG WAN", 92.30, 89.50);