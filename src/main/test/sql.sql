create schema blog collate utf8_general_ci;

create table t_blog
(
  id bigint(11) auto_increment
    primary key,
  title varchar(200) null,
  content text null,
  firstPicture varchar(100) null,
  flag varchar(2) null,
  views int(9) null,
  appreciation tinyint(1) null,
  share_statement tinyint(1) null,
  commentabled tinyint(1) null,
  published tinyint(1) null,
  recommend tinyint(1) null,
  create_time datetime null,
  update_time datetime null
);

create table t_blog_tag
(
  id bigint(11) auto_increment
    primary key,
  blog_id bigint(11) null,
  tag_id bigint(11) null
);

create table t_comment
(
  id bigint(11) auto_increment
    primary key,
  nickname varchar(50) null,
  email varchar(50) null,
  content varchar(200) null,
  avatar varchar(100) null,
  create_time datetime null,
  pid bigint(11) null
);

create table t_tag
(
  id bigint(11) auto_increment
    primary key,
  name varchar(100) null
);

create table t_test
(
  id bigint(11) auto_increment
    primary key,
  name varchar(50) null
);

create table t_type
(
  id bigint(11) auto_increment
    primary key,
  name varchar(100) null
);

create table t_user
(
  id bigint(11) auto_increment
    primary key,
  nickname varchar(100) null,
  username varchar(50) null,
  password varchar(50) null,
  email varchar(50) null,
  avatar varchar(100) null,
  type int(2) null,
  create_time datetime null,
  update_time datetime null
);

