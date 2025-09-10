package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class slo implements Serializable {
    private static final long serialVersionUID = 0;
    private final String a;
    private final int b;

    public slo(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private Object readResolve() {
        return new slp(this.a, this.b);
    }
}
