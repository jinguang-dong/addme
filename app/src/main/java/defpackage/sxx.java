package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxx {
    public Object a;
    public Object b;
    public Object c;

    public sxx() {
    }

    public final iqo a() {
        Object obj = this.b;
        if (obj == null) {
            throw new IllegalStateException();
        }
        return new iqo((iqq) obj, (Optional) this.c, (Optional) this.a);
    }

    public final void b(iqq iqqVar) {
        iqqVar.getClass();
        this.b = iqqVar;
    }

    public final gnr c() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        if (obj3 == null || (obj = this.a) == null || (obj2 = this.b) == null) {
            throw new IllegalStateException();
        }
        return new gnr((oxh) obj3, (oxj) obj, (gax) obj2);
    }

    public final void d(oxh oxhVar) {
        oxhVar.getClass();
        this.c = oxhVar;
    }

    public final void e(oxj oxjVar) {
        oxjVar.getClass();
        this.a = oxjVar;
    }

    public final boolean f() {
        return this.a != null;
    }

    public sxx(byte[] bArr, byte[] bArr2) {
        this.c = Optional.empty();
        this.a = Optional.empty();
    }
}
