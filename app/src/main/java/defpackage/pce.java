package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pce implements pcf {
    private final pjp a;
    private final List b;
    private int c;

    public pce(pjp pjpVar) {
        this.a = pjpVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        try {
            arrayList.addAll(pjpVar.g());
        } catch (pjt | pjv | pjw unused) {
        }
        this.c = 0;
    }

    @Override // defpackage.pcf
    public final pjo a() {
        List list = this.b;
        if (this.c == list.size()) {
            return null;
        }
        pjp pjpVar = this.a;
        int i = this.c;
        this.c = i + 1;
        return pjpVar.a((pjr) list.get(i));
    }

    @Override // defpackage.pcf
    public final void b() {
        this.c = 0;
    }
}
