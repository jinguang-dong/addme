package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class say implements Serializable {
    private static final long serialVersionUID = 0;
    final sbe a;

    public say(sbe sbeVar) {
        this.a = sbeVar;
    }

    Object readResolve() {
        return this.a.v();
    }
}
