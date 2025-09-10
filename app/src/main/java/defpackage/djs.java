package defpackage;

import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class djs implements djz {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ djs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, uiq, uiu] */
    @Override // defpackage.djz
    public final djk a(djk djkVar) {
        int i = this.b;
        if (i == 0) {
            return new dkc(djkVar, (AmbientMode.AmbientController) this.a);
        }
        ?? r2 = this.a;
        return i != 1 ? new dkg(djkVar, r2) : new djy(djkVar, r2);
    }
}
