package com.example.curso.entidades.enums;

public enum PedidoStatus {

	AGUARDANDO_PAGAMENTO(1),
	ENVIADO(2),
	PAGO(3),
	ENTREGUE(4),
	CANCELADO(5);
	
	private int codigo;
	
	private PedidoStatus(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public static PedidoStatus valueOf(int codigo) {
		for(PedidoStatus value : PedidoStatus.values()) {
			if(value.getCodigo() == codigo) {
				return value;
			}
		}
		throw new IllegalArgumentException("Codigo status pedido Invalido");
	}
}
