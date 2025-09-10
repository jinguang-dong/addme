package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijd implements itk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ijd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, ndo] */
    @Override // defpackage.itk
    public final void f(boolean z) {
        jth jthVar;
        int i = this.b;
        if (i == 0) {
            ?? r3 = ((jdh) this.a).g;
            r3.getClass();
            if (z) {
                return;
            }
            r3.e();
            return;
        }
        if (i != 1) {
            if (z) {
                return;
            }
            jxa jxaVar = (jxa) this.a;
            if (jxaVar.j) {
                return;
            }
            jxaVar.d.a();
            return;
        }
        Object obj = this.a;
        fiv fivVar = (fiv) obj;
        if (fivVar.n || (jthVar = fivVar.s) == null || !((Boolean) jthVar.b().dL()).booleanValue()) {
            return;
        }
        if (z) {
            fivVar.m.e();
        } else {
            fivVar.o = true;
            fivVar.m.g();
            ((fqf) obj).n();
        }
        fivVar.b.G(z);
    }

    @Override // defpackage.itk
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void a(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void c(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void h(boolean z) {
    }
}
