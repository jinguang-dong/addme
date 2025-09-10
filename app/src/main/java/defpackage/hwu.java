package defpackage;

import com.google.googlex.gcam.GyroSampleVector;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hwu implements pla {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hwu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [inu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [inu, java.lang.Object] */
    @Override // defpackage.pla
    public final void a(List list) {
        int i = this.b;
        if (i == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object obj = this.a;
                pld pldVar = (pld) it.next();
                hwv hwvVar = (hwv) obj;
                if (hwvVar.a) {
                    hwvVar.c.b(pldVar.f, pldVar.g, pldVar.h, pldVar.e);
                } else {
                    hwvVar.c.b(pldVar.f, -pldVar.g, -pldVar.h, pldVar.e);
                }
            }
            return;
        }
        if (i == 1) {
            this.a.addAll(list);
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Object obj2 = this.a;
            pld pldVar2 = (pld) it2.next();
            ((GyroSampleVector) obj2).b(pldVar2.e, pldVar2.f, pldVar2.g, pldVar2.h);
        }
    }
}
