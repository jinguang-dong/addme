package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ohg {
    public Object d;
    public boolean e = false;
    final /* synthetic */ ohm f;

    public ohg(ohm ohmVar, Object obj) {
        this.f = ohmVar;
        this.d = obj;
    }

    protected abstract void c();

    public final void d() {
        synchronized (this) {
            this.d = null;
        }
    }

    public final void e() {
        d();
        ArrayList arrayList = this.f.g;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }
}
