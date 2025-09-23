main:
  pull first_number
  sum(first_number)

sum:
  arg amount
  call factorial (amount)
  say result
  exit

factorial: procedure
  arg receive
  if receive == 0 then return ''
  pull numbers
  element1 = VALUE(word(numbers, 1))
  element2 = VALUE(word(numbers, 2))
  element3 = VALUE(word(numbers, 3))
  summation = parameters(element1, element2, element3)
  call factorial receive - 1
  return  summation || ' ' || result

parameters: 
  arg i, g, r
  call repeat (r-1)
  return result + i

repeat: procedure expose i g
  arg r
  if r = 0 then return 0
  call repeat r - 1
  return result + (i + (g * r))