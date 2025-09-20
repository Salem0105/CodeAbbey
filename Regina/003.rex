/*https://www.codeabbey.com/index/task_view/sums-in-loop*/

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
    element1 = word(numbers, 1)
    element2 = word(numbers, 2)
    two_elements = VALUE(element1) + VALUE(element2)
    call factorial receive - 1
    return two_elements || ' ' || result