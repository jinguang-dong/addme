package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fmy implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public fmy(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        return this.b != 0 ? b() : b();
    }

    public final Function b() {
        if (this.b != 0) {
            gzi gziVar = gyi.a;
            return new fik(16);
        }
        gzi gziVar2 = gyi.a;
        return new fik(15);
    }
}
