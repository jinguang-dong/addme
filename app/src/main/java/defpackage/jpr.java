package defpackage;

import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpr implements qez {
    public final AmbientMode.AmbientController a;
    private final qez b;

    public jpr(qez qezVar, AmbientMode.AmbientController ambientController) {
        this.b = qezVar;
        this.a = ambientController;
    }

    @Override // defpackage.qez
    public final qfc a() {
        return new jpq(this, this.b.a());
    }

    @Override // defpackage.qez
    public final syu b() {
        return this.b.b();
    }

    @Override // defpackage.qez
    public final void c() {
        this.b.c();
    }

    @Override // defpackage.qez
    public final void d() {
        this.b.d();
    }
}
