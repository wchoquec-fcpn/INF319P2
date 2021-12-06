-- Calculadora Aritmética Con Haskell Aplicando Funciones
-- Para compilar utilizamos  :\funHaskell> ghc -o funcionHaskell .\funcionHaskell.hs
-- Para Ejecucion : \funHaskell> .\funcionHaskell.exe

suma :: Integer -> Integer -> Integer   --declaración de función
suma  x y =  x + y                      --definición de función
resta :: Integer -> Integer -> Integer
resta x y =  x - y                     
multicar :: Integer -> Integer -> Integer  
multicar x y =  x * y   
dividir :: Integer -> Integer -> Integer
dividir x y =  x `div` y                    
main = do 
    putStrLn "Calculadora Aritmetica"
    print(suma 8 2)    --llamada a la función
    print(resta 8 2)   
    print(multicar 8 2)    
    print(dividir 8 2)    

