"use client"

import { Grafico } from "../components/Grafico"


const tamanho1000_1mi = [
    { funcName: "Divisao", runTimeMs: 330, colisoes: 999000, qttBuscas: 562 },
    { funcName: "Multiplicacao", runTimeMs: 287, colisoes: 999000, qttBuscas: 643 },
    { funcName: "Dobramento", runTimeMs: 229, colisoes: 999000, qttBuscas: 462 },
]

const tamanho1000_5mi = [
    { funcName: "Divisao", runTimeMs: 1703, colisoes: 4999000, qttBuscas: 716 },
    { funcName: "Multiplicacao", runTimeMs: 1918, colisoes: 4999000, qttBuscas: 431 },
    { funcName: "Dobramento", runTimeMs: 1363, colisoes: 4999000, qttBuscas: 759 },

]

const tamanho1000_20mi = [
    { funcName: "Divisao", runTimeMs: 6477, colisoes: 19999000, qttBuscas: 564 },
    { funcName: "Multiplicacao", runTimeMs: 8054, colisoes: 19999000, qttBuscas: 736 },
    { funcName: "Dobramento", runTimeMs: 5912, colisoes: 19999000, qttBuscas: 613 }
]

const tamanho10000_1mi = [
    { funcName: "Divisao", runTimeMs: 2505, colisoes: 990000, qttBuscas: 615 },
    { funcName: "Multiplicacao", runTimeMs: 2230, colisoes: 990000, qttBuscas: 3896 },
    { funcName: "Dobramento", runTimeMs: 2148, colisoes: 990000, qttBuscas: 3092 }
]
const tamanho10000_5mi = [
    { funcName: "Divisao", runTimeMs: 43927, colisoes: 4990000, qttBuscas: 2970 },
    { funcName: "Multiplicacao", runTimeMs: 28699, colisoes: 4990000, qttBuscas: 1449 },
    { funcName: "Dobramento", runTimeMs: 17883, colisoes: 4990000, qttBuscas: 1396 }
]
const tamanho10000_20mi = [
    { funcName: "Divisao", runTimeMs: 122856, colisoes: 19990000, qttBuscas: 3520 },
    { funcName: "Multiplicacao", runTimeMs: 160606, colisoes: 19990000, qttBuscas: 2271 },
    { funcName: "Dobramento", runTimeMs: 89401, colisoes: 19990000, qttBuscas: 3182 }
]

const tamanho100000_1mi = [
    { funcName: "Divisao", runTimeMs: 75368, colisoes: 900001, qttBuscas: 13132 },
    { funcName: "Multiplicacao", runTimeMs: 56118, colisoes: 900001, qttBuscas: 24937 },
    { funcName: "Dobramento", runTimeMs: 39931, colisoes: 900003, qttBuscas: 12677 }
]

const tamanho100000_5mi = [
    { funcName: "Divisao", runTimeMs: 624913, colisoes: 4900000, qttBuscas: 26885 },
    { funcName: "Multiplicacao", runTimeMs: 518919, colisoes: 4900000, qttBuscas: 39765 },
    { funcName: "Dobramento", runTimeMs: 584697, colisoes: 4900000, qttBuscas: 26330 }
]

const tamanho100000_20mi = [
    { funcName: "Divisao", runTimeMs: 2989651, colisoes: 19900000, qttBuscas: 12605 },
    { funcName: "Multiplicacao", runTimeMs: 2560586, colisoes: 19900000, qttBuscas: 18984 },
    { funcName: "Dobramento", runTimeMs: 1835747, colisoes: 19900000, qttBuscas: 30211 }
]





export default function GraficoAnalise() {
    return (

                <div className="flex  gap-8">
                    <Grafico data={tamanho1000_1mi} qttElementos="1" arraySize={1000} />
                    <Grafico data={tamanho1000_5mi} qttElementos="5" arraySize={1000} />
                    <Grafico data={tamanho1000_20mi} qttElementos="20" arraySize={1000} />
                    
                    <Grafico data={tamanho10000_1mi} qttElementos="1" arraySize={10000} />
                    <Grafico data={tamanho10000_5mi} qttElementos="5" arraySize={10000} />
                    <Grafico data={tamanho10000_20mi} qttElementos="20" arraySize={10000} />
                    
                    <Grafico data={tamanho100000_1mi} qttElementos="1" arraySize={100000} />
                     <Grafico data={tamanho100000_5mi} qttElementos="5" arraySize={100000} /> 
                     <Grafico data={tamanho100000_20mi} qttElementos="20" arraySize={100000} /> 
                </div>

    
        
    )
}