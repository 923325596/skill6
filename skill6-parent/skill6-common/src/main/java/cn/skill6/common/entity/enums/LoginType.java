package cn.skill6.common.entity.enums;

/**
 * @Desc 登录方式枚举
 *
 * @Author 何明胜
 *
 * @Created at 2018年5月14日 下午5:06:55
 * 
 * @Version 1.0.0
 */
public enum LoginType implements BaseEnum<Enum<LoginType>, String> {
	/** 使用用户名登录 */
	USERNAME("100", "用户名登录", "/app/v1/login/username"),
	/** 使用有效登录 */
	EMAIL("200", "邮箱登录", "/app/v1/login/email"),
	/** 使用手机号登录 */
	PHONE("300", "手机登录", "/app/v1/login/phone");

	private String stateCode;
	private String description;
	private String uri;

	@Override
	public String getStateCode() {
		return stateCode;
	}

	@Override
	public String getDescrition() {
		return description;
	}

	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @param uri
	 *            the uri to set
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * @param stateCode
	 * @param description
	 */
	private LoginType(String stateCode, String description) {
		this.stateCode = stateCode;
		this.description = description;
	}

	/**
	 * @param stateCode
	 * @param description
	 * @param uri
	 */
	private LoginType(String stateCode, String description, String uri) {
		this.stateCode = stateCode;
		this.description = description;
		this.uri = uri;
	}
}