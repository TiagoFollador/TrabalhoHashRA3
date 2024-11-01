"use client"

import { Bar, BarChart, CartesianGrid, LabelList, XAxis } from "recharts"

import {
  Card,
  CardContent,
  CardDescription,
  CardFooter,
  CardHeader,
  CardTitle,
} from "@/components/ui/card"
import {
  ChartConfig,
  ChartContainer,
  ChartTooltip,
  ChartTooltipContent,
} from "@/components/ui/chart"

export const description = "A bar chart with a custom label"

interface resultados {
    funcName: string
    runTimeMs: number
    colisoes: number
    qttBuscas: number
}

interface graficoProps {
    data?: Array<resultados>
    qttElementos: string
    arraySize: number
}


const resultadosData = [
    { funcName: "Divisao", runTimeMs: 340563, colisoes: 19990000, qttBuscas: 9380 },
    { funcName: "Divisao", runTimeMs: 340563, colisoes: 19990000, qttBuscas: 9380 },
    { funcName: "Divisao", runTimeMs: 340563, colisoes: 19990000, qttBuscas: 9380 },
]


const chartConfig = {
  desktop: {
    label: "Desktop",
    color: "hsl(var(--chart-1))",
  },
  mobile: {
    label: "Mobile",
    color: "hsl(var(--chart-2))",
  },
  label: {
    color: "hsl(var(--background))",
  },
} satisfies ChartConfig

export function Grafico({data = resultadosData, qttElementos, arraySize, }: graficoProps) {
  return (
    <Card className="h-[60vh] w-[35vw]">
      <CardHeader>
        <CardTitle>Grafico de tempo (Ms) - {qttElementos} mi Elementos</CardTitle>
        <CardDescription> Tamanho do array: {arraySize} </CardDescription>
      </CardHeader>
      <CardContent>
        <ChartContainer config={chartConfig}>
          <BarChart
            accessibilityLayer
            data={data}
            margin={{
              top: 20,
            }}
          >
            <CartesianGrid vertical={false} />
            <XAxis
              dataKey="funcName"
              tickLine={false}
              tickMargin={10}
              axisLine={false}
              tickFormatter={(value) => value.slice(0, 3)}
            />
            <ChartTooltip
              cursor={false}
              content={<ChartTooltipContent indicator="line" />}
            />
            <Bar dataKey="runTimeMs" fill = "green" radius={8}>
              <LabelList
                position="top"
                offset={12}
                className="fill-foreground"
                fontSize={12}
              />
            </Bar>
          </BarChart>
        </ChartContainer>
      </CardContent>
      <CardFooter className="flex-col items-start gap-2 text-sm">

        {data.map((item) => (
            <div>
              {item.funcName}:
                - Numero de colisoes {"->"} {item.colisoes} - Numero medio de buscas {"->"} {item.qttBuscas}
            </div>
        ))}
      </CardFooter>
    </Card>
  )
}
