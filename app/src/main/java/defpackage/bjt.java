package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjt extends ujq implements uiq {
    final /* synthetic */ bij a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjt(bkb bkbVar, bju bjuVar, uiq uiqVar, int i) {
        super(1);
        this.d = i;
        this.a = bkbVar;
        this.b = bjuVar;
        this.c = uiqVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, uiq] */
    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        boolean zBooleanValue;
        if (this.d != 0) {
            bxd bxdVar = (bxd) obj;
            bjg bjgVar = (bjg) bxdVar;
            if (!((bxv) bko.D(this.a)).h.b.contains(bjgVar) || !kk.l(bjgVar, kk.o((ejs) this.b))) {
                return bxc.a;
            }
            ((uka) this.c).a = bxdVar;
            return bxc.c;
        }
        bkb bkbVar = (bkb) obj;
        if (a.ao(bkbVar, this.a)) {
            zBooleanValue = false;
        } else {
            if (a.ao(bkbVar, ((bju) this.b).c)) {
                throw new IllegalStateException("Focus search landed at the root.");
            }
            zBooleanValue = ((Boolean) this.c.a(bkbVar)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjt(uka ukaVar, bjg bjgVar, ejs ejsVar, int i) {
        super(1);
        this.d = i;
        this.c = ukaVar;
        this.a = bjgVar;
        this.b = ejsVar;
    }
}
