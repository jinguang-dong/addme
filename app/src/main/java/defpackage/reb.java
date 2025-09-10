package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class reb {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    private boolean f;
    private byte g;
    private Object h;

    public reb() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, tqr] */
    public final rec a() {
        Object obj;
        ?? r3;
        Object obj2;
        Object obj3 = this.c;
        if (obj3 != null) {
            this.d = ((sbk) obj3).g();
        } else if (this.d == null) {
            int i = sbp.d;
            this.d = sex.a;
        }
        if (this.g != 3 || (obj = this.a) == null || (r3 = this.h) == 0 || (obj2 = this.e) == null) {
            throw new IllegalStateException();
        }
        return new rec((Uri) obj, r3, (rwc) this.b, (sbp) this.d, (qsy) obj2, this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    public final void b(reh rehVar) {
        if (this.c == null) {
            if (this.d == null) {
                int i = sbp.d;
                this.c = new sbk();
            } else {
                int i2 = sbp.d;
                sbk sbkVar = new sbk();
                this.c = sbkVar;
                sbkVar.j(this.d);
                this.d = null;
            }
        }
        ((sbk) this.c).h(rehVar);
    }

    public final void c() {
        this.g = (byte) (this.g | 2);
    }

    public final void d(tqr tqrVar) {
        tqrVar.getClass();
        this.h = tqrVar;
    }

    public final void e(Uri uri) {
        uri.getClass();
        this.a = uri;
    }

    public final void f(boolean z) {
        this.f = z;
        this.g = (byte) (this.g | 1);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v0, types: [gdt, java.lang.Object] */
    public final gdu g() {
        Object obj;
        ?? r3;
        ?? r4;
        ?? r5;
        Object obj2;
        if (this.g != 1 || (obj = this.e) == null || (r3 = this.c) == 0 || (r4 = this.b) == 0 || (r5 = this.h) == 0 || (obj2 = this.d) == null) {
            throw new IllegalStateException();
        }
        return new gdu((mhp) obj, r3, r4, r5, (String) obj2, this.f, this.a);
    }

    public final void h(boolean z) {
        this.f = z;
        this.g = (byte) 1;
    }

    public final void i(Executor executor) {
        executor.getClass();
        this.h = executor;
    }

    public final void j(mhp mhpVar) {
        mhpVar.getClass();
        this.e = mhpVar;
    }

    public reb(byte[] bArr) {
        this.b = rvk.a;
    }

    public reb(char[] cArr) {
    }
}
