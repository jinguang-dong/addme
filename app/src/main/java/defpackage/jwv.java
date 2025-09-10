package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwv implements paf {
    final /* synthetic */ String a;
    final /* synthetic */ jeu b;
    final /* synthetic */ oge c;

    public jwv(oge ogeVar, String str, jeu jeuVar) {
        this.a = str;
        this.b = jeuVar;
        this.c = ogeVar;
    }

    @Override // defpackage.paf
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Set set = ((jxa) this.c.a).C;
        synchronized (set) {
            set.remove(this.a);
        }
        this.b.e(this);
    }
}
