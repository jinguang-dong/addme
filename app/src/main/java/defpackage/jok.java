package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jok implements qlr {
    final /* synthetic */ jom a;

    public jok(jom jomVar) {
        this.a = jomVar;
    }

    @Override // defpackage.qlr
    public final void b(MediaCodec.BufferInfo bufferInfo) {
        jom jomVar = this.a;
        jomVar.f.incrementAndGet();
        bufferInfo.flags = 1;
        jomVar.a(false);
    }

    @Override // defpackage.qlr
    public final void c() {
    }

    @Override // defpackage.qlr
    public final void a(long j) {
    }

    @Override // defpackage.qlr
    public final void d(int i) {
    }

    @Override // defpackage.qlr
    public final void e(qli qliVar) {
    }
}
