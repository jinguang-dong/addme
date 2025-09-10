package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class and implements aim {
    public final /* synthetic */ ank a;
    private final /* synthetic */ aim b;

    public and(aim aimVar, ank ankVar) {
        this.a = ankVar;
        this.b = aimVar;
    }

    @Override // defpackage.aim
    public final float a(float f) {
        return this.b.a(f);
    }

    public final int b() {
        return this.a.f();
    }

    public final int c() {
        return this.a.g();
    }

    public final int d() {
        anb anbVar = (anb) ske.bG(this.a.j().i);
        if (anbVar != null) {
            return anbVar.a;
        }
        return 0;
    }

    public final void e(int i, int i2) {
        this.a.l(i, i2);
    }

    public final int f(int i) {
        Object obj;
        ana anaVarJ = this.a.j();
        List list = anaVarJ.i;
        if (list.isEmpty()) {
            return 0;
        }
        int iB = b();
        if (i > d() || iB > i) {
            return (akg.i(anaVarJ) * (i - b())) - c();
        }
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (((anb) obj).a == i) {
                break;
            }
            i2++;
        }
        anb anbVar = (anb) obj;
        if (anbVar == null) {
            return 0;
        }
        return anbVar.g;
    }
}
