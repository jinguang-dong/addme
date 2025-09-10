package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bkc extends ujq implements uiq {
    final /* synthetic */ bkb a;
    final /* synthetic */ bkb b;
    final /* synthetic */ int c;
    final /* synthetic */ uiq d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkc(mwu mwuVar, bkb bkbVar, bkb bkbVar2, bkb bkbVar3, int i, uiq uiqVar, int i2) {
        super(1);
        this.g = i2;
        this.f = mwuVar;
        this.a = bkbVar;
        this.e = bkbVar2;
        this.b = bkbVar3;
        this.c = i;
        this.d = uiqVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [buo, java.lang.Object] */
    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        if (this.g != 0) {
            brd brdVar = (brd) obj;
            int i = ((mwu) this.f).a;
            ?? r0 = this.e;
            if (this.a != ((bxv) bko.D(r0)).D.f) {
                return true;
            }
            boolean zW = acv.w((bkb) r0, this.b, this.c, this.d);
            Boolean boolValueOf = Boolean.valueOf(zW);
            boolValueOf.getClass();
            if (zW || !brdVar.a()) {
                return boolValueOf;
            }
            return null;
        }
        brd brdVar2 = (brd) obj;
        int i2 = ((mwu) this.e).a;
        bkb bkbVar = this.b;
        if (this.a != ((bxv) bko.D(bkbVar)).D.f) {
            return true;
        }
        boolean zT = acv.t(bkbVar, (bkg) this.f, this.c, this.d);
        Boolean boolValueOf2 = Boolean.valueOf(zT);
        boolValueOf2.getClass();
        if (zT || !brdVar2.a()) {
            return boolValueOf2;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkc(mwu mwuVar, bkb bkbVar, bkb bkbVar2, bkg bkgVar, int i, uiq uiqVar, int i2) {
        super(1);
        this.g = i2;
        this.e = mwuVar;
        this.a = bkbVar;
        this.b = bkbVar2;
        this.f = bkgVar;
        this.c = i;
        this.d = uiqVar;
    }
}
