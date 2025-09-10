package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tkc implements tiw {
    @Override // defpackage.tiw
    public final tiv a(tih tihVar, tmk tmkVar) {
        if (tmkVar.a == Date.class) {
            return new tkd();
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
