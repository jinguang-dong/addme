package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hgx extends RuntimeException {
    public final List a;
    public final pbw b;

    public hgx(String str, pbw pbwVar, pka... pkaVarArr) {
        super(str);
        this.a = Arrays.asList(pkaVarArr);
        this.b = pbwVar;
    }
}
