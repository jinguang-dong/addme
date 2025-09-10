package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aoj implements btu {
    private final zm a;
    private final got b;

    public aoj(got gotVar) {
        this.b = gotVar;
        int i = zn.a;
        this.a = new zm((byte[]) null);
    }

    @Override // defpackage.btu
    public final void a(btt bttVar) {
        zm zmVar = this.a;
        zmVar.e();
        zq zqVar = bttVar.a;
        Object[] objArr = zqVar.b;
        long[] jArr = zqVar.c;
        int i = zqVar.e;
        while (i != Integer.MAX_VALUE) {
            long j = jArr[i] >> 31;
            Object obj = objArr[i];
            Object objV = this.b.v(obj);
            int iC = zmVar.c(objV, 0);
            int i2 = (int) (j & 2147483647L);
            if (iC == 7) {
                bttVar.remove(obj);
            } else {
                zmVar.g(objV, iC + 1);
            }
            i = i2;
        }
    }

    @Override // defpackage.btu
    public final boolean b(Object obj, Object obj2) {
        got gotVar = this.b;
        return a.ao(gotVar.v(obj), gotVar.v(obj2));
    }
}
