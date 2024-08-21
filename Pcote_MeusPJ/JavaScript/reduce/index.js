let pedidos = [
    { id: 420, nome: 'Duna', alimento: 'Sandubão de bacon', bebida: 'Suco Limão', preco : '100'},
    { id: 152, nome: 'Nadoq', alimento: 'Sandubão Vegano', bebida: 'Suco Laranja', preco : '59'},
    { id: 29, nome: 'Marcio', alimento: 'Coxinha', bebida: 'Suco Uva', preco : '33'},
    { id: 33, nome: 'Isabel', alimento: 'Sandubão de Picanha', bebida: 'Refrigerante', preco : '79'},
    { id: 55, nome: 'José', alimento: 'Pizza', bebida: 'Refrigerante', preco : '47'}
];

let pedido = pedidos.reduce((total, pedido) => {
    let { preco } = pedido;
    return total + preco;
}, 0);

console.log(pedido);