package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlc extends jle {
    final /* synthetic */ szh a;
    final /* synthetic */ jlk b;
    final /* synthetic */ hbp c;

    public jlc(hbp hbpVar, szh szhVar, jlk jlkVar) {
        this.a = szhVar;
        this.b = jlkVar;
        this.c = hbpVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, pvu] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.jle, defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        rvk rvkVar = rvk.a;
        pws pwsVar = new pws(rwc.j("uranus-joy-animation"), rvkVar, rvkVar, rwc.j(false));
        pwsVar.a.h();
        rnt.B(true, "Request must provide a group name or source to filter by");
        hbp hbpVar = this.c;
        hbpVar.p(swz.i(hbpVar.b.e(pwsVar), new idb(7), hbpVar.a), new jlb(this, this.a, this.b));
    }
}
