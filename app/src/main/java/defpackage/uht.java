package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class uht extends uhp implements ujm {
    private final int a;

    public uht(int i, uhb uhbVar) {
        super(uhbVar);
        this.a = i;
    }

    @Override // defpackage.ujm
    public final int cT() {
        return this.a;
    }

    @Override // defpackage.uhn
    public final String toString() {
        if (this.q != null) {
            return super.toString();
        }
        int i = ukb.a;
        String strF = ujp.f(this);
        strF.getClass();
        return strF;
    }
}
