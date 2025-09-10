package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes.dex */
class qlp implements qlr {
    protected final qlr a;

    public qlp(qlr qlrVar) {
        this.a = qlrVar;
    }

    @Override // defpackage.qlr
    public final void a(long j) {
        this.a.a(j);
    }

    @Override // defpackage.qlr
    public final void b(MediaCodec.BufferInfo bufferInfo) {
        this.a.b(bufferInfo);
    }

    @Override // defpackage.qlr
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.qlr
    public void d(int i) {
        this.a.d(i);
    }

    @Override // defpackage.qlr
    public final void e(qli qliVar) {
        this.a.e(qliVar);
    }
}
