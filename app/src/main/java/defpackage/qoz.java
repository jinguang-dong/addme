package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qoz {
    public qpa a;
    public qou b;
    public final qoy c = new qoy();

    public qoz(qpf qpfVar, qpj qpjVar, uem uemVar, uem uemVar2) {
        int i = 13;
        rww rwwVarY = rnt.y(new fvq(uemVar, i));
        rww rwwVarY2 = rnt.y(new fvq(uemVar2, i));
        if (!((Boolean) rwwVarY2.fr()).booleanValue()) {
            d(qpfVar, rwwVarY, rwwVarY2);
            c(qpjVar, rwwVarY, rwwVarY2);
        } else if (((Boolean) rwwVarY.fr()).booleanValue()) {
            c(qpjVar, rwwVarY, rwwVarY2);
        } else {
            d(qpfVar, rwwVarY, rwwVarY2);
        }
    }

    private final void c(qpj qpjVar, rww rwwVar, rww rwwVar2) {
        this.b = new qou(new qox(this, rwwVar2, rwwVar, qpjVar, 0));
        qpjVar.g.add(this.b);
    }

    private final void d(qpf qpfVar, rww rwwVar, rww rwwVar2) {
        qpa qpaVar = new qpa(new qox(this, rwwVar2, rwwVar, qpfVar, 1));
        this.a = qpaVar;
        qpfVar.a(qpaVar);
    }

    public final void a(qov qovVar) {
        this.c.b.add(qovVar);
    }

    public final void b(qov qovVar) {
        this.c.b.remove(qovVar);
    }
}
