/*
https://www.codeabbey.com/index/task_view/sum-of-two
*/

main:
  sum()

sum:
  pull x
  nums = words(x)
  call factorial nums
  say result
  exit
  factorial: procedure expose x
    arg n
    if n = 0 then return 0
    element = word(x,n)
    call factorial n - 1
    return result + element