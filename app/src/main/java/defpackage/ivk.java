package defpackage;

import com.google.ar.core.Session;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ivk implements paq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ivk(fna fnaVar, paq paqVar, pdn pdnVar, pdm pdmVar, int i) {
        this.e = i;
        this.a = fnaVar;
        this.d = paqVar;
        this.c = pdnVar;
        this.b = pdmVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, pdm] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, pdn] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, paq] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        int i = this.e;
        if (i == 0) {
            Object obj = this.d;
            ((ivx) this.b).f(new gdq(this.a, this.c, obj, 11, (int[]) null));
            return;
        }
        if (i != 1) {
            Object obj2 = this.c;
            Object obj3 = this.b;
            ((lzp) this.a).d((rwc) this.d, (rwc) obj3, (rwc) obj2);
            return;
        }
        fna fnaVar = (fna) this.a;
        if (fnaVar.d.getAndSet(true)) {
            ((sgt) fna.a.c().M(280)).s("Already closed.");
            return;
        }
        ?? r1 = this.b;
        ?? r2 = this.c;
        this.d.close();
        gzi gziVar = gyi.a;
        r2.m(r1);
        r2.close();
        foy foyVar = fnaVar.i;
        Session session = (Session) foyVar.a;
        session.getClass();
        ezh.m(new foh(session, 4));
        foyVar.b();
        fnaVar.a(sfd.a);
    }

    public /* synthetic */ ivk(ivo ivoVar, ivx ivxVar, ovx ovxVar, ivt ivtVar, int i) {
        this.e = i;
        this.a = ivoVar;
        this.b = ivxVar;
        this.c = ovxVar;
        this.d = ivtVar;
    }

    public /* synthetic */ ivk(lzp lzpVar, rwc rwcVar, rwc rwcVar2, rwc rwcVar3, int i) {
        this.e = i;
        this.a = lzpVar;
        this.d = rwcVar;
        this.b = rwcVar2;
        this.c = rwcVar3;
    }
}
