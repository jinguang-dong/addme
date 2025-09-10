package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ghb implements syf {
    final /* synthetic */ pka a;
    final /* synthetic */ lte b;
    final /* synthetic */ ghc c;

    public ghb(ghc ghcVar, pka pkaVar, lte lteVar) {
        this.a = pkaVar;
        this.b = lteVar;
        this.c = ghcVar;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        this.c.c(this.b, th);
    }

    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        poj pojVar = (poj) obj;
        try {
            ghc ghcVar = this.c;
            szh szhVar = ghcVar.f;
            ghh ghhVar = ghcVar.b;
            pao paoVar = (pao) ((ovx) ghcVar.a.t).d;
            pka pkaVar = this.a;
            try {
                ByteBuffer buffer = ((poi) pojVar.g().get(0)).getBuffer();
                byte[] bArr = new byte[buffer.capacity()];
                buffer.get(bArr);
                pojVar.close();
                gbu gbuVarA = ghhVar.a(bArr, paoVar, pkaVar);
                ghc ghcVar2 = this.c;
                gbuVarA.c(ghcVar2.d);
                gbuVarA.b(System.currentTimeMillis() - ghcVar2.e);
                gbuVarA.j = this.b;
                szhVar.e(gbuVarA.a());
            } catch (Throwable th) {
                pojVar.close();
                throw th;
            }
        } catch (Exception e) {
            this.c.c(this.b, e);
        }
    }
}
