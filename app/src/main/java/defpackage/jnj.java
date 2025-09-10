package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jnj implements syf {
    final /* synthetic */ jnl a;
    final /* synthetic */ jnk b;
    final /* synthetic */ jnm c;

    public jnj(jnm jnmVar, jnl jnlVar, jnk jnkVar) {
        this.a = jnlVar;
        this.b = jnkVar;
        this.c = jnmVar;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        jnl jnlVar = this.a;
        if (jnlVar.o.b().isCancelled()) {
            this.c.e(jnlVar, th, this.b);
            jnlVar.k.b(th);
        } else {
            this.c.d(jnlVar, th, this.b);
            jnlVar.k.F(nfo.a, th);
        }
        this.c.c(jnlVar);
        jnlVar.q = rvk.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, jub] */
    @Override // defpackage.syf
    public final void b(Object obj) {
        String str;
        jnl jnlVar = this.a;
        jpi jpiVarA = jnlVar.d.a();
        if (jpiVarA.a == 0) {
            sgv sgvVar = jnm.a;
            sgt sgtVar = (sgt) sgvVar.b().M(2860);
            ltd ltdVar = jnlVar.a;
            sgtVar.v("No key video frames in long shot. Shot=%s", ltdVar);
            boolean z = false;
            if (jnlVar.p && jnlVar.q.h()) {
                z = true;
            }
            if (!z) {
                this.c.d(jnlVar, new IllegalStateException(String.format("No video frames in long shot. Shot=%s", ltdVar)), this.b);
            }
            jnm jnmVar = this.c;
            jnmVar.c(jnlVar);
            if (z) {
                if (jnlVar.q.h()) {
                    jnmVar.v.g(((pfl) jnlVar.q.c()).a);
                    str = "No video frames available. Trigger backup shot.";
                } else {
                    ((sgt) sgvVar.c().M(2862)).s("Didn't take second shot since UI resources are missing");
                    str = "No video frames available. Unable to trigger backup shot.";
                }
                jnlVar.k.b(new Throwable(str));
            } else {
                jnlVar.k.F(nfo.a, new IllegalStateException(String.format("No video frames in long shot. Shot=%s", ltdVar)));
            }
        } else {
            this.c.h(jnlVar, this.b, jpiVarA.d - jpiVarA.c);
        }
        jnlVar.q = rvk.a;
    }
}
