select iw, min(sun), min(mon), min(tue), min(wed), min(thu), min(fri), min(sat)
 from 
(select dt, --to_char(dt, 'w') w,
         --to_char(dt, 'ww') ww,
         --to_char(dt, 'iw') iw,
         decode(to_char(dt, 'd'), 1, to_char(dt, 'iw') + 1, to_char(dt, 'iw')) iw, 
         to_char(dt, 'd') d,
         decode(to_char(dt, 'd'), 1, dt) sun,
         decode(to_char(dt, 'd'), 2, dt) mon,
         decode(to_char(dt, 'd'), 3, dt) tue,
         decode(to_char(dt, 'd'), 4, dt) wed,
         decode(to_char(dt, 'd'), 5, dt) thu,
         decode(to_char(dt, 'd'), 6, dt) fri,
         decode(to_char(dt, 'd'), 7, dt) sat
         
 from
(select level,
        to_date('201910', 'yyyyMM')-2 + (level-1)  dt--날짜타입 + 정수
 from dual
 connect by level <= add_months(to_date('201910', 'yyyyMM') , 1) - to_date('201910', 'yyyyMM') + 4))
 group by iw
 order by iw;