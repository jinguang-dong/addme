package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cgt implements uiv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cgt(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, uiw] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.text.Spannable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, uiq] */
    @Override // defpackage.uiv
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        if (i == 0) {
            cdh cdhVar = (cdh) obj;
            int iIntValue = ((Integer) obj2).intValue();
            int iIntValue2 = ((Integer) obj3).intValue();
            cfd cfdVar = cdhVar.f;
            cfp cfpVar = cdhVar.c;
            if (cfpVar == null) {
                cfpVar = cfp.e;
            }
            ?? r3 = this.b;
            ?? r7 = this.a;
            cfj cfjVar = cdhVar.d;
            cfj cfjVar2 = new cfj();
            cfk cfkVar = cdhVar.e;
            r7.setSpan(new cem((Typeface) r3.e(cfdVar, cfpVar, cfjVar2, new cfk())), iIntValue, iIntValue2, 33);
            return ufg.a;
        }
        if (i != 1) {
            if (i != 2) {
                Object obj4 = this.a;
                ujk.m(this.b, obj4, (uhf) obj3);
                return ufg.a;
            }
            int iIntValue3 = ((Integer) obj).intValue();
            int iIntValue4 = ((Integer) obj2).intValue();
            long j = ((cho) this.a).a;
            Object obj5 = this.b;
            return ((dmw) obj5).ds(chp.c(j, iIntValue3), chp.b(j, iIntValue4), ufx.a, (uiq) obj3);
        }
        Object obj6 = this.a;
        bpv bpvVar = (bpv) obj;
        bpv bpvVar2 = (bpv) obj2;
        bkf bkfVar = (bkf) obj3;
        ahn ahnVar = (ahn) obj6;
        ahnVar.f = 0L;
        if (((Boolean) ahnVar.b.a(bpvVar)).booleanValue()) {
            if (!ahnVar.e) {
                if (ahnVar.d == null) {
                    ahnVar.d = ukc.P(Integer.MAX_VALUE, 0, null, 6);
                }
                ahnVar.e = true;
                ukc.C(((bij) obj6).C(), null, 0, new ahm(ahnVar, null), 3);
            }
            akg.t((bqo) this.b, bpvVar);
            long jAc = a.ac(bpvVar2.c, bkfVar.a);
            uqm uqmVar = ahnVar.d;
            if (uqmVar != null) {
                uqmVar.j(new agv(jAc));
            }
        }
        return ufg.a;
    }

    public /* synthetic */ cgt(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
