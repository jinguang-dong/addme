package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bet extends ufi implements Collection, j$.util.Collection, ukd {
    private final bem a;

    public bet(bem bemVar) {
        this.a = bemVar;
    }

    @Override // defpackage.ufi
    public final int a() {
        return this.a.b();
    }

    @Override // defpackage.ufi, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        bew[] bewVarArr = new bew[8];
        for (int i = 0; i < 8; i++) {
            bewVarArr[i] = new bfa();
        }
        return new ben(this.a.b, bewVarArr);
    }
}
