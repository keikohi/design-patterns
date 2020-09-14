package builder;

public class DashiChaDuke {
	private final String rice;
	private final String dashi;
	private final boolean nori;
	private final boolean senbei;
	private final boolean tsukemono;

	public String getRice() {
		return rice;
	}

	public String getDashi() {
		return dashi;
	}

	public boolean isNori() {
		return nori;
	}

	public boolean isSenbei() {
		return senbei;
	}

	public boolean isTsukemono() {
		return tsukemono;
	}

	private DashiChaDuke(Builder builder) {
		this.rice = builder.rice;
		this.dashi = builder.dashi;
		this.nori = builder.nori;
		this.senbei = builder.senbei;
		this.tsukemono = builder.tsukemono;
	}

	static public Builder builder(String rice, String dashi) {
		return new Builder(rice, dashi);
	}

	static public class Builder {
		/* 必須項目のriceとdashiはNullチェックをする */
		private final String rice;
		private final String dashi;
		/* 必須項目以外は初期値を入れたりNullを入れたりする */
		private boolean nori = false;
		private boolean senbei = false;
		private boolean tsukemono = false;

		private Builder(String rice, String dashi) {
			if (rice == null || dashi == null) {
				throw new IllegalArgumentException("rice and dashi cannot be null.");
			}
			this.rice = rice;
			this.dashi = dashi;
		}

		public Builder nori(boolean nori) {
			this.nori = nori;
			return this;
		}

		public Builder senbei(boolean senbei) {
			this.senbei = senbei;
			return this;
		}

		public Builder tsukemono(boolean tsukemono) {
			this.tsukemono = tsukemono;
			return this;
		}

		public DashiChaDuke build() {
			return new DashiChaDuke(this);
		}

	}

}
