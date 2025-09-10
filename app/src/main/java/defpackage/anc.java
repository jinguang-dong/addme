package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anc {
    public final long a;
    public final amt b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ long h;
    final /* synthetic */ ank i;
    final /* synthetic */ aon j;
    final /* synthetic */ bic k;
    final /* synthetic */ bid l;
    private final aon m;

    public anc(long j, boolean z, amt amtVar, aon aonVar, int i, int i2, bic bicVar, bid bidVar, int i3, int i4, long j2, ank ankVar) {
        this.c = z;
        this.j = aonVar;
        this.d = i;
        this.e = i2;
        this.k = bicVar;
        this.l = bidVar;
        this.f = i3;
        this.g = i4;
        this.h = j2;
        this.i = ankVar;
        this.b = amtVar;
        this.m = aonVar;
        this.a = chp.k(z ? cho.b(j) : Integer.MAX_VALUE, z ? Integer.MAX_VALUE : cho.a(j), 5);
    }

    public final anb a(int i, long j) {
        long j2;
        List list;
        amt amtVar = this.b;
        Object objD = amtVar.d(i);
        amtVar.c(i);
        aon aonVar = this.m;
        yq yqVar = aonVar.c;
        List list2 = (List) yqVar.a(i);
        if (list2 != null) {
            j2 = j;
            list = list2;
        } else {
            amt amtVar2 = aonVar.b;
            Object objD2 = amtVar2.d(i);
            List listP = aonVar.a.p(objD2, aonVar.d.w(i, objD2, amtVar2.c(i)));
            int size = listP.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((bsq) listP.get(i2)).r(j));
            }
            j2 = j;
            yqVar.f(i, arrayList);
            list = arrayList;
        }
        return new anb(i, list, this.c, this.k, this.l, this.j.m(), this.f, this.g, i != this.d + (-1) ? this.e : 0, this.h, objD, this.i.h, j2);
    }

    public final qzx c() {
        return this.b.a;
    }
}
