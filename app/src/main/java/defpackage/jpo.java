package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jpo implements qlr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int d;

    public jpo(jor jorVar, qlr qlrVar, int i) {
        this.d = i;
        this.a = qlrVar;
        this.b = jorVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, qlr] */
    @Override // defpackage.qlr
    public final void a(long j) {
        if (this.d != 0) {
            this.a.a(j);
        } else {
            boolean z = jog.a;
            boolean z2 = jog.a;
        }
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, qlr] */
    @Override // defpackage.qlr
    public final void b(MediaCodec.BufferInfo bufferInfo) {
        if (this.d != 0) {
            this.a.b(bufferInfo);
            return;
        }
        long j = bufferInfo.presentationTimeUs;
        jpp jppVar = (jpp) this.a;
        if (jppVar.l.compareAndSet(0L, j)) {
            long j2 = bufferInfo.presentationTimeUs;
        }
        if ((bufferInfo.flags & 1) != 0) {
            jppVar.m.set(jppVar.n.getAndSet(0));
        } else {
            jppVar.n.incrementAndGet();
        }
        if (((joo) this.b).e(bufferInfo.presentationTimeUs).j()) {
            bufferInfo.flags |= Integer.MIN_VALUE;
        }
        jppVar.i.incrementAndGet();
        jppVar.j.incrementAndGet();
        jppVar.k.set(bufferInfo.presentationTimeUs);
        jqb jqbVar = jppVar.t;
        jqbVar.j.set(bufferInfo.presentationTimeUs);
        jqbVar.m.incrementAndGet();
        if (!jqbVar.n.b(bufferInfo.presentationTimeUs, new jqa(bufferInfo, 0))) {
            ((sgt) jqb.a.b().M(3020)).u("onEncoded(%d) was received but we weren't expecting this timestamp", bufferInfo.presentationTimeUs);
        }
        jqbVar.b.execute(new jmr(jqbVar, 15));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, qlr] */
    @Override // defpackage.qlr
    public final void e(qli qliVar) {
        if (this.d == 0) {
            Object obj = this.a;
            ((jpp) obj).d.post(new jmr(obj, 14));
        } else {
            qlj qljVarB = qliVar.b();
            if (qljVarB != null) {
                ((jor) this.b).a.add(qljVarB);
            }
            this.a.e(qliVar);
        }
    }

    public jpo(jpp jppVar, joo jooVar, int i) {
        this.d = i;
        this.b = jooVar;
        this.a = jppVar;
    }

    @Override // defpackage.qlr
    public final void c() {
    }

    @Override // defpackage.qlr
    public final void d(int i) {
    }
}
