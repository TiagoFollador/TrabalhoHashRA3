"use client"

import { TrendingUp } from "lucide-react"
import { Bar, BarChart, CartesianGrid, LabelList, XAxis, YAxis } from "recharts"

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

const chartData = [
  { month: "January", desktop: 186, mobile: 80 },
  { month: "February", desktop: 305, mobile: 200 },
  { month: "March", desktop: 237, mobile: 120 },
  { month: "April", desktop: 73, mobile: 190 },
  { month: "May", desktop: 209, mobile: 130 },
  { month: "June", desktop: 214, mobile: 140 },
]

const resultadosData = [
    {funcName: "Divisao" , runTimeMs: 1400, colisoes: 10000},
    {funcName: "Multiplicacao" , runTimeMs: 14000, colisoes: 1000},
    {funcName: "Dobramento" , runTimeMs: 140000, colisoes: 1},
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
    <Card className="h-[50vh] w-[30vw]">
      <CardHeader>
        <CardTitle>Grafico de tempo - {qttElementos} mi Elementos</CardTitle>
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
              content={<ChartTooltipContent hideLabel />}
            />
            <Bar dataKey="runTimeMs" fill="var(--color-desktop)" radius={8}>
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

        {data.map((item, key) => (
            <div>
              {item.funcName}:
                - Numero de colisoes {"->"} {item.colisoes} - Numero de buscas {"->"} {item.qttBuscas}
            </div>
        ))}
      </CardFooter>
    </Card>
  )
}
