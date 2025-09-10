package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sld implements slj {
    public final sli a(byte[] bArr) {
        return d(bArr, bArr.length);
    }

    @Override // defpackage.slj
    public sli b(CharSequence charSequence, Charset charset) {
        throw null;
    }

    public final slk c(int i) {
        rnt.D(i >= 0, "expectedInputSize must be >= 0 but was %s", i);
        return e();
    }

    public sli d(byte[] bArr, int i) {
        rnt.K(0, i, bArr.length);
        slk slkVarC = c(i);
        slkVarC.d(bArr, i);
        return slkVarC.m();
    }
}
