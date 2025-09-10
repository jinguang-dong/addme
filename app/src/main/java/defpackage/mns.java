package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.ar.core.R;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mns {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public mns(hbj hbjVar, owf owfVar, jho jhoVar, owf owfVar2, owf owfVar3, owf owfVar4) {
        this.e = hbjVar;
        this.a = owfVar;
        this.d = jhoVar;
        this.b = owfVar2;
        this.c = owfVar3;
        this.f = owfVar4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, owf] */
    private final boolean d() {
        return ((jho) this.d).c((nkw) this.a.dL());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, owf] */
    private final boolean e() {
        boolean zP = ((hbj) this.e).p(gyf.c);
        ?? r4 = this.a;
        return zP && (((nkw) r4.dL()).equals(nkw.PHOTO) || ((nkw) r4.dL()).equals(nkw.PORTRAIT));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, owf] */
    public final boolean a(kow kowVar) {
        return (e() && kowVar.a()) || (d() && ((Boolean) this.f.dL()).booleanValue() && !((jhr) this.c.dL()).equals(jhr.ZSL)) || ((Boolean) this.b.dL()).booleanValue();
    }

    public final boolean b() {
        if (d() || e()) {
            return true;
        }
        return ((hbj) this.e).o(hal.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, pjp] */
    public final void c(kgt kgtVar) {
        qqq qqqVar = (qqq) this.d;
        pka pkaVar = fdo.i((Intent) qqqVar.a) ? pka.FRONT : pka.BACK;
        ((gnt) qqqVar.b).f(pkaVar);
        Object obj = qqqVar.e;
        ?? r3 = qqqVar.c;
        pjr pjrVarA = ((hfy) obj).a(r3, (hbj) qqqVar.d, pkaVar);
        if (pjrVarA == null) {
            pjrVarA = ((pkc) r3).b();
            pjrVarA.getClass();
        }
        jtd jtdVarD = ((mwq) this.f).D(pjrVarA, kgtVar.j);
        if (((hbj) this.e).p(gzo.bF)) {
            ojl.cj(this.a, new jas(this, jtdVarD, 2));
        }
        ojl.cj(kgtVar.b(jtdVarD, this.a), new paf() { // from class: kgv
            @Override // defpackage.paf
            public final void a(Object obj2) {
            }
        });
        fdq fdqVar = (fdq) this.c;
        fdqVar.i().d(new iew(kgtVar, 18));
        fdqVar.j().d(new iew(kgtVar, 19));
    }

    public mns(lyq lyqVar, ocq ocqVar, ktx ktxVar, pbn pbnVar, imi imiVar, owf owfVar) {
        this.a = lyqVar;
        this.c = ocqVar;
        this.d = ktxVar;
        this.b = pbnVar;
        this.e = imiVar;
        this.f = owfVar;
    }

    public mns(mwq mwqVar, qqq qqqVar, syu syuVar, hbj hbjVar, out outVar, fdq fdqVar) {
        this.f = mwqVar;
        this.d = qqqVar;
        this.a = syuVar;
        this.e = hbjVar;
        this.b = outVar;
        this.c = fdqVar;
    }

    public mns(Context context, imi imiVar, jmw jmwVar, owq owqVar) {
        this.a = new ArrayDeque();
        this.c = imiVar;
        this.b = owqVar;
        this.e = jmwVar;
        nao naoVar = new nao();
        naoVar.h = context;
        naoVar.e = context.getResources().getString(R.string.thermal_flash_disabled_chip_text);
        naoVar.a = true;
        naoVar.j = 12;
        this.f = naoVar.a();
        naoVar.e = context.getResources().getString(R.string.long_shot_record_failed_text);
        naoVar.a = false;
        naoVar.j = 12;
        this.d = naoVar.a();
    }
}
