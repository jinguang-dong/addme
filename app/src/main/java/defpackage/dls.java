package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dls {
    public final /* synthetic */ long a;
    public final /* synthetic */ dlm b;
    public final /* synthetic */ akp c;
    public final /* synthetic */ cho d;
    public final /* synthetic */ dme e;
    public final /* synthetic */ dmw f;
    public final /* synthetic */ dlk g;
    public final /* synthetic */ bic h;

    public /* synthetic */ dls(dmw dmwVar, long j, dlm dlmVar, akp akpVar, dlk dlkVar, cho choVar, bic bicVar, dme dmeVar) {
        this.f = dmwVar;
        this.a = j;
        this.b = dlmVar;
        this.c = akpVar;
        this.g = dlkVar;
        this.d = choVar;
        this.h = bicVar;
        this.e = dmeVar;
    }

    public final dlr a(int i, int i2, uiq uiqVar) {
        dmw dmwVar = this.f;
        yq yqVar = dmwVar.c;
        List list = (List) yqVar.a(i);
        if (list == null) {
            dlm dlmVar = dmwVar.b;
            Object objD = dlmVar.d(i);
            List listP = dmwVar.a.p(objD, dmwVar.d.j(i, objD, dlmVar.c(i)));
            int size = listP.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((bsq) listP.get(i3)).r(this.a));
            }
            yqVar.f(i, arrayList);
            list = arrayList;
        }
        dlm dlmVar2 = this.b;
        bte bteVar = (bte) ske.bG(list);
        Object objD2 = dlmVar2.d(i);
        int i4 = bteVar != null ? bteVar.b : 0;
        dme dmeVar = this.e;
        bic bicVar = this.h;
        cho choVar = this.d;
        dlk dlkVar = this.g;
        akp akpVar = this.c;
        return new dlr(i, bteVar, choVar.a, i2, dmwVar.mo0do(((akm) akpVar).a), dlkVar.c, dlkVar.b, ((dln) uiqVar.a(Integer.valueOf(i4))).a, bicVar, dmwVar.m(), new aet(dmeVar, objD2, 10), objD2, dlmVar2.c(i), true);
    }
}
