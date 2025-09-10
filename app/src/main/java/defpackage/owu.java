package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owu extends ovx {
    public int a;
    public volatile Object e;

    public owu(Object obj) {
        super(obj);
        this.e = null;
    }

    @Override // defpackage.ovx
    public final void d(Object obj) {
        if (this.a > 0) {
            this.e = obj;
        } else {
            if (a.K(this.d, obj)) {
                return;
            }
            super.d(obj);
        }
    }

    public final paq e() {
        this.c.execute(new mvn(this, 16));
        return new ktu(this, new AtomicBoolean(false), 19);
    }

    public owu(Object obj, owr owrVar) {
        super(obj, owrVar);
        this.e = null;
    }
}
