package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sbl extends sgk {
    private final sbp a;

    public sbl(sbp sbpVar, int i) {
        super(sbpVar.size(), i);
        this.a = sbpVar;
    }

    @Override // defpackage.sgk
    protected final Object a(int i) {
        return this.a.get(i);
    }
}
