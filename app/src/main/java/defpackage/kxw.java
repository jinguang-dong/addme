package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kxw implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kxw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lqo lqoVar;
        int i = this.b;
        if (i == 0) {
            ((ovx) this.a).a(kxx.a);
            return;
        }
        if (i != 1) {
            Object obj = this.a;
            lbq lbqVar = (lbq) obj;
            lbqVar.c.f("Closing one camera.");
            our ourVar = lbqVar.a;
            ovq ovqVar = lbqVar.d;
            ovt.a(ovqVar, ourVar, "Low Priority OneCameraLifetime");
            ovt.a(ovqVar, lbqVar.b, "Critical Path OneCameraLifetime");
            synchronized (obj) {
                syu syuVar = ((lbq) obj).e;
                if (syuVar != null) {
                    syuVar.cancel(true);
                }
            }
            lbqVar.c.f("OneCamera closed.");
            return;
        }
        Object obj2 = this.a;
        kwn kwnVar = (kwn) obj2;
        int i2 = kwnVar.a;
        while (true) {
            lqoVar = kwnVar.b;
            if (i2 <= 0) {
                break;
            }
            nll nllVar = lqoVar.m;
            rnt.x(nllVar);
            nllVar.b();
            i2--;
        }
        owf owfVar = lqoVar.e;
        if (!((Boolean) owfVar.dL()).booleanValue() && lqoVar.m.a() != 1.0f) {
            nll nllVar2 = lqoVar.m;
            rnt.x(nllVar2);
            if (nllVar2.a > 0) {
                nllVar2.f(1.0f);
            }
        }
        if (((Boolean) owfVar.dL()).booleanValue() && lqoVar.m.a() != 1.0f) {
            nll nllVar3 = lqoVar.m;
            rnt.x(nllVar3);
            nllVar3.c(1.0f);
        }
        lqs lqsVar = lqoVar.f;
        rnt.x(lqsVar);
        lqsVar.setVisibility(8);
        syu syuVarG = lqs.g();
        iwh iwhVar = new iwh(8);
        sxo sxoVar = sxo.a;
        syuVarG.c(iwhVar, sxoVar);
        ske.W(syuVarG, new jcb(obj2, 8), sxoVar);
    }
}
