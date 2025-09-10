package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aok implements uiq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ aok(abr abrVar, abz abzVar, uiq uiqVar, ujw ujwVar, int i) {
        this.e = i;
        this.b = abrVar;
        this.a = abzVar;
        this.d = uiqVar;
        this.c = ujwVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r6v2, types: [apm, java.lang.Object] */
    @Override // defpackage.uiq
    public final Object a(Object obj) {
        if (this.e == 0) {
            owd owdVar = new owd((got) this.b, (hls) this.c, (apm) this.d);
            Object obj2 = this.a;
            ((aov) obj2).f = owdVar;
            return new aog(obj2, 2);
        }
        abx abxVar = (abx) obj;
        Object obj3 = this.b;
        abr abrVar = (abr) obj3;
        abz abzVar = abrVar.a;
        byi.aZ(abxVar, abzVar);
        Object objB = abrVar.b(abxVar.a());
        boolean zAo = a.ao(objB, abxVar.a());
        ?? r4 = this.d;
        if (!zAo) {
            Object obj4 = this.a;
            abzVar.c(objB);
            ((abz) obj4).c(objB);
            if (r4 != 0) {
                r4.a(obj3);
            }
            Object obj5 = this.c;
            abxVar.b();
            ((ujw) obj5).a = true;
        } else if (r4 != 0) {
            r4.a(obj3);
        }
        return ufg.a;
    }

    public /* synthetic */ aok(aov aovVar, got gotVar, hls hlsVar, apm apmVar, int i) {
        this.e = i;
        this.a = aovVar;
        this.b = gotVar;
        this.c = hlsVar;
        this.d = apmVar;
    }
}
