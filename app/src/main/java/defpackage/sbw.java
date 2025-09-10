package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sbw implements Serializable {
    private static final long serialVersionUID = 0;
    final sbv a;

    public sbw(sbv sbvVar) {
        this.a = sbvVar;
    }

    Object readResolve() {
        return this.a.entrySet();
    }
}
