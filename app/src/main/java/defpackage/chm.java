package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chm implements uiu {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public chm(bbo bboVar, alv alvVar, uiv uivVar, int i) {
        this.d = i;
        this.c = bboVar;
        this.b = alvVar;
        this.a = uivVar;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [bbo, java.lang.Object] */
    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            ayc aycVar = (ayc) obj;
            int iIntValue = ((Number) obj2).intValue();
            int i2 = iIntValue & 3;
            if (aycVar.H(i2 != 2, iIntValue & 1)) {
                Object objF = aycVar.f();
                if (objF == ayb.a) {
                    objF = new azw(0);
                    aycVar.w(objF);
                }
                Object obj3 = this.a;
                bbd bbdVar = (bbd) objF;
                atn.c(null, null, null, null, null, bdq.k(958604965, new ars(obj3, bbdVar, 12, null), aycVar), 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, bdq.k(57310875, new dmv((String) this.b, (String) this.c, (Object[]) obj3, bbdVar, 1), aycVar), aycVar, ImageMetadata.EDGE_MODE, 12582912);
            } else {
                aycVar.r();
            }
            return ufg.a;
        }
        if (i == 1) {
            ayc aycVar2 = (ayc) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && aycVar2.G()) {
                aycVar2.r();
            } else {
                bay.K(arz.a.b(Float.valueOf(bkv.a(acv.g(this.c)))), bdq.k(-869936862, new ars(this.b, this.a, 2), aycVar2), aycVar2, 56);
            }
            return ufg.a;
        }
        ayc aycVar3 = (ayc) obj;
        int iIntValue2 = ((Number) obj2).intValue();
        if (aycVar3.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
            Object obj4 = this.b;
            Object obj5 = this.c;
            Object[] objArr = (Object[]) this.a;
            chk.a((String) obj4, (String) obj5, aycVar3, Arrays.copyOf(objArr, objArr.length));
        } else {
            aycVar3.r();
        }
        return ufg.a;
    }

    public chm(String str, String str2, Object[] objArr, int i) {
        this.d = i;
        this.b = str;
        this.c = str2;
        this.a = objArr;
    }

    public chm(Object[] objArr, String str, String str2, int i) {
        this.d = i;
        this.a = objArr;
        this.b = str;
        this.c = str2;
    }
}
