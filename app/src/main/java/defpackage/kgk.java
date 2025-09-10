package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgk extends owx {
    public final owf a;

    public kgk(owq owqVar) {
        super(owqVar);
        this.a = owqVar;
    }

    @Override // defpackage.owx
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue == 1) {
            return kgj.AUTO;
        }
        if (iIntValue == 2) {
            return kgj.INCANDESCENT;
        }
        if (iIntValue == 3) {
            return kgj.FLUORESCENT;
        }
        if (iIntValue == 5) {
            return kgj.SUNNY;
        }
        if (iIntValue == 6) {
            return kgj.CLOUDY;
        }
        throw new RuntimeException("Unknown WB input value");
    }

    @Override // defpackage.owx
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        int iOrdinal = ((kgj) obj).ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 6;
        }
        if (iOrdinal == 2) {
            return 5;
        }
        if (iOrdinal == 3) {
            return 2;
        }
        if (iOrdinal == 4) {
            return 3;
        }
        throw new RuntimeException("Unknown WB output value");
    }
}
