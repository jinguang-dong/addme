package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jef implements emu {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public jef(jec jecVar, ena enaVar, int i) {
        this.c = i;
        this.b = enaVar;
        this.a = jecVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, jfk] */
    @Override // defpackage.emu
    public final void a(boolean z, ena enaVar) {
        if (this.c == 0) {
            jeg jegVar = (jeg) this.b;
            jej jejVar = jegVar.b;
            jejVar.E.c(0.0d);
            jejVar.d.b(jejVar.E.f());
            if (jejVar.n && jejVar.G == 1) {
                jejVar.e.c(jejVar.x);
            }
            jejVar.u = true;
            jegVar.u = true;
            this.a.a(null);
            return;
        }
        jeg jegVar2 = ((jec) this.a).a;
        int i = jegVar2.k + 1;
        jegVar2.k = i;
        if (jegVar2.j) {
            ((sgt) jeg.a.c().M(2706)).s("Past trial succeeded so nothing to do, shouldn't have gotten to this.");
        } else {
            if (z || i >= 3) {
                jegVar2.d((ena) this.b);
            }
            jegVar2.h = z ? jegVar2.i : -9990.0d;
            jegVar2.j = z;
        }
        jegVar2.l.release();
    }

    public jef(jeg jegVar, jfk jfkVar, int i) {
        this.c = i;
        this.a = jfkVar;
        this.b = jegVar;
    }
}
