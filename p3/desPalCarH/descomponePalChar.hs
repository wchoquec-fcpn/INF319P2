-- 3. Dada una frase cualquiera descomponer la misma en palabras 
-- y otra en letras, utilizar funciones en haskell 
-- Para compilar utilizamos:desPalCarH> ghc -o descomponePalChar .\descomponePalChar.hs
-- Para Ejecucion : \desPalCarH> .\descomponePalChar.exe    

import qualified Data.Text as T
import Control.Monad      

cadena1 :: String
cadena1 ="descomponer palabras y letras"

tam ::  String-> Int
tam cadena1=length cadena1

tamaño :: String
tamaño = "Tamaño de la Cadena: " ++ show (tam cadena1)


descomponePalabra :: [T.Text]
descomponePalabra = T.splitOn (T.pack " ") (T.pack cadena1)

descomponeCaracter = forM_ [0..(tam cadena1-1)] $ \n ->    -- for each number [0 to tam-1]
              putStrLn $ "Char:" ++ show (cadena1 !!n) -- print the numbe 

main :: IO ()  -- main does IO
main = do 
  putStrLn $ tamaño   
  print $ descomponePalabra 
  descomponeCaracter
  
