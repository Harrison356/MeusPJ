let pedidos = [
    { id: 420, nome: 'Duna', alimento: 'Sandubão de bacon', bebida: 'Suco Limão'},
    { id: 152, nome: 'Nadoq', alimento: 'Sandubão Vegano', bebida: 'Suco Laranja'},
    { id: 29, nome: 'Marcio', alimento: 'Coxinha', bebida: 'Suco Uva'},
    { id: 33, nome: 'Isabel', alimento: 'Sandubão de Picanha', bebida: 'Refrigerante'},
    { id: 55, nome: 'José', alimento: 'Pizza', bebida: 'Refrigerante'}
];

let pedido = pedidos.every ( pedido => {
    let { bebida } = pedido;
    return bebida == 'Refrigerante';
});

console.log(pedido);