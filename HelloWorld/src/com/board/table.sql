select * from tab;
create table user_login(id varchar2(10), 
                        passwd varchar2(30), 
                        name varchar2(50));
                      
create table boards(board_no number not null, title varchar2(100) not null, 
                    content varchar2(300) not null, writer varchar2(10) not null, creation_date date, orig_no number);
alter table boards add constraint board_pk primary key(board_no);   
alter table user_login add constraint id_pk primary key(id);

insert into user_login('user4', '1234', 'sihyun');
insert into user_login('user2', '1234', 'sahyun');
insert into user_login('user3', '1234', 'sehyun');

 create SEQUENCE employee_seq;