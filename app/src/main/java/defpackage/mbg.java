package defpackage;

import android.content.pm.ResolveInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mbg {
    private ResolveInfo a;
    private boolean b;
    private boolean c;
    private boolean d;
    private byte e;

    public final mbh a() {
        ResolveInfo resolveInfo;
        if (this.e != 7 || (resolveInfo = this.a) == null) {
            throw new IllegalStateException();
        }
        return new mbh(resolveInfo, this.b, this.c, this.d);
    }

    public final void b(boolean z) {
        this.c = z;
        this.e = (byte) (this.e | 2);
    }

    public final void c(ResolveInfo resolveInfo) {
        resolveInfo.getClass();
        this.a = resolveInfo;
    }

    public final void d(boolean z) {
        this.d = z;
        this.e = (byte) (this.e | 4);
    }

    public final void e() {
        this.b = true;
        this.e = (byte) (1 | this.e);
    }
}
