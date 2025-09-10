package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axu implements azo {
    public final Object a;
    public final bff b;
    public zo c;
    public zo d;
    private final uif f;
    private Throwable g;

    public axu() {
        this(null);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, uhb] */
    @Override // defpackage.azo
    public final Object a(uiq uiqVar, uhb uhbVar) {
        int i;
        int i2;
        uif uifVar;
        int i3;
        uml umlVar = new uml(ske.aE(uhbVar), 1);
        umlVar.x();
        cwi cwiVar = new cwi(uiqVar, umlVar);
        ujy ujyVar = new ujy();
        ujyVar.a = -1;
        synchronized (this.a) {
            Throwable th = this.g;
            if (th != null) {
                umlVar.fW(rnt.aM(th));
            } else {
                bff bffVar = this.b;
                do {
                    i = bffVar.get();
                    i2 = i + 1;
                } while (!bffVar.compareAndSet(i, i2));
                int i4 = 134217727 & i2;
                ujyVar.a = (i2 >>> 27) & 15;
                this.c.o(cwiVar);
                umlVar.d(new axt(cwiVar, this, ujyVar));
                if (i4 == 1 && (uifVar = this.f) != null) {
                    try {
                        uifVar.a();
                    } catch (Throwable th2) {
                        synchronized (this.a) {
                            if (this.g == null) {
                                this.g = th2;
                                zo zoVar = this.c;
                                Object[] objArr = zoVar.a;
                                int i5 = zoVar.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ?? r6 = ((cwi) objArr[i6]).b;
                                    if (r6 != 0) {
                                        r6.fW(rnt.aM(th2));
                                    }
                                }
                                this.c.j();
                                bff bffVar2 = this.b;
                                do {
                                    i3 = bffVar2.get();
                                } while (!bffVar2.compareAndSet(i3, axs.a(((i3 >>> 27) & 15) + 1)));
                            }
                        }
                    }
                }
            }
        }
        Object objI = umlVar.i();
        if (objI == uhi.a) {
            uhbVar.getClass();
        }
        return objI;
    }

    @Override // defpackage.uhf
    public final Object fold(Object obj, uiu uiuVar) {
        return ske.aF(this, obj, uiuVar);
    }

    @Override // defpackage.uhd, defpackage.uhf
    public final uhd get(uhe uheVar) {
        return ske.aG(this, uheVar);
    }

    @Override // defpackage.uhd
    public final /* synthetic */ uhe getKey() {
        return azo.e;
    }

    @Override // defpackage.uhf
    public final uhf minusKey(uhe uheVar) {
        return ske.aH(this, uheVar);
    }

    @Override // defpackage.uhf
    public final uhf plus(uhf uhfVar) {
        return ske.aI(this, uhfVar);
    }

    public axu(uif uifVar) {
        this.f = uifVar;
        this.a = new Object();
        this.b = new bff();
        byte[] bArr = null;
        this.c = new zo(bArr);
        this.d = new zo(bArr);
    }
}
