package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ehc implements eha {
    private final elo a;
    private float b = -1.0f;

    public ehc(List list) {
        this.a = (elo) list.get(0);
    }

    @Override // defpackage.eha
    public final float a() {
        return this.a.b();
    }

    @Override // defpackage.eha
    public final float b() {
        return this.a.c();
    }

    @Override // defpackage.eha
    public final elo c() {
        return this.a;
    }

    @Override // defpackage.eha
    public final boolean d(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.eha
    public final boolean e() {
        return false;
    }

    @Override // defpackage.eha
    public final boolean f(float f) {
        return !this.a.e();
    }
}
