"use client"

import { Grafico } from "../components/Grafico"


const tamanho1000_1mi = [
    { funcName: "Divisao", runTimeMs: 248, colisoes: 999000, qttBuscas: 1069 },
]

const tamanho1000_5mi = [
    { funcName: "Divisao", runTimeMs: 1653, colisoes: 4999000, qttBuscas: 1994 },
]

const tamanho1000_20mi = [
    { funcName: "Divisao", runTimeMs: 6652, colisoes: 19999000, qttBuscas: 1231 },
]

const tamanho10000_1mi = [
    { funcName: "Divisao", runTimeMs: 2492, colisoes: 990000, qttBuscas: 125 }
]
const tamanho10000_5mi = [
    { funcName: "Divisao", runTimeMs: 21493, colisoes: 4990000, qttBuscas: 5552 }
]
const tamanho10000_20mi = [
    { funcName: "Divisao", runTimeMs: 340563, colisoes: 19990000, qttBuscas: 9380 }
]

const tamanho100000_1mi = [
    { funcName: "Divisao", runTimeMs: 49077, colisoes: 900001, qttBuscas: 15770 }
]

const tamanho100000_5mi = [

]

const tamanho100000_20mi = [

]





export default function GraficoAnalise() {
    return (

                <div className="flex  gap-8">
                    <Grafico data={tamanho1000_1mi} qttElementos="1mi" arraySize={1000} />
                    <Grafico data={tamanho1000_5mi} qttElementos="5mi" arraySize={1000} />
                    <Grafico data={tamanho1000_20mi} qttElementos="20mi" arraySize={1000} />
                    
                    <Grafico data={tamanho10000_1mi} qttElementos="1mi" arraySize={10000} />
                    <Grafico data={tamanho10000_5mi} qttElementos="5mi" arraySize={10000} />
                    <Grafico data={tamanho10000_20mi} qttElementos="20mi" arraySize={10000} />
                    
                    <Grafico data={tamanho100000_1mi} qttElementos="1mi" arraySize={100000} />
                    {/* <Grafico data={tamanho100000_5mi} qttElementos="5mi" arraySize={100000} /> */}
                    {/* <Grafico data={tamanho100000_20mi} qttElementos="20mi" arraySize={100000} /> */}
                </div>

    
        
    )
}