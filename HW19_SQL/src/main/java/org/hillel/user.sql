create table users(
id int primary key,
name text,
login text,
password text,
role int,
foreign key(role) references roles(id)
);

insert into users (name, login, password, role) values
  ('Alexandr Alexandrov', 'alex', 'asd123', 1),
  ('Ivan Ivanov', 'vanya', '123456', 2),
  ('Pavel Pavlov', 'pasha', '1q2w3e', 3),
  ('Tsarenko Eugene', 'jeka', 'qwerty2', 3),
  ('Gaiduk Irina', 'sister', 'bebe12', 2),
  ('Bolokan Oksana', 'friend', 'abdqwe123',1),
  ('Vitya Pahom', 'bro', 'qkokok',1);

create table groups
(
  id integer primary key,
  name text,
  description text
);

insert into groups (name, description) values
('inters', 'potential workers'),
('workers', 'only company workers'),
('managers', 'managers only'),
('contractors', 'part time workers'),
('guests', 'potential clients'),
('clients', 'company clients');

create table roles
(
  id integer primary key,
  name text,
  description text
);

insert into roles (name, description) values
  ('visitor', 'readonly user'),
  ('user','Can create data, update and delete own data'),
  ('content_manage', 'can create, update, and delete any data'),
  ('administrator', 'full data access, can create users');

create table GroupUser(
    user_id int not null,
    group_id int not null,
    primary key (user_id, group_id),
    foreign (user_id) references users(id),
    foreign (group_id) references groups(id)
);

insert into GroupUser(user_id, group_id) values
(2,2);
(1,5);
(5,6);
(2,8);
(4,2);
(2,3);
(9,1);
(8,3);
(7,2);
(2,5);
(3,6);
(7,8);
(5,9);
