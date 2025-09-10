package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sby implements Serializable {
    private static final long serialVersionUID = 0;
    final sbv a;

    public sby(sbv sbvVar) {
        this.a = sbvVar;
    }

    Object readResolve() {
        return this.a.keySet();
    }
}
