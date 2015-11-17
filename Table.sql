-- CRIANDO TABELAS
CREATE TABLE Bairro (
	id serial,
	nome text,
	coordenadas Polygon
);
ALTER TABLE Bairro ADD PRIMARY KEY (id);

CREATE TABLE Tipo_ocorrencia (
	id serial,
	tipo_ocorrencia text
);
ALTER TABLE Tipo_ocorrencia ADD PRIMARY KEY (id);

CREATE TABLE Ocorrencias (
	id serial,
	descricao text,
	coordenada Point,
	tipo_ocorrencia integer
);
ALTER TABLE Ocorrencias ADD PRIMARY KEY (id);
ALTER TABLE Ocorrencias ADD FOREIGN KEY (tipo_ocorrencia) REFERENCES Tipo_ocorrencia (id);


-- 
