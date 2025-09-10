package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctl extends ctj {
    public final ctk s;

    public ctl(ctn ctnVar) {
        super(ctnVar);
        ctk ctkVar = new ctk();
        this.s = ctkVar;
        ctkVar.a(b());
    }

    @Override // defpackage.ctj
    public final void f(float f) {
        this.s.a(f);
    }

    @Override // defpackage.ctj
    public final boolean h(long j) {
        float f = this.j;
        float f2 = this.i;
        ctk ctkVar = this.s;
        double dExp = f2 * Math.exp((j / 1000.0f) * ctkVar.a);
        ctf ctfVar = ctkVar.b;
        float f3 = (float) dExp;
        ctfVar.b = f3;
        ctfVar.a = f + ((f3 - f2) / ctkVar.a);
        if (ctkVar.b(f3)) {
            ctfVar.b = 0.0f;
        }
        float f4 = ctfVar.a;
        this.j = f4;
        float f5 = ctfVar.b;
        this.i = f5;
        float f6 = this.p;
        if (f4 >= f6) {
            f6 = this.o;
            if (f4 <= f6) {
                return f4 >= f6 || f4 <= f6 || ctkVar.b(f5);
            }
        }
        this.j = f6;
        return true;
    }
}
