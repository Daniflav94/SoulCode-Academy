let pessoa = {
    nome: 'João',
    idade: 20,
    altura: 1.8,
    cpf: "000.000.000-00",
    solteiro: false,
    habilidades: ['Java', 'Angular', 'TypeScript', 'JavaScript', 'Node.js', 'Spring Boot'],
    endereco: {
        rua: 'Rua Feliz',
        numero: 123,
        estado: 'CE',
        complemento: 'Sem complemento',
        cep: '123000-000'
    }

}

let pessoa2 = {
    nome: 'João',
    idade: 20,
    altura: 1.8,
    cpf: "000.000.000-00",
    solteiro: false,
    habilidades: ['Java', 'Angular', 'TypeScript', 'JavaScript', 'Node.js', 'Spring Boot'],
    endereco: {
        rua: 'Rua Feliz',
        numero: 123,
        estado: 'CE',
        complemento: 'Sem complemento',
        cep: '123000-000'
    },
    rg: '429802809'
}

interface Endereco {
    rua: string
    numero: number
    estado: string
    complemento: string
    cep: string
}

interface Pessoa {
    nome: string
    idade: number
    altura: number
    cpf: string
    solteiro: boolean
    habilidades: string[]
    endereco: Endereco
    
}