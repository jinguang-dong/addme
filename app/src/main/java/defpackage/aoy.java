package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aoy implements uiq {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aoy(float f, ujx ujxVar, aim aimVar, int i) {
        this.d = i;
        this.a = f;
        this.b = ujxVar;
        this.c = aimVar;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [aim, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r1v18, types: [bst, java.lang.Object] */
    @Override // defpackage.uiq
    public final Object a(Object obj) {
        int i = this.d;
        float fK = 0.0f;
        if (i == 0) {
            abx abxVar = (abx) obj;
            float f = this.a;
            if (f > 0.0f) {
                fK = ukc.l(((Number) abxVar.a()).floatValue(), f);
            } else if (f < 0.0f) {
                fK = ukc.k(((Number) abxVar.a()).floatValue(), f);
            }
            Object obj2 = this.c;
            ujx ujxVar = (ujx) this.b;
            float f2 = fK - ujxVar.a;
            if (f2 != ((and) obj2).a(f2) || fK != ((Number) abxVar.a()).floatValue()) {
                abxVar.b();
            }
            ujxVar.a += f2;
            return ufg.a;
        }
        if (i != 1) {
            if (i == 2) {
                btd.q((btd) obj, (bte) this.b, 0, -this.c.mo0do(this.a));
                return ufg.a;
            }
            abx abxVar2 = (abx) obj;
            float f3 = this.a;
            if (f3 > 0.0f) {
                fK = ukc.l(((Number) abxVar2.a()).floatValue(), f3);
            } else if (f3 < 0.0f) {
                fK = ukc.k(((Number) abxVar2.a()).floatValue(), f3);
            }
            ?? r0 = this.c;
            ujx ujxVar2 = (ujx) this.b;
            float f4 = fK - ujxVar2.a;
            if (f4 != r0.a(f4) || fK != ((Number) abxVar2.a()).floatValue()) {
                abxVar2.b();
            }
            ujxVar2.a += f4;
            return ufg.a;
        }
        long jLongValue = ((Long) obj).longValue();
        ajs ajsVar = (ajs) this.c;
        long j = ajsVar.c;
        if (j == Long.MIN_VALUE) {
            ajsVar.c = jLongValue;
            j = jLongValue;
        }
        float f5 = this.a;
        float f6 = ajsVar.e;
        aca acaVar = new aca(f6);
        long jA = f5 == 0.0f ? ajsVar.b.a(new aca(f6), ajs.a, ajsVar.d) : ukj.y((jLongValue - j) / f5);
        ?? r12 = this.b;
        adv advVar = ajsVar.b;
        aca acaVar2 = ajs.a;
        float f7 = ((aca) advVar.c(jA, acaVar, acaVar2, ajsVar.d)).a;
        ajsVar.d = (aca) advVar.d(jA, acaVar, acaVar2, ajsVar.d);
        ajsVar.c = jLongValue;
        float f8 = ajsVar.e - f7;
        ajsVar.e = f7;
        r12.a(Float.valueOf(f8));
        return ufg.a;
    }

    public /* synthetic */ aoy(ajs ajsVar, float f, uiq uiqVar, int i) {
        this.d = i;
        this.c = ajsVar;
        this.a = f;
        this.b = uiqVar;
    }

    public /* synthetic */ aoy(bte bteVar, bst bstVar, float f, int i) {
        this.d = i;
        this.b = bteVar;
        this.c = bstVar;
        this.a = f;
    }
}
