//tipagem implicita

let username = 'shaolin_matador_de_porco'
username = 'flavioDoPneu'

//tipagem explicita

const pi: number = 3.14
let logado: boolean = true

//union types
let rg: number | string = 232323233
rg = '42983284'

let generico : any //guarda qualquer tipo de variável
generico = "nome"
generico = 6.89

const listaDeNomes: string[] = ['João', 'Dani']

const valores: Array<string | number> = ['dani', 28]
const array: any[] = ['dani', 28]
