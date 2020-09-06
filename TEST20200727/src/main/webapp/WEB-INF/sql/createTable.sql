create table member_tb2(
    member_id       varchar2(30)        primary key
    ,member_pw      varchar2(30)        not null
    ,member_nm      varchar2(30)        not null
    ,member_birth   varchar2(30)         not null
    ,member_indate   date               DEFAULT sysdate);