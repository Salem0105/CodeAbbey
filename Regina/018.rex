/*regina -c salem0105.rx*/

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
  root = parameters(element1, element2)
  call factorial receive - 1
  return  root || ' ' || result

parameters: 
  arg x, n
  r = 1
  call repeat r n x
  return result

repeat: 
  arg r n x
  rNew = (r + x / r) / 2
  if n > 1 then 
    return repeat(rNew n - 1 x)
  else if n == 1 then
    return Value(rNew)
  else do
    return 1
  end