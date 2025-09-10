package defpackage;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwi {
    public Object a;
    public Object b;

    public cwi() {
        this.a = new float[64];
    }

    public static /* synthetic */ ArrayList c(cwi cwiVar, String str) {
        ArrayList arrayList = new ArrayList();
        cwiVar.b(str, arrayList);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [cwf, java.lang.Object] */
    public final void a(cwh cwhVar, cwa cwaVar) {
        cwb cwbVarA = cwaVar.a();
        this.a = cok.i((cwb) this.a, cwbVarA);
        this.b.a(cwhVar, cwaVar);
        this.a = cwbVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x043e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4, types: [long] */
    /* JADX WARN: Type inference failed for: r28v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r41, java.util.ArrayList r42) {
        /*
            Method dump skipped, instructions count: 1856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwi.b(java.lang.String, java.util.ArrayList):void");
    }

    public cwi(uiq uiqVar, umk umkVar) {
        this.a = uiqVar;
        this.b = umkVar;
    }

    public cwi(cwg cwgVar, cwb cwbVar) {
        Object cwsVar;
        cwbVar.getClass();
        cwl cwlVar = cwl.a;
        boolean z = cwgVar instanceof cwf;
        boolean z2 = cwgVar instanceof cvt;
        if (z && z2) {
            cwsVar = new cvu((cvt) cwgVar, (cwf) cwgVar);
        } else if (z2) {
            cwsVar = new cvu((cvt) cwgVar, null);
        } else if (z) {
            cwsVar = (cwf) cwgVar;
        } else {
            Class<?> cls = cwgVar.getClass();
            if (cwl.a.a(cls) == 2) {
                Object obj = cwl.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    cwsVar = new cxl(cwl.b((Constructor) list.get(0), cwgVar), 0);
                } else {
                    int size = list.size();
                    cvv[] cvvVarArr = new cvv[size];
                    for (int i = 0; i < size; i++) {
                        cvvVarArr[i] = cwl.b((Constructor) list.get(i), cwgVar);
                    }
                    cwsVar = new cxl(cvvVarArr, 1);
                }
            } else {
                cwsVar = new cws(cwgVar);
            }
        }
        this.b = cwsVar;
        this.a = cwbVar;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, uiq] */
    public cwi(byte[] bArr) {
        byz byzVar = adu.a;
        Float fValueOf = Float.valueOf(0.0f);
        this.a = new abz(byzVar, fValueOf, (ace) byzVar.a.a(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
