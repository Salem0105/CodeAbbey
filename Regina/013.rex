/* Regina, rexx solution */
main: 
  WSD()

WSD:
  pull num
  pull data
  call receive 1, data, num
  say result
  exit

receive:procedure
  arg iterat, data, num
  if iterat > num  then return ''
  number = word(data, iterat)
  total = length(number)
  nande = 0
  call SPD total, number
  call receive iterat + 1, data, num
  return nande   || ' ' || result

SPD:procedure expose nande
  arg total, number 
  if total == 0 then return ''
  nande = nande + (substr(number, total, 1) * total)
  call SPD total - 1, number
  return ''