package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class os extends oz {
    public final HashMap a = new HashMap();

    @Override // defpackage.oz
    public final ov a(Object obj) {
        return (ov) this.a.get(obj);
    }

    @Override // defpackage.oz
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.a.remove(obj);
        return objB;
    }

    public final boolean c(Object obj) {
        return this.a.containsKey(obj);
    }
}
