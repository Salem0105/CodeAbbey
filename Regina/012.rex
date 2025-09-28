main: 
  mode_time()

mode_time:
  pull num
  call receive num
  say result
  exit

receive:procedure
  arg num
  if num == 0 then return ''
  pull data
  d = VALUE(word(data, 1))
  h = VALUE(word(data, 2))
  m = VALUE(word(data, 3))
  s = VALUE(word(data, 4))
  d2 = VALUE(word(data, 5))
  h2 = VALUE(word(data, 6))
  m2 = VALUE(word(data, 7))
  s2 = VALUE(word(data, 8))
  nande = time_difference(d, h, m, s, d2, h2, m2, s2)
  call receive num - 1
  return nande   || ' ' || result

time_difference:
  arg d, h, m, s, d2, h2, m2, s2
  seconds1 = s + (m * 60) + (h * 3600) + (d * 86400)
  seconds2 = s2 + (m2 * 60) + (h2 * 3600) + (d2 * 86400)
  time_diff = seconds1 - seconds2
  if time_diff < 0 then 
    time_diff = time_diff * (-1)
  
  return thread(time_diff)

thread:
  arg seconds
  day = seconds % 86400
  hour = (seconds // 86400) % 3600
  minute = (seconds // 3600) % 60
  sec = seconds // 60
  return '('day' 'hour' 'minute' 'sec')'