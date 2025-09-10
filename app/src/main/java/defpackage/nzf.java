package defpackage;

import android.net.Uri;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzf {
    public Object a;
    public Object b;
    private boolean c;
    private byte d;

    public nzf() {
    }

    public final nzh a() {
        Object obj = this.a;
        if (obj != null) {
            this.b = ((scl) obj).g();
        } else if (this.b == null) {
            this.b = sfd.a;
        }
        if (this.d == 1) {
            return new nzh(this.c, (scn) this.b);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    public final void b(nzg nzgVar) {
        if (this.a == null) {
            if (this.b == null) {
                this.a = new scl();
            } else {
                scl sclVar = new scl();
                this.a = sclVar;
                sclVar.j(this.b);
                this.b = null;
            }
        }
        ((scl) this.a).d(nzgVar);
    }

    public final void c(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }

    public final void d(Set set) {
        if (this.a != null) {
            throw new IllegalStateException();
        }
        this.b = scn.F(set);
    }

    public final lsy e() throws NumberFormatException {
        Object obj;
        Object obj2;
        Object obj3 = this.b;
        if (obj3 == null) {
            throw new IllegalStateException();
        }
        rnt.M(!r0.equals(Uri.EMPTY), "MediaStoreRecord should only be created with a valid MediaStore Uri");
        String lastPathSegment = ((Uri) obj3).getLastPathSegment();
        lastPathSegment.getClass();
        long j = Long.parseLong(lastPathSegment);
        int i = this.d | 1;
        this.d = (byte) i;
        if (i != 3 || (obj = this.b) == null || (obj2 = this.a) == null) {
            throw new IllegalStateException();
        }
        return new lsy(j, (Uri) obj, (ltf) obj2, this.c);
    }

    public final void f(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 2);
    }

    public final void g(ltf ltfVar) {
        ltfVar.getClass();
        this.a = ltfVar;
    }

    public final void h(Uri uri) {
        uri.getClass();
        this.b = uri;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, poe] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, poe] */
    public final icv i() {
        if (this.d == 1) {
            return new icv(this.c, this.a, this.b);
        }
        throw new IllegalStateException();
    }

    public final void j(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }

    public nzf(icv icvVar) {
        this.c = icvVar.a;
        this.a = icvVar.b;
        this.b = icvVar.c;
        this.d = (byte) 1;
    }
}
