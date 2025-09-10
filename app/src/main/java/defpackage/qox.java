package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qox implements qov {
    final /* synthetic */ rww a;
    final /* synthetic */ rww b;
    final /* synthetic */ qoz c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public qox(qoz qozVar, rww rwwVar, rww rwwVar2, Object obj, int i) {
        this.e = i;
        this.a = rwwVar;
        this.b = rwwVar2;
        this.d = obj;
        this.c = qozVar;
    }

    private final void a() {
        qoz qozVar = this.c;
        qou qouVar = qozVar.b;
        if (qouVar != null) {
            ((qpj) this.d).g.remove(qouVar);
            qozVar.b = null;
        }
    }

    private final void b() {
        qoz qozVar = this.c;
        qpa qpaVar = qozVar.a;
        if (qpaVar != null) {
            ((qpf) this.d).b(qpaVar);
            qozVar.a = null;
        }
    }

    @Override // defpackage.qov
    public final void i(qna qnaVar) {
        if (this.e != 0) {
            if (((Boolean) this.a.fr()).booleanValue()) {
                this.c.c.k(qnaVar);
                return;
            } else if (((Boolean) this.b.fr()).booleanValue()) {
                b();
                return;
            } else {
                this.c.c.k(qnaVar);
                return;
            }
        }
        if (((Boolean) this.a.fr()).booleanValue()) {
            this.c.c.k(qnaVar);
        } else if (((Boolean) this.b.fr()).booleanValue()) {
            this.c.c.k(qnaVar);
        } else {
            a();
        }
    }

    @Override // defpackage.qov
    public final void j(qna qnaVar) {
        if (this.e != 0) {
            if (((Boolean) this.a.fr()).booleanValue()) {
                this.c.c.l(qnaVar);
                return;
            } else if (((Boolean) this.b.fr()).booleanValue()) {
                b();
                return;
            } else {
                this.c.c.l(qnaVar);
                return;
            }
        }
        if (((Boolean) this.a.fr()).booleanValue()) {
            this.c.c.l(qnaVar);
        } else if (((Boolean) this.b.fr()).booleanValue()) {
            this.c.c.l(qnaVar);
        } else {
            a();
        }
    }
}
