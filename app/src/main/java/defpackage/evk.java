package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evk implements evg {
    public static final evk a = new evk(2, null);
    private final /* synthetic */ int b;

    public evk(int i) {
        this.b = i;
    }

    @Override // defpackage.evg
    public final boolean a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return false;
        }
        if (i != 1) {
            return true;
        }
        return obj.toString().startsWith("data:image");
    }

    @Override // defpackage.evg
    public final tdy b(Object obj, int i, int i2, eqm eqmVar) {
        int i3 = this.b;
        if (i3 != 0) {
            return i3 != 1 ? new tdy(new fai(obj), new evo(obj, 0)) : new tdy(new fai(obj), new eun(obj.toString()));
        }
        return null;
    }

    @Deprecated
    public evk(int i, char[] cArr) {
        this.b = i;
    }
}
