/*https://www.codeabbey.com/index/task_view/sum-in-loop*/

main:
  pull first_number
  sum()

sum:
  pull chain
  amount = words(chain)
  call factorial amount
  say result
  exit
  factorial: procedure expose chain
    arg receive
    if receive = 0 then return 0
    each_element = word(chain,receive)
    call factorial receive - 1
    return result + each_element