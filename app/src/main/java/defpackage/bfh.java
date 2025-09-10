package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfh implements uiu, uiv, uiw, uix, uiy, uiz, uja, ujb, uig, uih, uij, uik, uil, uim, uin, uio, uip, uir, uis {
    public final boolean a;
    public Object b;
    public List c;
    public bai d;
    private final int e;

    public bfh(int i, boolean z, Object obj) {
        this.e = i;
        this.a = z;
        this.b = obj;
    }

    private final void f(ayc aycVar) {
        bai baiVarO;
        if (!this.a || (baiVarO = ((ayg) aycVar).O()) == null) {
            return;
        }
        baiVarO.n();
        if (bdq.j(this.d, baiVarO)) {
            this.d = baiVarO;
            return;
        }
        List list = this.c;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(baiVarO);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (bdq.j((bai) list.get(i), baiVarO)) {
                list.set(i, baiVarO);
                return;
            }
        }
        list.add(baiVarO);
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return b((ayc) obj, ((Number) obj2).intValue());
    }

    public final Object b(ayc aycVar, int i) {
        ayc aycVarC = aycVar.c(this.e);
        f(aycVarC);
        int iH = i | (aycVarC.B(this) ? bdq.h(0) : bdq.i(0));
        Object obj = this.b;
        obj.getClass();
        ukc.e(obj, 2);
        Object objA = ((uiu) obj).a(aycVarC, Integer.valueOf(iH));
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new bfg(this);
        }
        return objA;
    }

    public final Object c(Object obj, ayc aycVar, int i) {
        ayc aycVarC = aycVar.c(this.e);
        f(aycVarC);
        int iH = aycVarC.B(this) ? bdq.h(1) : bdq.i(1);
        Object obj2 = this.b;
        obj2.getClass();
        ukc.e(obj2, 3);
        Object objA = ((uiv) obj2).a(obj, aycVarC, Integer.valueOf(iH | i));
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aqb(this, obj, i, 7);
        }
        return objA;
    }

    public final Object d(Object obj, Object obj2, ayc aycVar, int i) {
        ayc aycVarC = aycVar.c(this.e);
        f(aycVarC);
        int iH = aycVarC.B(this) ? bdq.h(2) : bdq.i(2);
        Object obj3 = this.b;
        obj3.getClass();
        ukc.e(obj3, 4);
        Object objE = ((uiw) obj3).e(obj, obj2, aycVarC, Integer.valueOf(iH | i));
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new apc(this, obj, obj2, i, 5);
        }
        return objE;
    }

    @Override // defpackage.uiw
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (ayc) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return c(obj, (ayc) obj2, ((Number) obj3).intValue());
    }
}
