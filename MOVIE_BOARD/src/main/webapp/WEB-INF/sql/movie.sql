create table movie(
    
    movie_no    number          primary key
    ,member_id   varchar2(30)   not null
    ,movie_title    varchar2(100)   not null
    ,movie_context  varchar2(300)  not null
    ,movie_hits     number          default 0
    ,movie_indate   date        default sysdate
       );
       