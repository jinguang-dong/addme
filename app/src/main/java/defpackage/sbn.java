package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sbn implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public sbn(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return sbp.k(this.a);
    }
}
