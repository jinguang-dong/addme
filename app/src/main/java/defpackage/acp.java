package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acp implements aco {
    private final float a;
    private final float b;
    private final float c;
    private final acx d;

    /* JADX WARN: Illegal instructions before constructor call */
    public acp() {
        float f = 0.0f;
        this(f, f, 7);
    }

    @Override // defpackage.aby
    public final /* bridge */ /* synthetic */ adv a(byz byzVar) {
        return f();
    }

    @Override // defpackage.aco
    public final float b(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.aco
    public final float c(long j, float f, float f2, float f3) {
        acx acxVar = this.d;
        acxVar.a = f2;
        return Float.intBitsToFloat((int) (acxVar.b(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.aco
    public final float d(long j, float f, float f2, float f3) {
        acx acxVar = this.d;
        acxVar.a = f2;
        return Float.intBitsToFloat((int) (acxVar.b(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    @Override // defpackage.aco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(float r34, float r35, float r36) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acp.e(float, float, float):long");
    }

    @Override // defpackage.aco
    public final /* synthetic */ aea f() {
        return new aea(this);
    }

    public acp(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        acx acxVar = new acx();
        if (f < 0.0f) {
            acv.a("Damping ratio must be non-negative");
        }
        acxVar.c = f;
        if (acxVar.a() <= 0.0f) {
            acv.a("Spring stiffness constant must be positive.");
        }
        acxVar.b = Math.sqrt(f2);
        this.d = acxVar;
    }

    public /* synthetic */ acp(float f, float f2, int i) {
        this(1 == (i & 1) ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, 0.01f);
    }
}
