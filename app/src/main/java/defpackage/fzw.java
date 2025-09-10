package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fzw implements gab, gaa {
    private final plx a;

    public fzw(plx plxVar) {
        this.a = plxVar;
    }

    @Override // defpackage.gab
    public final qaq a(ByteBuffer byteBuffer, int i) {
        return this.a.g(byteBuffer, i);
    }

    @Override // defpackage.gaa
    public final void c() {
        this.a.close();
    }

    @Override // defpackage.gaa
    public final void d() {
        this.a.e();
    }

    @Override // defpackage.gaa
    public final void e() {
        this.a.f();
    }
}
