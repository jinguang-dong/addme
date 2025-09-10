package defpackage;

import androidx.wear.ambient.SharedLibraryVersion;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dlw implements aim {
    public final dme a;
    private final /* synthetic */ aim b;

    public dlw(dme dmeVar, aim aimVar) {
        this.b = aimVar;
        this.a = dmeVar;
    }

    public static /* synthetic */ int f(dlw dlwVar, int i) {
        Object obj;
        dlq dlqVar = (dlq) dlwVar.a.a.a();
        List list = dlqVar.d;
        if (list.isEmpty()) {
            return 0;
        }
        if (!g(dlwVar, i)) {
            return ((SharedLibraryVersion.b(dlqVar) + dlqVar.f) * (i - dlqVar.a)) - dlqVar.b;
        }
        if (i == dlqVar.a) {
            return -dlqVar.b;
        }
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (((dlr) obj).a == i) {
                break;
            }
            i2++;
        }
        dlr dlrVar = (dlr) obj;
        return (dlrVar != null ? dlrVar.d : 0) - (((int) (dlqVar.c() & 4294967295L)) / 2);
    }

    public static final boolean g(dlw dlwVar, int i) {
        return i <= dlwVar.e() && dlwVar.d() <= i;
    }

    @Override // defpackage.aim
    public final float a(float f) {
        return this.b.a(f);
    }

    public final int b() {
        return ((dlq) this.a.a.a()).a;
    }

    public final int c() {
        return ((dlq) this.a.a.a()).b;
    }

    public final int d() {
        dlr dlrVar = (dlr) ske.bD(this.a.k().d);
        if (dlrVar != null) {
            return dlrVar.a;
        }
        return 0;
    }

    public final int e() {
        dlr dlrVar = (dlr) ske.bG(this.a.k().d);
        if (dlrVar != null) {
            return dlrVar.a;
        }
        return 0;
    }

    public final void h(int i) {
        dme.l(this.a, i);
    }
}
