package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class pqr implements rwe {
    private final /* synthetic */ int a;

    public /* synthetic */ pqr(int i) {
        this.a = i;
    }

    @Override // defpackage.rwe
    public final boolean a(Object obj) {
        int i = this.a;
        if (i == 0) {
            return pqw.j((pqu) obj, "http://ns.adobe.com/xmp/extension/\u0000");
        }
        if (i == 1) {
            return ((phc) obj).e();
        }
        int iAq = a.aq(((pva) obj).m);
        return iAq != 0 && iAq == 2;
    }
}
