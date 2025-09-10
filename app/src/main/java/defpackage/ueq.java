package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ueq implements Serializable, ues {
    private final Object a;

    public ueq(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ues
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.ues
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
