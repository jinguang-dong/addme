package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.AmbientMode;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bgx implements uiq {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bgx(int i, Collection collection, int i2) {
        this.c = i2;
        this.a = i;
        this.b = collection;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.uiq
    public final Object a(Object obj) {
        int i = this.c;
        if (i == 0) {
            return Boolean.valueOf(((List) obj).addAll(this.a, this.b));
        }
        int i2 = 1;
        if (i == 1) {
            btd btdVar = (btd) obj;
            ?? r0 = this.b;
            int size = r0.size();
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = this.a;
                bte bteVar = (bte) r0.get(i3);
                btd.s(btdVar, bteVar, 0, (i4 - bteVar.b) / 2);
            }
            return ufg.a;
        }
        Object obj2 = null;
        if (i != 2) {
            if (i == 3) {
                ((dnj) this.b).h.f(((Float) obj).floatValue() > 0.0f, this.a);
                return ufg.a;
            }
            if (i == 4) {
                int i5 = this.a;
                gos gosVar = new gos(i5);
                Object obj3 = this.b;
                dql dqlVar = new dql(obj3, gosVar, 6);
                dco dcoVar = (dco) ((got) obj3).c;
                ((Long) dei.a(dcoVar, false, true, dqlVar)).longValue();
                return (gos) dei.a(dcoVar, true, false, new htz(i5, i2));
            }
            ddw ddwVarA = ((ddo) obj).a("UPDATE HardwareHelpDialogCounts SET rebootCount = rebootCount+1 WHERE reason=? AND impressionsBeforeReboot > ?");
            Object obj4 = this.b;
            int i6 = this.a;
            try {
                ddwVarA.e(1, ((gpf) obj4).ordinal());
                ddwVarA.e(2, i6);
                ddwVarA.j();
                return null;
            } finally {
                ddwVarA.close();
            }
        }
        dlh dlhVar = (dlh) this.b;
        blm blmVar = (blm) obj;
        Object objA = dlhVar.d.a();
        objA.getClass();
        List listG = AmbientMode.AmbientCallback.g(dlhVar.h());
        int size2 = listG.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                break;
            }
            int i8 = this.a;
            Object obj5 = listG.get(i7);
            if (((dkl) obj5).a == i8) {
                obj2 = obj5;
                break;
            }
            i7++;
        }
        dkl dklVar = (dkl) obj2;
        if (dklVar != null) {
            blmVar.l(dklVar.f);
            float f = dklVar.e;
            blmVar.s(f);
            blmVar.t(f);
            if (f > 0.0f) {
                blmVar.z(a.aa(dklVar, 0) - AmbientLifecycleObserverKt.d(dklVar));
                blmVar.x(byi.Y(0.0f));
            }
        }
        return ufg.a;
    }

    public /* synthetic */ bgx(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }
}
