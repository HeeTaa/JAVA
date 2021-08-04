package kh.com.cld.e01_notation;

public class Notation {
	
	int _default; // ~
	public int _public; // +
	private int _private; // -
	protected int _protected; // #
	static int _static; // 关临
	
	public Notation() {}; //积己磊
	
	public Notation(int _default, int _public, int _private, int _protected) {
		super();
		this._default = _default;
		this._public = _public;
		this._private = _private;
		this._protected = _protected;
	}
	
	private void _privateF() {}; // - 
	void _defaultF() {}; // ~
	protected void _protectedF() {}; // #
	public void _publicF() {}; // +
	public static void _staticF() {}; // + 关临
	
}
