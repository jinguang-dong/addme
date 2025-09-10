package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hxr implements iae {
    final /* synthetic */ hxs a;
    final /* synthetic */ gga b;

    public hxr(hxs hxsVar, gga ggaVar) {
        this.b = ggaVar;
        this.a = hxsVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, lss] */
    @Override // defpackage.iae
    public final void a(ggg gggVar) {
        hxs hxsVar = this.a;
        hxsVar.b.f("DngCallback");
        try {
            try {
                kjp kjpVarB = ((kjq) hxsVar.j.B()).b(this.b);
                ByteBuffer byteBufferDuplicate = ((ByteBuffer) gggVar.a).duplicate();
                if (byteBufferDuplicate == null) {
                    kjpVarB.b.f();
                    kjpVarB.a.h();
                } else {
                    byteBufferDuplicate.capacity();
                    kjpVarB.c.a.execute(new kee(kjpVarB, byteBufferDuplicate, 3));
                }
            } catch (RuntimeException e) {
                this.a.c.e("Failed to write dng to file", e);
            }
            this.b.b.aj();
            this.a.b.g();
        } catch (Throwable th) {
            this.b.b.aj();
            throw th;
        }
    }
}
