package dio.web.api.handler;
//RunTimeException,que servirá como base para todas as outras exceções de negócio.

public class BusinessException extends RuntimeException {
	public BusinessException(String mensagem) {
		super(mensagem);
	}

	public BusinessException(String mensagem, Object... params) {
		super(String.format(mensagem, params));
	}
}
