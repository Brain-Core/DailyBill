
create database db_DailyBill

go
use db_DailyBill

---------- Creation des Tables

create table t_user
(
	u_name varchar(100) not null,
	u_pass varchar(25) not null,
	u_accreditation varchar(50) not null,
	constraint pf_user primary key(u_name)
)

create table t_journalier
(
	id int not null,
	nom varchar(50) not null,
	postnom varchar(50) not null,
	prenom varchar(50) not null,
	lieu_naissance text,
	date_naissance date,
	etat_civil varchar(100),
	piece_identite char(255),
	numero_piece_identite varchar(50),
	constraint pk_jpurnalier primary key(id)
)

create table t_service
(
	id int not null,
	serviceItem varchar(100) not null,
	descriptionItem text,
	constraint pk_service primary key(id)
)

create table t_salaire
(
	id int not null,
	salaireItem varchar(255) not null,
	descriptionItem text,
	montant float not null,
	id_service int not null,
	constraint pk_salaire primary key(id)
)

create table t_prestation
(
	id varchar(50) not null,
	id_journalier int not null,
	id_service int not null,
	date_prestation date,
	heure_debut text,
	heure_fin text
	constraint pk_prestation primary key(id)

)

create table t_paiement
(
	id int not null identity(1,1),
	id_journalier int not null,
	id_prestation varchar(50) not null,
	date_paiement date,
	montant float not null,
	u_name varchar(100) not null,
	constraint pk_paiement primary key(id)
)


---------- Autres contraintes

alter table t_journalier add constraint Unique_Name unique(nom, postnom, prenom,numero_piece_identite)
alter table t_service add constraint Unique_Service unique(serviceItem)
alter table t_salaire add constraint Unique_Salaire unique(salaireItem)

alter table t_prestation add constraint fk_journalier_prestation foreign key (id_journalier) references t_journalier(id) on delete no action
alter table t_prestation add constraint fk_service_prestation foreign key (id_service) references t_service(id) on delete no action

alter table t_paiement add constraint fk_journalier_paiement foreign key (id_journalier) references t_journalier(id) on delete no action
alter table t_paiement add constraint fk_prestation_paiement foreign key (id_prestation) references t_prestation(id) on delete no action
alter table t_paiement add constraint fk_user_paiement foreign key (u_name) references t_user(u_name) on delete no action

--------- Procedures Stockées

go
create procedure sp_update_user
(
	@u_name varchar(100),
	@u_pass varchar(25),
	@u_accreditation varchar(50)
)
as
begin
	if not exists(select * from t_user where u_name = @u_name)
		insert into t_user values(@u_name, @u_pass, @u_accreditation)
	else
		update t_user set u_pass = @u_pass, u_accreditation = @u_accreditation where u_name = @u_name
end

go
create procedure sp_update_journalier
(
	@id int,
	@nom varchar(50),
	@postnom varchar(50),
	@prenom varchar(50),
	@lieu_naissance text,
	@date_naissance date,
	@etat_civil varchar(100),
	@piece_identite char(255),
	@numero_piece_identite varchar(50)
)
as
begin
	if not exists(select * from t_journalier where id = @id)
		insert into t_journalier values(@id, @nom, @postnom, @prenom, @lieu_naissance, @date_naissance, @etat_civil, @piece_identite, @numero_piece_identite)
	else
		update t_journalier set nom = @nom, postnom = @postnom, prenom = @prenom, lieu_naissance = @lieu_naissance, date_naissance = @date_naissance, etat_civil = @etat_civil, piece_identite = @piece_identite, numero_piece_identite = @numero_piece_identite where id = @id
end


go
create procedure sp_update_service
(
	@id int,
	@serviceItem varchar(100),
	@descriptionItem text
)
as
begin
	if not exists(select * from t_service where id = @id)
		insert into t_service values(@id, @serviceItem, @descriptionItem)
	else
		update t_service set serviceItem = @serviceItem, descriptionItem = @descriptionItem where id = @id
end


go
create procedure sp_update_prestation
(
	@id varchar(50),
	@journalier int,
	@service int,
	@date_prestation date,
	@heure_debut text,
	@heure_fin text
)
as
begin
	declare @id_journalier int = (select id from t_journalier where concat(nom,' ',postnom,' ',prenom) = @journalier)
	declare @id_service int = (select id from t_service where serviceItem = @service)
	if not exists(select * from t_prestation where id = @id)
		insert into t_prestation values(@id, @id_journalier, @id_service, @date_prestation, @heure_debut, @heure_fin)
	else
		update t_prestation set id_journalier = @id_journalier, id_service = @id_service, date_prestation = @date_prestation, heure_debut = @heure_debut, heure_fin = @heure_fin where id = @id
end


go
create procedure sp_update_salaire
(
	@id int,
	@salaireItem varchar(255),
	@descriptionItem text,
	@montant float,
	@service varchar(100)
)
as
begin
	declare @id_service int = (select id from t_salaire where id = @id)
	if not exists(select * from t_salaire where id = @id)
		insert into t_salaire values(@id, @salaireItem, @descriptionItem, @montant, @id_service)
	else
		update t_salaire set salaireItem = @salaireItem, descriptionItem = @descriptionItem, montant = @montant, id_service = @id_service where id = @id
end


go
create procedure sp_update_paiement
(
	@journalier int,
	@id_prestation varchar(50),
	@date_paiement date,
	@montant float,
	@u_name varchar(100)
)
as
begin
	declare @id_journalier int = (select id from t_journalier where concat(nom,' ',postnom,' ',prenom) = @journalier)
		insert into t_paiement values(@id_journalier, @id_prestation, @date_paiement, @montant, @u_name)
end