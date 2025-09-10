package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sah extends sad implements sed {
    protected sah() {
    }

    @Override // defpackage.sad
    protected /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    @Override // defpackage.sed
    public int d(Object obj, int i) {
        return o().d(obj, Integer.MAX_VALUE);
    }

    @Override // java.util.Collection, defpackage.sed
    public final boolean equals(Object obj) {
        return obj == this || o().equals(obj);
    }

    public Set f() {
        throw null;
    }

    @Override // defpackage.sed
    public final int fw(Object obj) {
        return o().fw(obj);
    }

    public Set g() {
        throw null;
    }

    @Override // defpackage.sed
    public void h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection, defpackage.sed
    public final int hashCode() {
        return o().hashCode();
    }

    @Override // defpackage.sed
    public boolean i(Object obj, int i) {
        return o().i(obj, i);
    }

    protected abstract sed o();
}
