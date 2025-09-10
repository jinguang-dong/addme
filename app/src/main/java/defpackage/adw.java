package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adw implements acf {
    private final /* synthetic */ int a;
    private final Object b;

    public adw(ace aceVar, float f, float f2, int i) {
        this.a = i;
        int iB = aceVar.b();
        acp[] acpVarArr = new acp[iB];
        for (int i2 = 0; i2 < iB; i2++) {
            acpVarArr[i2] = new acp(f, f2, aceVar.a(i2));
        }
        this.b = acpVarArr;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aco, java.lang.Object] */
    @Override // defpackage.acf
    public final /* synthetic */ aco a(int i) {
        return this.a != 0 ? ((acp[]) this.b)[i] : this.b;
    }

    public adw(float f, float f2, int i) {
        this.a = i;
        this.b = new acp(f, f2, 4);
    }
}
