# Implemented semantic checks

## Errors

1. already defined identifier (function, variable or parameter)
2. undefined function, variable or parameter
3. variable or parameter called as a function
4. function used as a value without call
5. array used as a value (only allowed in function arguments or for display statement)
6. wrong number of arguments in a function call
7. type mismatch between function call parameters and arguments
8. mandatory presence of a sure return statement in a returning function
9. type mismatch in different return statements in the same function
10. type mismatch between return statement in a function and the announced return type
11. return statements with value in a void function or in the program body
12. void variable declaration
13. array not passed by reference in a function call
14. wrong type in an arithmetic operation (expecting int or float)
15. wrong type in a comparison (expecting int or float)
16. wrong type or type mismatch in an equality test (expecting two things of the same type, except strings)
17. wrong type in a logical operation (expecting bool)
18. wrong type for array indexing (expecting int)
19. wrong number of index for array indexing
20. atom-typed variable used as an array
21. array with element type void
22. array with empty or invalid range for a dimension
23. wrong type in if and while conditions (expecting bool)
24. affectation type mismatch (lvalue type must be larger than rvalue type)
25. reading a string (not possible to avoid dynamic allocation)
26. writing a void value or writing a more than 1-dimension array
31. uninitialized var usage -- not implemented yet

## Warnings

27. statements after a sure return
28. while true loops
29. return with void function call as value
30. dropped function return value

## Features

+ errors thrown once if possible, thanks to the use of the unknow type and separation of type calculus and semantic error handling

