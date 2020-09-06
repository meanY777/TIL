create table board_tb(
    boardNum     number          primary key
    ,title       varchar2(1000)  not null
    ,writer        varchar2(300) not null
    ,content      varchar2(3000)    
    ,indate     date        default sysdate
    );
    
create SEQUENCE board_tb_seq nocache;

create table reply_table(
	replyNum	number	primary key
	,boardNum	number references board_table
	,writer	varchar2(300)	not null
	,content	varchar2(3000)
	,indate	date 	default sysdate
)