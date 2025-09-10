package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class scm implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public scm(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return scn.G(this.a);
    }
}
