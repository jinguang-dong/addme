package defpackage;

import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xc extends xb implements xf {
    public final int a;
    final /* synthetic */ xe c;

    public xc(xe xeVar, int i) {
        this.c = xeVar;
        this.a = i;
    }

    @Override // defpackage.xb
    protected final void a() throws Exception {
        umr umrVar = this.b;
        Object obj = null;
        if (umrVar.v() && !umrVar.fZ()) {
            Object obj2 = ((xi) umrVar.fY()).a;
            if (true == xi.a(obj2)) {
                obj = obj2;
            }
        }
        xt xtVar = (xt) obj;
        if (xtVar != null) {
            xtVar.close();
        }
    }

    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, xt] */
    @Override // defpackage.xf
    public final void b(Object obj) throws Exception {
        Object obj2;
        int i;
        Object obj3;
        xd xdVar;
        xt xsVar;
        if (true != xi.a(obj)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        xr xrVar = (xr) obj2;
        if (xrVar != null) {
            if (xrVar instanceof xt) {
                xsVar = ((xt) xrVar).a();
            } else {
                int i2 = ukb.a;
                ?? C = xrVar.c(new uji(xt.class));
                if (C != 0) {
                    xsVar = C.a();
                } else {
                    xsVar = new xs(xrVar, new tdy(xrVar, xl.a));
                }
            }
            if (!this.b.O(new xi(xsVar))) {
                xsVar.close();
            }
        } else {
            umr umrVar = this.b;
            if (xi.a(obj)) {
                i = 1;
            } else {
                i = ((qp) obj).a;
            }
            umrVar.O(new xi(new qp(i)));
        }
        xe xeVar = this.c;
        List list = xeVar.d;
        int iB = xeVar.f.b();
        int i3 = ((ugl) list).c;
        CopyOnWriteArrayList copyOnWriteArrayList = xeVar.g;
        int size = copyOnWriteArrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((qa) copyOnWriteArrayList.get(i4)).d();
        }
        if (iB == i3) {
            int size2 = copyOnWriteArrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((qa) copyOnWriteArrayList.get(i5)).c();
            }
            umb umbVar = xeVar.e;
            do {
                obj3 = umbVar.a;
                xd xdVar2 = (xd) obj3;
                int iOrdinal = xdVar2.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        xdVar = xd.d;
                    } else {
                        throw new IllegalStateException(mn.e((byte) 32, xdVar2, xeVar, "Unexpected frame state for ", oUZhwRhE.UHcaogVTqSIh));
                    }
                } else {
                    xdVar = xd.c;
                }
            } while (!umbVar.d(obj3, xdVar));
            if (xdVar == xd.d) {
                xeVar.a();
            }
        }
    }
}
