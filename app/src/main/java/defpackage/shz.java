package defpackage;

import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum shz {
    STRING('s', sib.GENERAL, "-#", true),
    BOOLEAN('b', sib.BOOLEAN, "-", true),
    CHAR('c', sib.CHARACTER, "-", true),
    DECIMAL('d', sib.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', sib.INTEGRAL, "-#0(", false),
    HEX('x', sib.INTEGRAL, "-#0(", true),
    FLOAT('f', sib.FLOAT, VnmwoBe.DzrW, false),
    EXPONENT('e', sib.FLOAT, "-#0+ (", true),
    GENERAL('g', sib.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', sib.FLOAT, "-#0+ ", true);

    public static final shz[] k = new shz[26];
    public final char l;
    public final sib m;
    public final int n;
    public final String o;

    shz(char c, sib sibVar, String str, boolean z) {
        this.l = c;
        this.m = sibVar;
        sia siaVar = sia.a;
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int iA = sia.a(str.charAt(i2));
            if (iA < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
            i |= 1 << iA;
        }
        this.n = i;
        this.o = "%" + c;
    }

    public static int a(char c) {
        return (c | ' ') - 97;
    }

    static {
        for (shz shzVar : values()) {
            k[a(shzVar.l)] = shzVar;
        }
    }
}
